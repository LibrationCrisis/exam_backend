package com.example.exam_backend.controller;


import com.example.exam_backend.entity.FillQuestion;
import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.service.JudgeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 判断题题库表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class JudgeQuestionController {
    @Autowired
    private JudgeQuestionService judgeQuestionService;


    /**
     * 查询判断题id
     *
     * @return 判断题id
     */
    @GetMapping("/judge-question-id")
    public Integer findOnlyQuestion() {
        return judgeQuestionService.findOnlyQuestion();
    }

    /**
     * 添加判断题
     *
     * @param judgeQuestion 判断题
     * @return true false
     */
    @PostMapping("/judge-question")
    public Boolean add(@RequestBody JudgeQuestion judgeQuestion) {
        return judgeQuestionService.save(judgeQuestion);
    }

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 判断题列表
     */
    @GetMapping("/judge-question/{page}/{size}")
    public List<JudgeQuestion> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return judgeQuestionService.findAll(page, size);
    }

}

