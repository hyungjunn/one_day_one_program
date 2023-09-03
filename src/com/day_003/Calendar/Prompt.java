package com.day_003.Calendar;

import java.util.Scanner;

public class Prompt {
    private static final String PROMPT = "cal> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar_07 calendar = new Calendar_07();
        while (true) {
            System.out.println("년도를 입력하세요.");
            int year = scanner.nextInt();
            System.out.println("달을 입력하세요.");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            if (month < 1) {
                break;
            }

            if (month > 12) {
                continue;
            }

            calendar.printCalendar(year, month);
        }
        System.out.println("Hava a nice day!");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.runPrompt();
    }
}

