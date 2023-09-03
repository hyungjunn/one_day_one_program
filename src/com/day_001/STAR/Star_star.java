package com.day_001.STAR;

public class Star_star {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j != 0 && 2 <= i + j && i + j <= 5 && j - i <= 2) || (j <= 1 && i - j == 1)
                || (j >= 3 && i >= 1 && i + j <= 5) || (j <= 3 && i + j >= 5 && i - j <= 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
