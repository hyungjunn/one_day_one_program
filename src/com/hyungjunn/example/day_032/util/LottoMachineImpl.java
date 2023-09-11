package com.hyungjunn.example.day_032.util;

// 인터페이를 구현하게 되면 반드시 인터페이가 가지고 있는 메소드를 오버라이딩할 필요가 있다.
public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        for (int i = 0; i < MAX_BALL_COUNT; i++) {
            int j = (int) (Math.random() * MAX_BALL_COUNT);
            Ball tmp = balls[i];
            balls[i] = balls[j];
            balls[j] = tmp;
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT]; // Ball 6개를 참조할 수 있는 배열
        for (int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i++) {
            result[i] = balls[i + 1];
        }
        return result;
    }
}
