package DAY_003.Calendar;

import java.util.Scanner;

public class Calendar_04 {
    public static void main(String[] args) {
        System.out.println("일  월  화 수  목 금  토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("달을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int getMaxOfDay = scanner.nextInt();
        System.out.println(getMaxOfDay + "월은 " + month[getMaxOfDay - 1] + "일까지 있습니다.");
    }
}
