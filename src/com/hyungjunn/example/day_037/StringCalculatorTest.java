package com.hyungjunn.example.day_037;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 문자열을 입력한다. (ex. 1 + 2 = 3)
        String value = in.nextLine();
        // 문자열들을 공백 기준으로 나눈다.
        String[] values = value.split(" ");

        StringCalculator stringCalculator = new StringCalculator();
        // stringCalculator.add

        // 테스트 용도 코드들
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println(Arrays.toString(values));
    }
}

class StringCalculator {
    // 1. 더하기
    // 2. 빼기
    // 3. 곱하기
    // 4. 나누기
}
