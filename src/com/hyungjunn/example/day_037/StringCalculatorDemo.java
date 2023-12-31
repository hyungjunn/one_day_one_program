package com.hyungjunn.example.day_037;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  - 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
 *  - 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다.
 *    즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
 *  - 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
 *
 *   - int number = Integer.parseInt("문자열"); 문자열을 숫자로 변경하는 방법
 */
public class StringCalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 문자열을 입력 받은 후(scanner의 nextLine() 메소드 활용) 빈 공백 문자열을 기준으로 문자들을 분리
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        System.out.println(Arrays.toString(values));

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    sum += Integer.parseInt(values[0]);
                }
            } else {
                switch (values[i]) {
                    case "+" : sum += Integer.parseInt(values[i  + 1]);
                        break;
                    case "-" : sum -= Integer.parseInt(values[i  + 1]);
                        break;
                    case "*" : sum *= Integer.parseInt(values[i + 1]);
                        break;
                    case "/" : sum /= Integer.parseInt(values[i + 1]);
                        break;
                }
            }
        }
        System.out.println(sum);
    }
}

