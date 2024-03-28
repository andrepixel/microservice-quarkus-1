package org.andrepixel.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.andrepixel.enums.ListOfCompanies;
import org.andrepixel.enums.StatusOfTicket;

public class TicketModel {
    private UUID id;
    private SectionModel section;
    private ClientModel client;
    private LocalDateTime dateOfTicketGenerated;
    private StatusOfTicket statusOfTicket;
    private ListOfCompanies listOfCompanies;

    public TicketModel() {}

    public UUID getId() {
        return id;
    }

    public void setId(
            UUID id) {
        this.id = id;
    }

    public SectionModel getSection() {
        return section;
    }

    public void setSection(
            SectionModel section) {
        this.section = section;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(
            ClientModel client) {
        this.client = client;
    }

    public LocalDateTime getDateOfTicketGenerated() {
        return dateOfTicketGenerated;
    }

    public void setDateOfTicketGenerated(
            LocalDateTime dateOfTicketGenerated) {
        this.dateOfTicketGenerated = dateOfTicketGenerated;
    }

    public StatusOfTicket getStatusOfTicket() {
        return statusOfTicket;
    }

    public void setStatusOfTicket(
            StatusOfTicket statusOfTicket) {
        this.statusOfTicket = statusOfTicket;
    }

    public ListOfCompanies getListOfCompanies() {
        return listOfCompanies;
    }

    public void setListOfCompanies(
            ListOfCompanies listOfCompanies) {
        this.listOfCompanies = listOfCompanies;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((id == null)
                        ? 0
                        : id.hashCode());
        result = prime
                * result
                + ((section == null)
                        ? 0
                        : section
                                .hashCode());
        result = prime
                * result
                + ((client == null)
                        ? 0
                        : client.hashCode());
        result = prime
                * result
                + ((dateOfTicketGenerated == null)
                        ? 0
                        : dateOfTicketGenerated
                                .hashCode());
        result = prime
                * result
                + ((statusOfTicket == null)
                        ? 0
                        : statusOfTicket
                                .hashCode());
        result = prime
                * result
                + ((listOfCompanies == null)
                        ? 0
                        : listOfCompanies
                                .hashCode());
        return result;
    }

    @Override
    public boolean equals(
            Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj
                .getClass())
            return false;
        TicketModel other = (TicketModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id
                .equals(other.id))
            return false;
        if (section == null) {
            if (other.section != null)
                return false;
        } else if (!section
                .equals(other.section))
            return false;
        if (client == null) {
            if (other.client != null)
                return false;
        } else if (!client
                .equals(other.client))
            return false;
        if (dateOfTicketGenerated == null) {
            if (other.dateOfTicketGenerated != null)
                return false;
        } else if (!dateOfTicketGenerated
                .equals(other.dateOfTicketGenerated))
            return false;
        if (statusOfTicket != other.statusOfTicket)
            return false;
        if (listOfCompanies != other.listOfCompanies)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TicketModel [id="
                + id
                + ", section="
                + section
                + ", client="
                + client
                + ", dateOfTicketGenerated="
                + dateOfTicketGenerated
                + ", statusOfTicket="
                + statusOfTicket
                + ", listOfCompanies="
                + listOfCompanies
                + "]";
    }
}
