package com.lzr.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;
    private String name;
    private String goodsno;
    private String author;
    private String publisher;
    private Date pubtime;
    private Integer categoryid;
    private String description;
    private String image;
    private Integer stock;
    private Double marketprice;
    private Double salesprice;
    private Double score;
    private Integer remarknums;
    private Date uptime;
    private Integer salenums;
    private String newest;
    private String hot;
    private String status;
}
