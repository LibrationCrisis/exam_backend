package com.example.exam_backend.service.impl;

import com.example.exam_backend.entity.Student;
import com.example.exam_backend.mapper.StudentMapper;
import com.example.exam_backend.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
