package com.example.exam_backend.controller;


import com.example.exam_backend.entity.FillQuestion;
import com.example.exam_backend.service.FillQuestionService;
import org.springframework.web.bind.annotation.*;

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

    private final FillQuestionService fillQuestionService;

    public FillQuestionController(FillQuestionService fillQuestionService) {
        this.fillQuestionService = fillQuestionService;
    }

    /**
     * 查询填空题id
     *
     * @return 填空题id
     */
    @GetMapping("/fill-question-id")
    public Integer findOnlyQuestion() {
        return fillQuestionService.findOnlyQuestion();
    }

    /**
     * 添加填空题
     *
     * @param fillQuestion 填空题
     * @return true false
     */
    @PostMapping("/fill-question")
    public Boolean add(@RequestBody FillQuestion fillQuestion) {
        return fillQuestionService.save(fillQuestion);
    }

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 填空题列表
     */
    @GetMapping("/fill-question/{page}/{size}")
    public List<FillQuestion> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return fillQuestionService.findAll(page, size);
    }
}

