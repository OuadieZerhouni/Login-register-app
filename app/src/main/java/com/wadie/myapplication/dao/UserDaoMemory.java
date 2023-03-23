package com.wadie.myapplication.dao;

import com.wadie.myapplication.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMemory implements UserDao {

    private List<User> users;
    private int LastId=0;

    public UserDaoMemory() {
        this.users = new ArrayList<>();
    }

    @Override
    public User AddUser(String fullName, String email, String password, String phone) {
        LastId++;
        User user = new User(fullName, email, password,LastId, phone);
        this.users.add(user);
        return user;
    }

    @Override
    public User UpdateUser(User user) {
        for (int i=0; i<this.users.size(); i++) {
            if (this.users.get(i).getId() == user.getId()) {
                this.users.set(i, user);
                return user;
            }
        }
        return null;
    }

    @Override
    public User DeleteUser(User user) {
        if (this.users.remove(user)) {
            return user;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public User getById(int Id) {
        for (User user : this.users) {
            if (user.getId() == Id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getByEmail(String email) {
        for (User user : this.users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}