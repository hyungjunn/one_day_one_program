package com.day_019;

class StringDemo {
    public static void main(String[] args) {

        String string1 = "James";
        String string2 = "James";

        if (string1 == string2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(string1.equals(string2));
    }
}
