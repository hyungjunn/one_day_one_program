package com.hyungjunn.example.day_022;

public class ThreeSixNineGame {
    public static void main(String[] args) {
        // 98 % 10 == 8  8 % 3 은 0이 아님
        // 98 / 10 == 9  9 % 3 은 0
        String zzak = "";
        for (int i = 1; i <= 100 ; i++) {
            if (i / 10 % 3 == 0 && i / 10 != 0) {
                zzak = "짝";
            }
            if ((i % 10 % 3 == 0 && i % 10 != 0)) {
                zzak += "짝";
            }
            System.out.println("i = " + i + " "+ zzak);
            zzak = "";
        }
    }
}