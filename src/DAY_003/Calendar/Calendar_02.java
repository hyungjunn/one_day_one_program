package DAY_003.Calendar;

import java.util.Scanner;

public class Calendar_02 {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("두 수의 합은 " + (num1 + num2) + "입니다");
    }
}
