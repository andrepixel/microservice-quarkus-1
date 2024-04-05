package org.andrepixel.usecases;

import org.andrepixel.interfaces.MessageBrokerGatewayInterface;
import org.andrepixel.interfaces.SendMessageInterface;
import org.andrepixel.models.TicketModel;
import org.andrepixel.utils.ResponseBroker;
import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SendMessageUseCase implements SendMessageInterface {

  private static final Logger LOGGER = Logger.getLogger(
    SendMessageUseCase.class
  );

  private MessageBrokerGatewayInterface messageBrokerGateway;

  public SendMessageUseCase(MessageBrokerGatewayInterface messageBrokerGateway) {
    this.messageBrokerGateway = messageBrokerGateway;
  }

  @Override
  public ResponseBroker sendMessage(TicketModel message) {
    ResponseBroker messageSend = messageBrokerGateway.sendMessage(message);

    return messageSend;
  }
}
