package DAY_003.Calendar;

import java.util.Scanner;

public class Calendar_07 {
    private final int[] maxOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] leapYearOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeapYear(year) == true)
            return leapYearOfDays[month - 1];
        else
            return maxOfDays[month - 1];
    }

    public boolean isLeapYear(int year) {
        if (year % 400 == 0 && (year % 100 != 0 || year % 4 == 0))
            return true;
        else
            return false;
    }

    public void printCalendar(int year, int month) {
        System.out.printf("    <<%4d년 %3d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("-----------------------");


        int maxDay = getMaxDaysOfMonth(year, month);

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
//        System.out.println("  1  2  3  4  5  6  7");
//        System.out.println("  8  9 10 11 12 13 14");
//        System.out.println(" 15 16 17 18 19 20 21");
//        System.out.println(" 22 23 24 25 26 27 28");
    }
}
