package DAY_008;

import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {

        System.out.println("입력할 돈을 숫자만으로 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        ChangeCalculator changeCalculator = new ChangeCalculator();
        changeCalculator.getChange(money);
    }

    private void getChange(int money) {
        int[] coinUnit = {500, 100, 50, 10};
        
        System.out.println("money = " + money);

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i]);
            // money -= coinUnit[i] * (money / coinUnit[i]);
            money %= coinUnit[i];
        }
    }
}

