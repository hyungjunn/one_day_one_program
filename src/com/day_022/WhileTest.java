package com.day_022;

public class WhileTest {
    public static void main(String[] args) {

        int i  = 10;

        while (i-- != 0) {
            System.out.print(i);
        }

        i = 10;
        System.out.println();

        while (--i != 0) {
            System.out.print(i);
        }
        // 전위형은 분리해서 생각하면 안된다.
        // 분리해서 생각하면 while문의 조건식을 벗어나기 때문이다.
    }
}
