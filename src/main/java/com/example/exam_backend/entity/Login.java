package com.example.exam_backend.entity;

import lombok.Data;

/**
 * 登录
 */
@Data
public class Login {
    /**
     * 用户ID
     */
    private Integer username;
    /**
     * 用户密码
     */
    private String password;
}
