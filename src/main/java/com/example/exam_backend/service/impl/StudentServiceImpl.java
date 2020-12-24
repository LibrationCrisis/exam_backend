package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.exam_backend.entity.ExamManage;
import com.example.exam_backend.entity.Student;
import com.example.exam_backend.mapper.StudentMapper;
import com.example.exam_backend.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-23
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    /**
     * 学生登录
     *
     * @param username 学生ID
     * @param password 学生密码
     * @return 学生集合
     */
    @Override
    public Map<String, Object> login(Integer username, String password) {
        // 封装
        Map<String, Object> queryCriteria = new HashMap<>();
        queryCriteria.put("student_id", username);
        queryCriteria.put("password", password);
        // 条件构造器
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        // -> id = 1 and name = '老王'
        studentQueryWrapper.allEq(queryCriteria);
        return getMap(studentQueryWrapper);
    }

    /**
     * 分页查找
     *
     * @param page 当前页
     * @param size 每页个数
     * @return Students集合
     */
    @Override
    public List<Student> pageSearch(Integer page, Integer size) {
        IPage<Student> studentIPage = getBaseMapper().selectPage(new Page<>(page, size), null);
        return studentIPage.getRecords();
    }
}
