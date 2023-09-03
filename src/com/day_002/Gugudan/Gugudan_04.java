package com.day_002.Gugudan;

import java.util.Scanner;

public class Gugudan_04 {
    public static void main(String[] args) {
        System.out.print("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);


        if (number < 2 || number > 9) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else {
            for (int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}
