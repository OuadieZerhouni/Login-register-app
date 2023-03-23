package com.wadie.myapplication.business;

import com.wadie.myapplication.models.User;

import java.util.List;

public interface Services {
    User addUser(String fullName, String email, String password, int id, String phone);
    User updateUser(User user);
    User deleteUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserByEmail(String email);
}