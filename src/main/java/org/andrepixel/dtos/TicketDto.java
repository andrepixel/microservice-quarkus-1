package org.andrepixel.dtos;

import java.time.LocalDateTime;
import java.util.UUID;
import org.andrepixel.enums.ListOfCompanies;
import org.andrepixel.enums.StatusOfTicket;
import org.andrepixel.models.ClientModel;
import org.andrepixel.models.SectionModel;

public record TicketDto(
  UUID id,
  SectionModel section,
  ClientModel client,
  LocalDateTime dateOfTicketGenerated,
  StatusOfTicket statusOfTicket,
  ListOfCompanies listOfCompanies
) {}
