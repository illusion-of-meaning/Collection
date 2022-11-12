package com.asherbakov.hwRacing.transport;

import com.asherbakov.hwRacing.interfaces.Compating;

public class Bus extends Transport implements Compating {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

    }

//    @Override
//    public void passDiagnostics() {
//        System.out.println("Автобус, диагностика не требуется");
//    }


    @Override
    public boolean passDiagnostics() {
        System.out.printf("Автобус %s %s в диагностике не требуется\n", this.getBrand(), this.getModel());
        return true;
    }

    @Override
    public void repair() {
        System.out.printf("Автомобиль '%s %s' отремонтирован", getBrand(), getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для автобуса - 5:20");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автобуса: 105 км/ч");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getBrand(), super.getModel());
    }
}
