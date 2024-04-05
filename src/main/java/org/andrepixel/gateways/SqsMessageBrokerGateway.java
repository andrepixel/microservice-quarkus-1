package org.andrepixel.gateways;

import java.util.Optional;
import java.util.UUID;

import org.andrepixel.interfaces.MessageBrokerGatewayInterface;
import org.andrepixel.models.TicketModel;
import org.andrepixel.utils.ResponseBroker;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageResponse;

@ApplicationScoped
public class SqsMessageBrokerGateway implements MessageBrokerGatewayInterface {

  private SqsClient client;

  @ConfigProperty(name = "sqs-queue-name")
  private Optional<String> sqsQueueName;

  public SqsMessageBrokerGateway(SqsClient client) {
    this.client = client;
  }

  @Override
  public ResponseBroker sendMessage(TicketModel message) {
    SendMessageResponse sendMessage = client.sendMessage(m ->
      m
        .messageGroupId("sqsQueueName")
        .messageDeduplicationId(UUID.randomUUID().toString())
        .messageBody(message.toString())
    );

    boolean isSuccess = sendMessage.sdkHttpResponse().isSuccessful();
    
    ResponseBroker response = new ResponseBroker();
    response.setIsSuccess(isSuccess);
    response.setMessage(message);

    return response;
  }
}
