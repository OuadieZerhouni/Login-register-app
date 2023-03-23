package com.wadie.myapplication.dao;

import com.wadie.myapplication.models.User;

import java.util.List;

public interface UserDao {

    public User AddUser(String fullName, String email, String password, String phone);
    public User UpdateUser(User user);
    public User DeleteUser(User user);
    public List<User> getAll();
    public User getById(int Id);
    public User getByEmail(String email);
}
