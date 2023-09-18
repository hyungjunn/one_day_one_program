package com.hyungjunn.example.day_035;

import java.util.Arrays;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        // 1. 1차원 배열 생성
        int[] arr = new int[25];

        // 2. 1차원 배열 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        // 3. 1차원 배열 섞기
        for (int i = 0; i < arr.length; i++) { // i = 0 ~ 24
            int k = (int)(Math.random() * arr.length); // k = 0 ~ 24
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        // 4. 2차원 배열 생성
        int[][] bingo = new int[5][5];

        // 5. 1차원 배열 -> 2차원 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            bingo[i / 5][i % 5] = arr[i];
        }
        // 6. 2차원 배열 출력
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(bingo[i][j] + " ");
            }
            System.out.println();
        }
    }
}

