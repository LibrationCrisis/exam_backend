package com.example.exam_backend.controller;


import com.example.exam_backend.entity.FillQuestion;
import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.service.FillQuestionService;
import com.example.exam_backend.service.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 填空题题库 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class FillQuestionController {
    @Autowired
    private FillQuestionService FillQuestionService;

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 填空题列表
     */
    @GetMapping("/fill-question/{page}/{size}")
    public List<FillQuestion> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return FillQuestionService.findAll(page, size);
    }
}

