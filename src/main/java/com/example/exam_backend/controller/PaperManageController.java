package com.example.exam_backend.controller;


import com.example.exam_backend.service.FillQuestionService;
import com.example.exam_backend.service.JudgeQuestionService;
import com.example.exam_backend.service.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 试卷管理表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class PaperManageController {
    @Autowired
    private JudgeQuestionService judgeQuestionService;

    @Autowired
    private MultiQuestionService multiQuestionService;

    @Autowired
    private FillQuestionService fillQuestionService;

    @GetMapping("/paper/{paperId}")
    public Map<Integer, List<?>> findById(@PathVariable Integer paperId) {

        return null;
    }

}

