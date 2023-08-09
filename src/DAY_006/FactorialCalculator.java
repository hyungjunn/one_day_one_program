package DAY_006;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[num];

        int factoial = 1;

        for (int i = 1; i <= arr.length; i++) {
            factoial *= i;
        }

        System.out.println(factoial);
    }
}