package com.hyungjunn.example.day_004.Array;

public class Array_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {3, 2, 1};

//        arr[0] == arr2[0];
//        arr[1] == arr2[1];
//        arr[2] == arr2[2];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("같습니다.");
        } else {
            System.out.println("다릅니다.");
        }
    }
}
