package com.example.exam_backend.entity;

import lombok.Data;

/**
 * ��¼
 */
@Data
public class Login {
    /**
     * �û�ID
     */
    private Integer username;
    /**
     * �û�����
     */
    private String password;
}
