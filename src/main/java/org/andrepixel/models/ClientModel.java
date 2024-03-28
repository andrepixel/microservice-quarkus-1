package org.andrepixel.models;

public class ClientModel {
    public final String name;
    public final String age;
    public final String email;
    public final String[] phones;
    public final String cep;
    public final AddressModel address;
    
    public ClientModel(
            String name,
            String age,
            String email,
            String[] phones,
            String cep,
            AddressModel address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phones = phones;
        this.cep = cep;
        this.address = address;
    }

    
}
