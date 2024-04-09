package org.andrepixel.interfaces;

import org.andrepixel.models.TicketModel;

public interface ParseTicketDtoInterface {
  public <T extends TicketModel> Object parseTicketToDto(T ticket);
}
