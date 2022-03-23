package com.lzr.bookstore.mapper;

import com.lzr.bookstore.entity.Category;

import java.util.List;

public interface CategoryMapper {
    boolean addCategory(Category category);
    List<Category> getAll();
}
