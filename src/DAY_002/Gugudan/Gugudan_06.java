package DAY_002.Gugudan;

public class Gugudan_06 {
    public static int[] calculate(int time) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = time * (i + 1);
        }

        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

