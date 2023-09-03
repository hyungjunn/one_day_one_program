package com.day_001;

public class Polymorphism {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        System.out.println();

        Maltiz maltiz = new Maltiz();
        maltiz.bark();
        System.out.println();

        Bulldog bulldog = new Bulldog();
        bulldog.bark(5);
    }
}

class Dog {
    public void bark() {
        System.out.println("왈 왈 왈!!!");
    }
}

class Maltiz extends Dog {
    public void bark(String str) {
        System.out.println("얄 얄 얄!!!");
    }
}

class Bulldog extends Dog {
    public void bark(int numberOfBark) {
        for (int i = 0; i < numberOfBark; i++) {
            System.out.println("우프 우프 우프!!!");
        }
    }
}