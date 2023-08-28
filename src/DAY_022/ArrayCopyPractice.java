package DAY_022;

public class ArrayCopyPractice {
    public static void main(String[] args) {
        // 구별이 확 되기 위해 char배열로 연습한다.
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc); // 예외적으로 char배열은 각 요소가 구분자없이 그대로 출력.
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(num, 0, result, 0, abc.length);
        System.out.println(result);

        System.arraycopy(abc, 0, result, abc.length, abc.length);
        System.out.println(result);
    }
}
