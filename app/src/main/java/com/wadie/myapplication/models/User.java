package com.wadie.myapplication.models;

public class User {
    private String email;
    private String password;
    private int id;
    private String fullName;
    private String phone;

    public User(String fullName, String email, String password, int id, String phone) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.id = id;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}