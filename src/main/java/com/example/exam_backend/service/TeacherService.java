package com.example.exam_backend.service;

import com.example.exam_backend.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 教师信息表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-23
 */
public interface TeacherService extends IService<Teacher> {
    /**
     * @param username 教师ID
     * @param password 教师密码
     * @return 教师结果集
     */
    Map<String, Object> login(Integer username, String password);
}
