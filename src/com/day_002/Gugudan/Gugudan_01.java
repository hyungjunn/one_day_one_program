package com.day_002.Gugudan;

public class Gugudan_01 {
    public static void main(String[] args) {
        System.out.println("1 X 1 = 1");
        System.out.println("1 X 2 = 2");
        System.out.println("1 X 3 = 3");
        System.out.println("1 X 4 = 4");
        System.out.println("1 X 5 = 5");
        System.out.println("1 X 6 = 6");
        System.out.println("1 X 6 = 1");
        System.out.println("1 X 8 = 8");
        System.out.println("1 X 8 = 8");
        System.out.println("1 X 9 = 9");

        for (int i = 1; i <= 9; i++) {
            System.out.println("2 X " + i + " = " + 2 * i);
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println("3 X " + i + " = " + 3 * i);
        }

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(j + " X " + i + " = " + j * i);
            }
        }

    }
}
