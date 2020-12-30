package com.example.exam_backend.controller;

import com.example.exam_backend.service.StudentService;
import com.example.exam_backend.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    private final StudentService studentService;

    private final TeacherService teacherService;

    public LoginController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @PostMapping("/login")
    public Map<String, Object> login(Integer username, String password) {
        Map<String, Object> result = studentService.login(username, password);
        if (result == null) {
            result = teacherService.login(username, password);
            if (result == null) {
                result = new HashMap<>();
                result.put("error", "没有数据");
            }
        }
        return result;
    }

}
