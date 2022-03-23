package com.lzr.bookstore.dao.impl;

import com.lzr.bookstore.dao.UserDao;
import com.lzr.bookstore.entity.User;
import com.lzr.bookstore.mapper.UserMapper;
import com.lzr.bookstore.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean addUser(User user) {
        boolean flag = false;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        flag = userMapper.addUser(user);
        sqlSession.commit();
        MybatisUtil.closeSqlSession();
        return flag;
    }
}
