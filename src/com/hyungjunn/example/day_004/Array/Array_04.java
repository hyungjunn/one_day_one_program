package com.hyungjunn.example.day_004.Array;

public class Array_04 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 4, 1, 7, 3, 2, 5, 1, 3};
        int[] count = new int[11];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.print(i);
            }
        }
        System.out.println();

        for (int i = 0; i < count.length; i++) {
            // count[i]가 0이 아닐때의
            // i값을 해당 count[i]번 print출력
            if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++) {
                    System.out.print(i);
                }
            }
        }
    }
}
