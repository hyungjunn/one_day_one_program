//package DAY_003.Calendar;
//
//import java.util.Scanner;
//
///**
// * 1. 월을 입력하면 해당월의 달력을 출력한다.
// * 2. 달력은 모양은 1단계에서 작성한 모양으로 만든다.
// * 3. 1일은 일요일로 정해도 무방하다.
// * 4. -1을 입력받기 전까지 반복 입력받는다.
// * 5. 프롬프트를 출력한다.
// */
//public class Calendar_08 {
//
//    public void getPrompt() {
//        System.out.println("월을 입력하세요.");
//        System.out.print(">");
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//        printSampleCalendar(year, month);
//
//    }
//    public static void main(String[] args) {
//    }
//
//
//    public int printSampleCalendar(int year, int month) {
//        System.out.println("일  월  화 수  목 금  토");
//        System.out.println("--------------------");
//        System.out.println(" 1  2  3  4  5  6  7");
//        System.out.println(" 8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");
//    }
//}