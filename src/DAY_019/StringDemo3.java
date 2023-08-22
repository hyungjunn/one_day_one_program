package DAY_019;

class StringDemo3 {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        // 두 String객체 비교
        if (string1 == string2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
