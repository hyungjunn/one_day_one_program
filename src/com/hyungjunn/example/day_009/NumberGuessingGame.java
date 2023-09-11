package com.hyungjunn.example.day_009;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다!");

        int number = (int) (Math.random() * 100) + 1;

        System.out.println("1부터 100사이의 무작위 숫자를 선택했습니다.");
        System.out.println("당신도 그 숫자를 맞출 수 있을까요?");
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            count++;
            System.out.print("추측하세요 : ");
            int answer = scanner.nextInt();
            if (answer > number) {
                System.out.println("너무 높습니다! 다시 시도해보세요.");
            } else if (answer < number) {
                System.out.println("너무 낮습니다! 다시 시도해보세요.");
            } else {
                System.out.println("축하합니다! 당신은 " + count + "번의 시도로 올바른 숫자를 맞추셨습니다.");
                break;
            }
        }
    }
}


/**
 * 프로그램: 숫자 맞추기 게임
 * 설명:
 * 컴퓨터가 지정된 범위 내에서 무작위 숫자를 생성하고, 플레이어가 그 숫자를 맞추는 숫자 맞추기 게임을 만듭니다. 플레이어의 추측이 너무 높거나 낮을 경우 힌트를 제공합니다.
 * 구현 단계:
 * 지정된 최소값과 최대값 범위 내에서 무작위 숫자를 생성합니다.
 * 플레이어에게 숫자를 추측하도록 안내합니다.
 * 플레이어의 추측을 생성된 숫자와 비교합니다.
 * 추측이 너무 높거나 낮은 경우 피드백을 제공합니다.
 * 플레이어가 올바른 숫자를 맞출 때까지 계속해서 추측할 수 있습니다.
 * 플레이어가 올바른 숫자를 맞추기까지 시도한 횟수를 표시합니다.
 */
