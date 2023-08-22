package DAY_019;

class StringDemo1 {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        System.out.println(string1);

        String string2 = "Hello";
        System.out.println(string2);

        if (string1 == string2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

