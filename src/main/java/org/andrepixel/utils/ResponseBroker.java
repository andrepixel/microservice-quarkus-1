package org.andrepixel.utils;

import org.andrepixel.models.TicketModel;

public class ResponseBroker {

  private TicketModel message;
  private Boolean isSuccess;

  public ResponseBroker() {}

  public TicketModel getMessage() {
    return message;
  }

  public void setMessage(TicketModel model) {
    if (getIsSuccess() == true) {
      this.message = model;
    }
  }

  public Boolean getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }
}
