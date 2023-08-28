package DAY_022;

public class MathRoundTest {
    public static void main(String[] args) {
        long result1 = Math.round(3.14f);
        // int result2 = Math.round(3.14d); 큰 범위 -> 작은 범위 : 형변환 생략 X
        int result2 = (int) (Math.round(3.14d));

        System.out.println(result1);
        System.out.println(result2);
    }
}
