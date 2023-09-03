package DAY_025;

import java.util.Scanner;

public class EmailVallidation {
    public static void main(String[] args) {
        while (true) {
            System.out.print("희망하는 이메일을 입력해주세요. >>> ");

            Scanner in = new Scanner(System.in);
            String e = in.nextLine();

            if (e.matches("^[0-9a-zA-Z]+@[0-9a-zA-Z]+")) {
                System.out.println("유효합니다.");
                break;
            } else {
                System.out.println("유효하지 않습니다.");
                continue;
            }
        }
    }
}
