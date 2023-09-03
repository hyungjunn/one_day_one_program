package com.day_019;

class InheritanceTest {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x = " + c.getX());
    }
}

class Child extends Parent {
    int x = 3000;

    Child() {
        this(1000);
    }

    Child(int x) {
        this.x = x;
    }
}

class Parent {
    int x = 100;

    Parent() {
        this(200);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}