package org.andrepixel.models;

import org.andrepixel.enums.State;

public class AddressModel {
    private String street;
    private String number;
    private String city;
    private State state;

    public AddressModel() {}

    public String getStreet() {
        return street;
    }

    public void setStreet(
            String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(
            String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(
            String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(
            State state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((street == null)
                        ? 0
                        : street.hashCode());
        result = prime
                * result
                + ((number == null)
                        ? 0
                        : number.hashCode());
        result = prime
                * result
                + ((city == null)
                        ? 0
                        : city.hashCode());
        result = prime
                * result
                + ((state == null)
                        ? 0
                        : state.hashCode());
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
        AddressModel other = (AddressModel) obj;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street
                .equals(other.street))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number
                .equals(other.number))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city
                .equals(other.city))
            return false;
        if (state != other.state)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AddressModel [street="
                + street
                + ", number="
                + number
                + ", city="
                + city
                + ", state="
                + state
                + "]";
    }
}
