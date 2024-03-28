package org.andrepixel.models;

import org.andrepixel.enums.State;

public class AddressModel {
    public final String street;
    public final String number;
    public final String city;
    public final State state;

    public AddressModel(
            String street,
            String number,
            String city,
            State state) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }
}
