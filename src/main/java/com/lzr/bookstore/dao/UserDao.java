package com.lzr.bookstore.dao;

import com.lzr.bookstore.entity.User;

public interface UserDao {
    boolean addUser(User user);

    User getByAccount(String account);
}
