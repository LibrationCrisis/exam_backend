package com.example.exam_backend.controller;


import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.service.JudgeQuestionService;
import com.example.exam_backend.service.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 选择题题库表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class MultiQuestionController {
    @Autowired
    private MultiQuestionService multiQuestionService;

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 选择题列表
     */
    @GetMapping("/multi-question/{page}/{size}")
    public List<MultiQuestion> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return multiQuestionService.findAll(page, size);
    }
}

