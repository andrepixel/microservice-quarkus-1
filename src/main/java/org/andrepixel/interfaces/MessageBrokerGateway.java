package org.andrepixel.interfaces;

import org.andrepixel.models.TicketModel;
import org.andrepixel.utils.ResponseBroker;


public interface MessageBrokerGateway  {
    public ResponseBroker sendMessage(TicketModel message);
}
