package com.hyungjunn.example.day_001;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 첫번째 숫자를 입력
        // 연산자 입력
        // 두번째 숫자를 입력
        // 연산자가 +, -, *, / 일 때 각각 결과값 출력
        // (처음엔 정수로만 생각)
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요.>");
        int a = scanner.nextInt();

        System.out.print("원하시는 연산자를 입력해주세요.>");
        String operator = scanner.next();

        System.out.print("두번째 숫자를 입력해주세요.>");
        int b = scanner.nextInt();

        if (operator.equals("+")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a + b));
        } else if (operator.equals("-")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a - b));
        } else if (operator.equals("x")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a * b));
        } else if (operator.equals("/")) {
            System.out.println(a + " " + operator + " " + b + " = " + (a / b));
        } else {
            System.out.println("error입니다. 다시 처음부터 실행해 주세요.");
        }
    }
}
