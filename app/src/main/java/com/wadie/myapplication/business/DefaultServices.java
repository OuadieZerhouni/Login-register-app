package com.wadie.myapplication.business;

import com.wadie.myapplication.dao.UserDao;
import com.wadie.myapplication.models.User;

import java.util.List;

public class DefaultServices implements Services {
    private static DefaultServices instance; s;

    private UserDao userDao;

    private DefaultServices(UserDao userDao) {
        this.userDao = userDao;
    }

    public static synchronized DefaultServices getInstance(UserDao userDao) {
        if (instance == null) {
            instance = new DefaultServices(userDao);
        }
        return instance;
    }

    @Override
    public User addUser(String fullName, String email, String password, String phone) {
        return this.userDao.AddUser(fullName, email, password, phone);
    }

    @Override
    public User updateUser(User user) {
        return this.userDao.UpdateUser(user);
    }

    @Override
    public User deleteUser(User user) {
        return this.userDao.DeleteUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDao.getAll();
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return this.userDao.getByEmail(email);
    }
}