package org.andrepixel.gateways;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;
import java.util.UUID;
import org.andrepixel.interfaces.MessageBrokerGatewayInterface;
import org.eclipse.microprofile.config.inject.ConfigProperty;
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
  public boolean sendMessage(byte[] message) {
    SendMessageResponse sendMessage = client.sendMessage(m ->
      m
        .messageGroupId("sqsQueueName")
        .messageDeduplicationId(UUID.randomUUID().toString())
        .messageBody(message.toString())
    );

    return sendMessage.sdkHttpResponse().isSuccessful();
  }
}
