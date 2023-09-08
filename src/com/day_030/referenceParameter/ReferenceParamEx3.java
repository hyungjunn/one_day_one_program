package com.day_030.referenceParameter;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 6, 5, 4, 7, 9, 8};
        printArr(arr);
        sumArr(arr);
        sortArr(arr);
    }

    static void printArr(int[] arr) {
        System.out.print("[");

        for (int i : arr) {
            System.out.print(i + ",");
        }

        System.out.print("]");
        System.out.println();
    }

    static void sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
