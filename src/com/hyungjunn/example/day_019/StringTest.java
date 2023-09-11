package com.hyungjunn.example.day_019;

class StringTest {
    public static void change(String string) {
        string += "라마바사";
        System.out.println(string);
    }

    public static void main(String[] args) {
        String string = "가나다";
        System.out.println(string);
        change(string);
        System.out.println(string);
    }
}
