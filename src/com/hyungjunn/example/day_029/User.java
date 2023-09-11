package com.hyungjunn.example.day_029;

class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들면 자동으로 안만들어진다.
    public User(String name, String email) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
