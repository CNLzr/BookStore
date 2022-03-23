package com.lzr.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serializableUID = 1;

    private Integer id;
    private String account;
    private String password;
    private String email;
    private String avatar;    //头像
    private Integer score;
    private Date regtime;    //注册时间
    private String vcode;    //验证码
    private String status;    //状态

}