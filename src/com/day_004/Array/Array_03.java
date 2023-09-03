package com.day_004.Array;

public class Array_03 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5};
        int[] arr2 = {1, 3, 2};

        int strike = 0;
        int ball = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2 ; j++) {
                if (arr[i] == arr2[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }

        System.out.println("strike : " + strike + ", ball : " + ball);

//        if (arr[0] == arr2[0]) {
//            strike++;
//        }
//        if (arr[0] == arr2[1]) {
//            ball++;
//        }
//        if (arr[0] == arr2[2]) {
//            ball++;
//        }
//
//        if (arr[1] == arr2[0]) {
//            strike++;
//        }
//        if (arr[1] == arr2[1]) {
//            ball++;
//        }
//        if (arr[1] == arr2[2]) {
//            ball++;
//        }
//
//        if (arr[2] == arr2[0]) {
//            strike++;
//        }
//        if (arr[2] == arr2[1]) {
//            ball++;
//        }
//        if (arr[2] == arr2[2]) {
//            ball++;
//        }
    }
}
