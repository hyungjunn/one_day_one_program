package com.day_029;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        car1.run();
        car1.printName();
        System.out.println("---------------------");

        Car car2 = new Car("TESLA");
        car2.printName();
    }
}
