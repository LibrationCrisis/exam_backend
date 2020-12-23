package com.example.exam_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.exam_backend.entity.Login;

import java.util.Map;

/**
 * 登录 服务类
 */
public interface LoginService extends IService<Login> {
    /**
     * @param queryCriteria 查询条件
     * @return map
     */
    Map<String, Object> login(Map<String, Object> queryCriteria);

}
