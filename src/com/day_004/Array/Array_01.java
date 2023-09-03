package com.day_004.Array;

public class Array_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d   %d   %d   %d   %d   %d   %d   %d   %d%n", i, i -1, 2 * i, 2 * (i -1), 2 * i - 1, i * i, 10 - i, (i - 1) / 3 + 1, (i + 2) % 3 + 1);
        }
    }
}
