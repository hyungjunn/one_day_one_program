package com.hyungjunn.example.day_031.UserDemo;

class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email) {
        this(name, email, null);
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
