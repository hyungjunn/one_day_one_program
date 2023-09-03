package DAY_026;

import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        String input = scanner.nextLine();
        System.out.println(input);

        int num = Integer.parseInt(input);
        System.out.println(num);
    }
}
