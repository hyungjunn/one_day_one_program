package com.day_002.Gugudan;

import java.util.Scanner;

public class Gugudan_08 {
    public static void main(String[] args) {
        System.out.print("출력하고 싶은 단을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] splitedValue = string.split(",");
        int number1 = Integer.parseInt(splitedValue[0]);
        int number2 = Integer.parseInt(splitedValue[1]);

        for (int i = 2; i <= number1; i++) {
            for (int j = 1; j <= number2; j++) {
                int result = i * j;
                System.out.println(result);
            }
        }

    }
}
