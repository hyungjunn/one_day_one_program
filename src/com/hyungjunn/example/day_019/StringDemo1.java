package com.hyungjunn.example.day_019;

class StringDemo1 {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        System.out.println(string1);

        String string2 = "Hello";
        System.out.println(string2);

        // String리터럴과 String객체 비교
        if (string1 == string2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

