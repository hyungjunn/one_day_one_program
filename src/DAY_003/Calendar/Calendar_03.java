package DAY_003.Calendar;

import java.util.Scanner;

public class Calendar_03 {
    public static void main(String[] args) {
        System.out.println("달을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = 0;

        if (month <= 7) {
            if (month % 2 == 1) {
                day = 31;
            } else if (month == 2) {
                day = 28;
            } else {
                day = 30;
            }
        } else if (month >= 7) {
            if (month % 2 == 0) {
                day = 31;
            } else if (month % 2 == 1) {
                day = 30;
            }
        }

        System.out.println(month + "월은 " + day + "일까지 있습니다.");
    }
}
