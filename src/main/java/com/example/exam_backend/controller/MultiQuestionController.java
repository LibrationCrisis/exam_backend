package com.example.exam_backend.controller;


import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.service.MultiQuestionService;
import org.springframework.web.bind.annotation.*;

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

    private final MultiQuestionService multiQuestionService;

    public MultiQuestionController(MultiQuestionService multiQuestionService) {
        this.multiQuestionService = multiQuestionService;
    }


    /**
     * 查询选择题id
     *
     * @return 选择题id
     */
    @GetMapping("/multi-question-id")
    public Integer findOnlyQuestion() {
        return multiQuestionService.findOnlyQuestion();
    }

    /**
     * 添加选择题
     *
     * @param multiQuestion 选择题
     * @return true false
     */
    @PostMapping("/multi-question")
    public Boolean add(@RequestBody MultiQuestion multiQuestion) {
        return multiQuestionService.save(multiQuestion);
    }

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

