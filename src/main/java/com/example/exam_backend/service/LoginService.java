package com.example.exam_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.exam_backend.entity.Login;

import java.util.Map;

/**
 * ��¼ ������
 */
public interface LoginService extends IService<Login> {
    /**
     * @param queryCriteria ��ѯ����
     * @return map
     */
    Map<String, Object> login(Map<String, Object> queryCriteria);

}
