package com.asherbakov.hwRacing.drivers;

import com.asherbakov.hwRacing.category.Category;
import com.asherbakov.hwRacing.transport.Transport;
import com.asherbakov.hwRacing.transport.enums.RightsCategory;

public class Driver<C extends Category> {
    final String NO_NAME = "Водитель пожелал остаться неизвестным";
    final String NO_TRANSPORT = "Водитель решил пройтись";
    private String fullName;
    private RightsCategory rightsCategory;
    private int experience;
//    private T transport;
    private C category;


    public Driver(String fullName, int experience, C category) {
//        setTransport(transport);

        if (fullName != null && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            this.fullName = NO_NAME;
        }
        setExperience(experience);
    }

//    public Driver(String fullName, int experience) {
//        if (fullName != null && !fullName.isBlank()) {
//            this.fullName = fullName;
//        } else {
//            this.fullName = NO_NAME;
//        }
//        setExperience(experience);
//    }

    public void start() {
        System.out.println("Начало движения");
    }

    public void stop() {
        System.out.println("Остановка");
    }

    public void fuel() {
        System.out.println("Заправить автомобиль");
    }

//    public void race(T transport) {
//        if (transport != null) {
//            System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), transport.toString()));
//        } else {
//            System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), NO_TRANSPORT));
//        }
//    }

    public String getFullName() {
        return fullName;
    }

    public RightsCategory getRightsCategory() {
        return rightsCategory;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = 1;
        }
    }


    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.category = category;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
