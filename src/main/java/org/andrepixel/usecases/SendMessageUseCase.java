package org.andrepixel.usecases;

import jakarta.enterprise.context.ApplicationScoped;
import org.andrepixel.interfaces.MessageBrokerGatewayInterface;
import org.andrepixel.interfaces.SendMessageInterface;

@ApplicationScoped
public class SendMessageUseCase implements SendMessageInterface {

  private MessageBrokerGatewayInterface messageBrokerGateway;

  public SendMessageUseCase(
    MessageBrokerGatewayInterface messageBrokerGateway
  ) {
    this.messageBrokerGateway = messageBrokerGateway;
  }

  @Override
  public boolean sendMessage(byte[] payload) {
    return messageBrokerGateway.sendMessage(payload);
  }
}
