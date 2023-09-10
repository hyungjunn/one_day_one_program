package com.day_031.UserDemo;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("임형준", "firebulldog@gmail.com");
        System.out.println(user);

        User user2 = new User("곽다현", "paulina1964@naver.com", "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2);
    }
}
