package com.lzr.bookstore.service;

import com.lzr.bookstore.entity.Category;

import java.util.List;

public interface CategoryService {
    boolean addCategory(Category category);
    List<Category> getAll();
}
