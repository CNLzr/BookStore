package com.lzr.bookstore.service;

import com.lzr.bookstore.entity.User;

public interface UserService {
    /**
     * 添加用户
     * @param user 用户对象
     * @return 是否成功：true；成功，false：失败
     */
    boolean addUser(User user);
    User getByAccount(String account);
    boolean registerAccount(User user);
}
