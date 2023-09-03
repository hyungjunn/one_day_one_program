package com.day_026;

class StirngTest {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("str1 == str2 ? : " + (str1 == str2));
        // 문자열 리터럴은 immutable!

        String str3 = new String("def");
        String str4 = new String("def");

        System.out.println(str3 == "def");
        System.out.println("str3 == str4 ? : " + (str3 == str4));
    }
}
