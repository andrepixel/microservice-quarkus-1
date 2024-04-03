package org.andrepixel.interfaces;

import org.andrepixel.models.TicketModel;
import org.andrepixel.utils.ResponseBroker;

public interface SendMessageInterface {
    public ResponseBroker sendMessage(TicketModel message);
}
