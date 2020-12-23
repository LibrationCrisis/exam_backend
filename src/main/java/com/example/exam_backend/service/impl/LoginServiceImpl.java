package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.exam_backend.entity.Login;
import com.example.exam_backend.entity.Student;
import com.example.exam_backend.entity.Teacher;
import com.example.exam_backend.mapper.LoginMapper;
import com.example.exam_backend.service.LoginService;
import com.example.exam_backend.service.StudentService;
import com.example.exam_backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login> implements LoginService {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    /**
     * @param queryCriteria 查询条件
     * @return map
     */
    @Override
    public Map<String, Object> login(Map<String, Object> queryCriteria) {
        // 条件构造器
        QueryWrapper<Student> queryStudentWrapper = new QueryWrapper<>();
        // -> id = 1 and name = '老王'
        queryStudentWrapper.allEq(queryCriteria);
        Map<String, Object> serviceMap = null;
        serviceMap = studentService.getMap(queryStudentWrapper);
        if (serviceMap == null) {
            QueryWrapper<Teacher> queryTeacherWrapper = new QueryWrapper<>();
            queryTeacherWrapper.allEq(queryCriteria);
            serviceMap = teacherService.getMap(queryTeacherWrapper);
        }
        return serviceMap;
    }

}
