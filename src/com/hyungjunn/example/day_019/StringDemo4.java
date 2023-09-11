package com.hyungjunn.example.day_019;

class StringDemo4 {
    public static void main(String[] args) {

        String string1 = new String("Hello");

        // String객체 개인 비교
        if (string1 == "Hello") {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // String객체를 equals로 비교
        System.out.println(string1.equals("Hello"));

        String string2 = "Hello";

        // String리터럴 개인 비교
        if (string2 == "Hello") {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
