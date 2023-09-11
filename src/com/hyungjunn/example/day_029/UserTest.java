package com.hyungjunn.example.day_029;

class UserTest {
    public static void main(String[] args) {
        User user = new User("임형준", "hotfirebulldog@gmail.com");

        System.out.println(user.getName());
        System.out.println(user.getEmail());
    }
}
