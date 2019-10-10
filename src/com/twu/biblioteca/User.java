package com.twu.biblioteca;

public class User {

    String name, email, phone_no, username;

    public User(String name, String email, String phone_no, String username) {
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone_No() {
        return this.phone_no;
    }

    public String getUsername() {
        return this.username;
    }

}
