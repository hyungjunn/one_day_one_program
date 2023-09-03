package com.day_004.Array;

import java.util.Arrays;

public class Array_05 {
    public static void main(String[] args) {
        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = new int[4][3];

        for (int i = 0; i < arr.length; i++) {
            arr2[i / 3][i % 3] = arr[i];
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(arr2[i][j] + "       ");
            }
            System.out.println();
        }
/**
 * i = 0 -> [0, 0]
 * i = 1 -> [0, 1]
 * i = 2 -> [0, 2]
 * i = 3 -> [1, 0]
 * i = 4 -> [1, 1]
 * i = 5 -> [1, 2]
 * i = 6 -> [2, 0]
 * i = 7 -> [2, 1]
 * i = 8 -> [2, 2]
 * i = 9 -> [3, 0]
 * i = 10 -> [3, 1]
 * i = 11 -> [3, 2]
 */

        /**
         * [0, 0] -> [0]
         * [0, 1] -> [1]
         * [0, 2] -> [2]
         * [1, 0] -> [3]
         * [1, 1] -> [4]
         * [1, 2] -> [5]
         * ...
         */
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                arr[3 * i + j] = arr2[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



