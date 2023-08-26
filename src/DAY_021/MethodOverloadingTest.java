package DAY_021;

public class MethodOverloadingTest {
    public void println(boolean b) {
        System.out.println(b);
    }


    public static void main(String[] args) {
        MethodOverloadingTest methodOverloadingTest = new MethodOverloadingTest();
        methodOverloadingTest.println(true);
    }
}
