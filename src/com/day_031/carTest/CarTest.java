package com.day_031.carTest;

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // c1의 복제본

        c1.color = "Black";

        System.out.println(c1);
        System.out.println(c2);
    }
}
