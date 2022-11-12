package com.asherbakov.hwRacing;

import com.asherbakov.hwRacing.category.CategoryB;
import com.asherbakov.hwRacing.category.CategoryC;
import com.asherbakov.hwRacing.category.CategoryD;
import com.asherbakov.hwRacing.drivers.Driver;
import com.asherbakov.hwRacing.drivers.DriverCategoryB;
import com.asherbakov.hwRacing.drivers.DriverCategoryC;
import com.asherbakov.hwRacing.drivers.DriverCategoryD;
import com.asherbakov.hwRacing.mechanics.Mechanic;
import com.asherbakov.hwRacing.sponsors.Sponsor;
import com.asherbakov.hwRacing.sponsors.SponsorCompany;
import com.asherbakov.hwRacing.sponsors.SponsorPerson;
import com.asherbakov.hwRacing.transport.Bus;
import com.asherbakov.hwRacing.transport.Car;
import com.asherbakov.hwRacing.transport.Train;
import com.asherbakov.hwRacing.transport.Transport;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Vesta Sport", 1.8);
        Car car2 = new Car("Lada", "Granta Drive Active", 1.6);
        Car car3 = new Car("Nissan", "Skyline GT-R", 2.6);

        Bus bus1 = new Bus("ПАЗ", "320530/40-02", 4.6);
        Bus bus2 = new Bus("ПАЗ", "320530/40-04", 4.4);
        Bus bus3 = new Bus("ПАЗ", "320425-04 Vector NEXT", 4.4);

        Train train1 = new Train("КАМАЗ", "5490", 11.7);
        Train train2 = new Train("УРАЛ", "4320", 10.8);
        Train train3 = new Train("УРАЛ", "NEXT", 11.7);

        Mechanic<Car> mechanicB = new Mechanic<>("Артём", "Власов", "Болты и гайки");
        Mechanic<Train> mechanicC = new Mechanic<>("Марат", "Фасаев", "Техносерв");
        Mechanic<Bus> mechanicD = new Mechanic<>("Заур", "Фасаев", "Колеса");

        Driver<CategoryB> driverB = new DriverCategoryB("Антон", 5);
        Driver<CategoryC> driverC = new DriverCategoryC("Максим", 3);
        Driver<CategoryD> driverD = new DriverCategoryD("Олег", 6);

        Sponsor sponsor1 = new SponsorPerson("Данил", 5800);
        Sponsor sponsor2 = new SponsorCompany("Газпром", 1_200_000);

        car1.addDriver(driverB);
        car1.addMechanic(mechanicB);
        car1.addSponsor(sponsor1, sponsor2);
        car2.addDriver(driverB);
        car2.addMechanic(mechanicB);
        car2.addSponsor(sponsor1);
        car3.addDriver(driverB);
        car3.addMechanic(mechanicB);
        car3.addSponsor(sponsor2);

        train1.addDriver(driverC);
        train1.addMechanic(mechanicC);
        train1.addSponsor(sponsor2);
        train2.addDriver(driverC);
        train2.addMechanic(mechanicC);
        train2.addSponsor(sponsor2);
        train3.addDriver(driverC);
        train3.addMechanic(mechanicC);
        train3.addSponsor(sponsor2);

        bus1.addDriver(driverD);
        bus1.addMechanic(mechanicD);
        bus1.addSponsor(sponsor2);
        bus2.addDriver(driverD);
        bus2.addMechanic(mechanicD);
        bus2.addSponsor(sponsor2);
        bus3.addDriver(driverD);
        bus3.addMechanic(mechanicD);
        bus3.addSponsor(sponsor2);

        List<Transport> transports = List.of(car1, car2, car3, bus1, bus2, bus3, train1, train2, train3);

        for (Transport t : transports) {
            printInformation(t);
            System.out.println();
        }

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransport(bus1);
        serviceStation.addTransport(car1);
        serviceStation.addTransport(car2);
        serviceStation.technicalInspection();
        serviceStation.technicalInspection();
        serviceStation.technicalInspection();
        serviceStation.technicalInspection();
        serviceStation.technicalInspection();


//        service(car1, car2, car3, bus1, train1, train2, bus2, train3, bus3);


    }

    public static void printInformation(Transport t){
        System.out.println(t.getBrand() + " " + t.getModel() + ":");
        System.out.println("Водители:");
        for (Driver<?> d : t.getDrivers()) {
            System.out.println(d);
        }
        System.out.println("Спонсоры:");
        for (Sponsor<?> s : t.getSponsors()) {
            System.out.println(s);
        }
        System.out.println("Механики:");
        for (Mechanic<?> m : t.getMechanics()) {
            System.out.println(m);
        }
    }

    public static void service(Transport... transports) {
        for (Transport t : transports) {
            serviceTransport(t);
        }
    }

    public static void serviceTransport(Transport transport) {
        if (!transport.passDiagnostics()) {
            try {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
