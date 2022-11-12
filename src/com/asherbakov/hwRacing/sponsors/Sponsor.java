package com.asherbakov.hwRacing.sponsors;

import com.asherbakov.hwRacing.transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Sponsor<T extends Transport> {
    private String name;
    private double sponsorship;

    List<T> transportList = new ArrayList<>();

    public Sponsor(String name, double sponsorship) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Спонсор не задан");
        }
        if (sponsorship >= 0) {
            this.sponsorship = sponsorship;
        } else {
            throw new IllegalArgumentException("Спонсорская помощь не может быть отрицательной");
        }
    }

    private void sponsorTheRace() {
        System.out.printf("Спонсор '%s' проспонсировал заезд на %.2f", this.name, this.sponsorship);
    }

    public void transportListAdd(T transport) {
        if (transport != null) {
            transportList.add(transport);
        } else {
            throw new NullPointerException("Не указано спонсируемое транспортное средство");
        }
    }

    public List<T> getTransportList() {
        return transportList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return name.equals(sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + "(" + sponsorship + ")";
    }
}
