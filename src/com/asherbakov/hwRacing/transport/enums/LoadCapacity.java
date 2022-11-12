package com.asherbakov.hwRacing.transport.enums;

public enum LoadCapacity {
    N1("с полной массой до 3,5 тонн"),
    N2("с полной массой свыше 3,5 до 12 тонн"),
    N3("с полной массой свыше 12 тонн");

    private String loadCapacity;

    LoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
