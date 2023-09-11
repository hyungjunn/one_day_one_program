package com.hyungjunn.example.day_032.util;

// 인터페이를 구현하게 되면 반드시 인터페이가 가지고 있는 메소드를 오버라이딩할 필요가 있다.
public class LottoMachineImpl implements LottoMachine {
    @Override
    public void setBalls(Ball[] balls) {

    }

    @Override
    public void mix() {

    }

    @Override
    public Ball[] getBalls() {
        return new Ball[0];
    }
}
