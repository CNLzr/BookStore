package com.lzr.bookstore.dao.impl;

import com.lzr.bookstore.dao.CategoryDao;
import com.lzr.bookstore.entity.Category;
import com.lzr.bookstore.mapper.CategoryMapper;
import com.lzr.bookstore.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    @Override
    public boolean addCategory(Category category) {
        boolean flag = false;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        flag = categoryMapper.addCategory(category);
        sqlSession.commit();
        MybatisUtil.closeSqlSession();
        return flag;
    }

    @Override
    public List<Category> getAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        List<Category> categories = categoryMapper.getAll();
        MybatisUtil.closeSqlSession();
        return categories;
    }
}
