package com.hyungjunn.example.day_002.Gugudan;

import java.util.Scanner;

public class Gugudan_07 {
    public static void main(String[] args) {
        System.out.print("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                int result = i * j;
                System.out.println(result);
            }
        }

    }
}
