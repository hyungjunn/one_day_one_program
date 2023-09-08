package com.day_030.referenceParameter;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 6, 5, 4, 7, 9, 8};
        printArr(arr);
        sumArr(arr);
    }
    static void printArr(int[] arr) {
        System.out.print("[");

        for (int i : arr) {
            System.out.print(i + ",");
        }

        System.out.print("]");
    }

    static void sumArr(int[] arr) {
            int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        }
    }
}
