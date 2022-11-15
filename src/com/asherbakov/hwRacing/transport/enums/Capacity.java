package com.asherbakov.hwRacing.transport.enums;

public enum Capacity {
    ESPECIALLY_SMALL("до 10 мест"),
    SMALL("до 25 мест"),
    MEDIUM("40-50 мест"),
    LARGE("60-80 мест"),
    ESPECIALLY_LARGE("100-120 мест");

    private String capacity;

    Capacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
