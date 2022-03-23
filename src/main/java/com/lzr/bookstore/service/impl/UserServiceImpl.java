package com.lzr.bookstore.service.impl;

import com.lzr.bookstore.dao.UserDao;
import com.lzr.bookstore.dao.impl.UserDaoImpl;
import com.lzr.bookstore.entity.User;
import com.lzr.bookstore.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
}
