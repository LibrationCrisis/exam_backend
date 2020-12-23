package com.example.exam_backend.service.impl;

import com.example.exam_backend.entity.Teacher;
import com.example.exam_backend.mapper.TeacherMapper;
import com.example.exam_backend.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
