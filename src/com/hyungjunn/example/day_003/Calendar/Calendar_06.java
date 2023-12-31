package com.hyungjunn.example.day_003.Calendar;

import java.util.Scanner;

public class Calendar_06 {
    private final int[] maxOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int month) {
        return maxOfDays[month - 1];
    }

    public void printSampleCalendar() {
        System.out.println("일  월  화 수  목 금  토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] args) {
        System.out.println("반복횟수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        System.out.println("월을 입력하세요.");
        for (int i = 0; i < repeat; i++) {
            System.out.println(i + 1);
        }

        Calendar_05 calendar = new Calendar_05();
        calendar.printSampleCalendar();
        for (int i = 0; i < repeat; i++) {
            System.out.println((i + 1) + "월은 " + calendar.getMaxDaysOfMonth(i + 1) + "일까지 있습니다.");
        }
    }
}


