package com.asherbakov.hwRacing.transport.enums;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COMPARTMENT("Купе"),
    STATION_WAGON("Универсал"),
    OFF_ROAD_VEHICLE("Внедорожник"),
    SUV("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + this.name();
    }
}
