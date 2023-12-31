package com.hyungjunn.example.day_031.carTest;

class Car {

    String color;
    String gear;
    int door;

    Car() {
        this("white", "Auto", 4);
        System.out.println("깡통옵션");
    }


    Car(Car c) {
        this(c.color, c.gear, c.door);
    }

    Car(String color, String gear, int door) {
        this.color = color;
        this.gear = gear;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gear='" + gear + '\'' +
                ", door=" + door +
                '}';
    }
}
