package com.example.exam_backend.controller;


import com.example.exam_backend.entity.Score;
import com.example.exam_backend.entity.Student;
import com.example.exam_backend.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 成绩管理表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/score/{studentId}")
    public List<Score> findById(@PathVariable Integer studentId) {
        return scoreService.findById(studentId);
    }
}

