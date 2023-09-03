package com.day_026;

class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값
        System.out.print(num1 + ", " + num2);

        for (int i = 0; i < 8; i++) {
//            num3 = num1 + num2;
//            System.out.print(", " + num3);
//            num4 = num3 + num2 = (num1 + num2) + num2
//            System.out.print(", " + num4);
//            num5 = num4 + num3 = (num1 + num2 + num2) + (num1 + num2)
//            System.out.print(", " + num5);
//            num6 = num5 + num4 = (num1 + num2 + num2) + (num1 + num2) + (num1 + num2 + num2)
//            System.out.print(", " + num6);
//            num7 = num6 + num5;
//            System.out.print(", " + num7);
//            num8 = num7 + num6;
//            System.out.print(", " + num8);
//            num9 = num8 + num7;
//            System.out.print(", " + num9);
//            num10 = num9 + num8;
//            System.out.print(", " + num10);
            num3 = num1 + num2;
            System.out.print(", " + num3);
            num2 += num3;
        }
    }
}
// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
// num3 = num1 + num2
// num4 = num1 + num2 + num2
// num5 = num1 + num2 + num2 + num3
// num6 = num1 + num2 + num2 + num3 + num4