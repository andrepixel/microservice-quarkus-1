package org.andrepixel.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import net.bytebuddy.utility.JavaModule;
import org.andrepixel.dtos.WrapperDto;
import org.andrepixel.interfaces.GeneratedTicketInterface;
import org.andrepixel.interfaces.MessageBrokerGatewayInterface;
import org.andrepixel.models.TicketModel;
import org.andrepixel.usecases.ParseTicketToDtoUseCase;
import org.andrepixel.usecases.ParseTicketToJsonUseCase;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.jboss.logging.Logger;

@ApplicationScoped
public class TicketService {

  private static final Logger LOGGER = Logger.getLogger(TicketService.class);

  private int counterOfTicket = 1;

  private GeneratedTicketInterface generatedTicket;

  private MessageBrokerGatewayInterface messageBrokerGateway;

  private ParseTicketToDtoUseCase parseTicketToDtoUseCase;

  private ParseTicketToJsonUseCase parseTicketToJsonUseCase;

  public TicketService(
    GeneratedTicketInterface generatedTicket,
    MessageBrokerGatewayInterface messageBrokerGateway,
    ParseTicketToDtoUseCase parseTicketToDtoUseCase,
    ParseTicketToJsonUseCase parseTicketToJsonUseCase
  ) {
    this.generatedTicket = generatedTicket;
    this.messageBrokerGateway = messageBrokerGateway;
    this.parseTicketToDtoUseCase = parseTicketToDtoUseCase;
    this.parseTicketToJsonUseCase = parseTicketToJsonUseCase;
  }

  @Scheduled(every = "3s")
  @Fallback(fallbackMethod = "fallback")
  @CircuitBreaker(
    requestVolumeThreshold = 5,
    failureRatio = 0.5,
    successThreshold = 3,
    delay = 3000
  )
  public void processTicketToSqs() throws Exception {
    TicketModel ticket = generatedTicket.generateTicket();

    Object ticketToDto = parseTicketToDtoUseCase.parseTicketToDto(ticket);

    byte[] payload = parseTicketToJsonUseCase.parseDtoToJson(ticketToDto);

    boolean isMessageSended = messageBrokerGateway.sendMessage(payload);

    verifyIfSendedMessage(isMessageSended, payload);

    counterOfTicket++;
  }

  private void fallback(Exception exception) {
    LOGGER.info("SQS service is dead");
    LOGGER.info(exception.getMessage());
  }

  private void verifyIfSendedMessage(boolean isMessageSended, byte[] payload)
    throws Exception {
    WrapperDto message = new ObjectMapper()
      .registerModule(new JavaTimeModule())
      .readValue(payload, WrapperDto.class);

    if (isMessageSended == true) {
      LOGGER.info(
        "Send Ticket " + counterOfTicket + " to SQS - " + message + "\n"
      );
    }
  }
}
