package com.hyungjunn.example.day_015.PolyArgumentTest;

class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();
        Refrigerator refrigerator = new Refrigerator();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.buy(refrigerator);

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

        b.refund(com);
        b.summary();

    }
}
