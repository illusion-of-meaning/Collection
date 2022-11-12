package com.asherbakov.hwRacing.mechanics;

import com.asherbakov.hwRacing.transport.Transport;

public class Mechanic<T extends Transport> {
    private String firstName;
    private String lastName;
    private String companyName;

//    private final T transport;

    public Mechanic(String firstName, String lastName, String companyName) {
        if (firstName != null && !firstName.isBlank()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Не задано имя");
        }
        if (lastName != null && !lastName.isBlank()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Не задана фамилия");
        }
        if (companyName != null && !companyName.isBlank()) {
            this.companyName = companyName;
        } else {
            throw new IllegalArgumentException("Не указана компания");
        }
//        if (transport != null) {
//            this.transport = transport;
//        } else {
//            throw new NullPointerException("Отсутствует транспортное средство");
//        }
    }

    public boolean passDiagnostic(T transport) {
        return transport.passDiagnostics();
    }

    public void repair(T transport) {
        transport.repair();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public T getTransport(T transport) {
        return transport;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + '(' + companyName + ')';
    }
}
