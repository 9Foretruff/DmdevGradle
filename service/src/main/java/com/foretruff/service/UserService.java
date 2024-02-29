package com.foretruff.service;

import com.foretruff.dao.UserDao;
import com.foretruff.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
