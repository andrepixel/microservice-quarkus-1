package org.andrepixel.models;

import java.util.Arrays;

public class ClientModel {
    private String name;
    private String age;
    private String email;
    private String[] phones;
    private String cep;
    private AddressModel address;

    public ClientModel() {}

    public String getName() {
        return name;
    }

    public void setName(
            String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(
            String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(
            String email) {
        this.email = email;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(
            String[] phones) {
        this.phones = phones;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(
            String cep) {
        this.cep = cep;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(
            AddressModel address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((name == null)
                        ? 0
                        : name.hashCode());
        result = prime
                * result
                + ((age == null)
                        ? 0
                        : age.hashCode());
        result = prime
                * result
                + ((email == null)
                        ? 0
                        : email.hashCode());
        result = prime
                * result
                + Arrays.hashCode(
                        phones);
        result = prime
                * result
                + ((cep == null)
                        ? 0
                        : cep.hashCode());
        result = prime
                * result
                + ((address == null)
                        ? 0
                        : address
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
        ClientModel other = (ClientModel) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name
                .equals(other.name))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age
                .equals(other.age))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email
                .equals(other.email))
            return false;
        if (!Arrays
                .equals(phones,
                        other.phones))
            return false;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep
                .equals(other.cep))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address
                .equals(other.address))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ClientModel [name="
                + name
                + ", age="
                + age
                + ", email="
                + email
                + ", phones="
                + Arrays.toString(
                        phones)
                + ", cep="
                + cep
                + ", address="
                + address
                + "]";
    }

}
