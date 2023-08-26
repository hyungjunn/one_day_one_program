package DAY_021;

public class MethodOverloadingTest {
    public void println(boolean b) {
        System.out.println(b);
    }

    public void println(int i) {
        System.out.println(i);
    }

    public void println(float f) {
        System.out.println(f);
    }


    public static void main(String[] args) {
        MethodOverloadingTest methodOverloadingTest = new MethodOverloadingTest();
        methodOverloadingTest.println(true);
        methodOverloadingTest.println(100);
        methodOverloadingTest.println(3.14f);
    }
}
