package com.lzr.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Integer id;
    private String name;
    private String status;
    private String navable;
    private String sort;

    public Category(String name, String status, String navable, String sort) {
        this.name = name;
        this.status = status;
        this.navable = navable;
        this.sort = sort;
    }
}
