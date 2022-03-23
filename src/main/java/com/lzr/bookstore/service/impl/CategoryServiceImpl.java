package com.lzr.bookstore.service.impl;

import com.lzr.bookstore.dao.CategoryDao;
import com.lzr.bookstore.dao.impl.CategoryDaoImpl;
import com.lzr.bookstore.entity.Category;
import com.lzr.bookstore.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    CategoryDao categoryDao = new CategoryDaoImpl();
    @Override
    public boolean addCategory(Category category) {
        return categoryDao.addCategory(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
