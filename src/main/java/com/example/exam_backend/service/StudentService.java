package com.example.exam_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.exam_backend.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 学生信息表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-23
 */
public interface StudentService extends IService<Student> {
    /**
     * @param username 学生ID
     * @param password 学生密码
     * @return 学生集合
     */
    Map<String, Object> login(Integer username, String password);

    /**
     * 分页查找
     *
     * @param page 当前页
     * @param size 每页个数
     * @return Students集合
     */
    List<Student> pageSearch(Integer page, Integer size);
}
