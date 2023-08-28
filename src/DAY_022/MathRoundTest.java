package DAY_022;

public class MathRoundTest {
    public static void main(String[] args) {
        // Math.round() 는 소수점 첫째자리에서 반올림
        long result1 = Math.round(3.94f);
        // int result2 = Math.round(3.14d); 큰 범위 -> 작은 범위 : 형변환 생략 X
        int result2 = (int) (Math.round(3.14443d));

        int result3 = Math.round(-3.14f);

        long result4 = Math.round(-1.5);
        long result5 = Math.round(-0.5);
        int result6 = (int)(Math.round(-1.5));
        // 음수는 반올림이 안된다.

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
