//package DAY_003.Calendar;
//
//import java.util.Scanner;
//
//public class Calendar_08 {
//    public static void main(String[] args) {
//        Calendar_05 calendar = new Calendar_05();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("월을 입력하세요.");
//            System.out.print(">");
//            int month = scanner.nextInt();
//            if (month < 1 && month > 12) {
//                break;
//            }
//            System.out.println(month + "월은 " + calendar.getMaxDaysOfMonth(month) + "일까지 있습니다.");
//        }
//        System.out.println("Hava a nice day!");
//    }
//    }
//}