package DAY_022;

public class EnhancedForStatement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();


        for (int arr1 : arr) {
            System.out.print(arr1);
        }

        System.out.println();

        int sum = 0;
        for (int tmp : arr) {
            sum += tmp;
        }
        System.out.println(sum);
    }
}
