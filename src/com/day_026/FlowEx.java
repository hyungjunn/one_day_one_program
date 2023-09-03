package com.day_026;

public class FlowEx {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while ((sum += ++i) <= 100) {

            System.out.println(i + " - " + sum);
        }
    }
}


// 1 - 1
// 2 - 3
// 3 - 6
// 4 - 10
// 5 - 15
// 6 - 21
// 7 - 28
// 8 - 36
// 9 - 45
// ...
// 13 - 91