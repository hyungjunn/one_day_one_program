package DAY_019;

class StringDemo2 {
    public static void main(String[] args) {

        String string1 = new String("Hello");
        String string2 = "Hello";

        // equals()를 이용한 String객체와 String리터럴의 비교
        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string1));
    }
}
