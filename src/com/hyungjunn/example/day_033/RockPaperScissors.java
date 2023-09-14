package com.hyungjunn.example.day_033;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 3) + 1;

        Scanner in = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 고르시오.");
        int j = in.nextInt();
        int k = i - j;

        if (k == -2 || k == 1) {
            System.out.println("당신은 졌습니다.");
        } else if (k == -1 || k == 2) {
            System.out.println("당신은 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }
}