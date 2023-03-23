package com.wadie.myapplication.business;

import com.wadie.myapplication.models.User;

import java.util.List;

public class DefaultServices implements Services{

    @Override
    public User addUser(String fullName, String email, String password, int id, String phone) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
