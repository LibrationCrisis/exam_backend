package com.example.exam_backend.controller;

import com.example.exam_backend.service.StudentService;
import com.example.exam_backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;


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
