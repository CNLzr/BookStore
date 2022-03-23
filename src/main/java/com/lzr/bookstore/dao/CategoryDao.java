package com.lzr.bookstore.dao;

import com.lzr.bookstore.entity.Category;

import java.util.List;

public interface CategoryDao {
    boolean addCategory(Category category);
    List<Category> getAll();

}
