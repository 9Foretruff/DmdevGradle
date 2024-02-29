package com.foretruff.dao;


import com.foretruff.model.User;

import java.util.List;

public class UserDao {

    public List<User> findAll() {
        return List.of(
                new User(13, "ivan"),
                new User(23, "ihor"),
                new User(18, "maks")
        );
    }

}
