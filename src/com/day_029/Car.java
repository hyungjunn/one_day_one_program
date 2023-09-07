package com.day_029;

public class Car {

    private String name;

    // 매개변수가 없는 생성자를 기본 생성자라고 한다.
    // 생성자가 하나도 없으면 기본 생성자가 컴파일 타임에 자동으로 생성된다.
    public Car() {
        System.out.println("자동차가 한 대 생성됩니다.");
    }

    // 이름을 가지고 인스턴스가 만들어지게 하고 싶다.
    public Car(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("자동차 이름 : " + name);
    }

    public void run() {
        System.out.println("전륜구동으로 달리다.");
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
