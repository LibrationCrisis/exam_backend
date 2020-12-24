package com.example.exam_backend.controller;

import com.example.exam_backend.entity.Login;
import com.example.exam_backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;


    @PostMapping("/login")
    public Map<String, Object> login(Login login) {
        Integer username = login.getUsername();
        String password = login.getPassword();
        // 判断条件
        Map<String, Object> queryCriteria = new HashMap<>();
        queryCriteria.put("id", username);
        queryCriteria.put("password", password);
        // 结果集
        Map<String, Object> result = loginService.login(queryCriteria);
        System.out.println(result);
        return result;
    }

}
