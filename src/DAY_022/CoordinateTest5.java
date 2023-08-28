package DAY_022;

public class CoordinateTest5 {
    public static void main(String[] args) {

        final int MIN_NUM = 1;
        final int MAX_NUM = 101;

        for (int i = MIN_NUM; i <= MAX_NUM; i++) {
            for (int j = MIN_NUM; j <= MAX_NUM; j++) {
                if ((i <= j && i + j <= (MIN_NUM + MAX_NUM) || (i >= j && i + j >= (MIN_NUM + MAX_NUM)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
