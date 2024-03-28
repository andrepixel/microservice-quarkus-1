package org.andrepixel.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.andrepixel.enums.ListOfCompanies;
import org.andrepixel.enums.StatusOfTicket;

public class TicketModel {
    public final UUID id;
    public final SectionModel section;
    public final ClientModel client;
    public final LocalDateTime dateOfTicketGenerated;
    public final StatusOfTicket statusOfTicket;
    public final ListOfCompanies listOfCompanies;

    public TicketModel(
            UUID id,
            SectionModel section,
            ClientModel client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies) {
        this.id = id;
        this.section = section;
        this.client = client;
        this.dateOfTicketGenerated = dateOfTicketGenerated;
        this.statusOfTicket = statusOfTicket;
        this.listOfCompanies = listOfCompanies;
    }
}
