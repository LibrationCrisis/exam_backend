package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exam_backend.entity.Student;
import com.example.exam_backend.entity.Teacher;
import com.example.exam_backend.mapper.TeacherMapper;
import com.example.exam_backend.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 教师信息表 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-23
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    /**
     * @param username 教师ID
     * @param password 教师密码
     * @return 教师结果集
     */
    @Override
    public Map<String, Object> login(Integer username, String password) {
        // 封装
        Map<String, Object> queryCriteria = new HashMap<>();
        queryCriteria.put("teacher_id", username);
        queryCriteria.put("password", password);
        // 条件构造器
        QueryWrapper<Teacher> queryTeacherWrapper = new QueryWrapper<>();
        // -> id = 1 and name = '老王'
        queryTeacherWrapper.allEq(queryCriteria);
        return getMap(queryTeacherWrapper);
    }
}
