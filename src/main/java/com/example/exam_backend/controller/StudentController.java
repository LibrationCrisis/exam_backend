package com.example.exam_backend.controller;


import com.example.exam_backend.entity.Student;
import com.example.exam_backend.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 学生信息表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 分页查找
     *
     * @param page 当前页
     * @param size 每页个数
     * @return Student列表
     */
    @GetMapping("/students/{page}/{size}")
    public List<Student> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return studentService.pageSearch(page, size);
    }
}

