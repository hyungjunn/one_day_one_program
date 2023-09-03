package com.day_022;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsExceptionTest {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.println("score[" + i + "] : " + score[i]);
        }

        System.out.println("tmp : " + tmp);

        //System.out.println("score[" + 7 + "] : " + score[7]);

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(arr);
        // arr은 참조변수. [I@4e04a765 I는 일차원 배열이라는 뜻, @뒤 : 배열의 주소(내부 주소)
        System.out.println(Arrays.toString(arr));
        // 따라서 Arrays.toString()메서드로 모든 요소를 문자열로 반환하고 출력
    }
}
