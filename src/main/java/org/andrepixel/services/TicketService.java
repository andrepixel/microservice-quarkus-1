package org.andrepixel.services;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

import org.andrepixel.interfaces.GeneratedTicketInterface;
import org.andrepixel.interfaces.MessageBrokerGatewayInterface;
import org.andrepixel.models.TicketModel;
import org.andrepixel.utils.ResponseBroker;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.jboss.logging.Logger;

@ApplicationScoped
public class TicketService {

  private static final Logger LOGGER = Logger.getLogger(TicketService.class);

  private int counterOfTicket = 1;

  private GeneratedTicketInterface generatedTicket;

  private MessageBrokerGatewayInterface messageBrokerGateway;

  public TicketService(
    GeneratedTicketInterface generatedTicket,
    MessageBrokerGatewayInterface messageBrokerGateway
  ) {
    this.generatedTicket = generatedTicket;
    this.messageBrokerGateway = messageBrokerGateway;
  }

  @Scheduled(every = "3s")
  @Fallback(fallbackMethod = "fallback")
  @CircuitBreaker(
    requestVolumeThreshold = 5,
    failureRatio = 0.5,
    successThreshold = 3,
    delay = 3000
  )
  public void processTicketToSqs() {
    TicketModel ticket = generatedTicket.generateTicket();

    ResponseBroker messageSend = messageBrokerGateway.sendMessage(ticket);

    if (messageSend.getIsSuccess() == true) {
      LOGGER.info(
        "Send Ticket " + counterOfTicket + " to SQS - " + messageSend.getMessage() + "\n"
      );
    }

    counterOfTicket++;
  }

  public void fallback() {
    LOGGER.info("SQS service is dead");
  }
}
