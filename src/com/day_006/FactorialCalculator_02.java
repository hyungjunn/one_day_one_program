package com.day_006;

import java.util.Scanner;

public class FactorialCalculator_02 {
    public static void main(String[] args) {

        System.out.println("저는 팩토리얼을 계산합니다.");
        System.out.print("숫자를 입력해주세요.>>> ");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[num];

        int factoial = 1;

        for (int i = 1; i <= arr.length; i++) {
            factoial *= i;
        }

        System.out.println(num + "! = " + factoial);
    }
}