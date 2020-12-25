package com.example.exam_backend.controller;


import com.example.exam_backend.entity.FillQuestion;
import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.service.FillQuestionService;
import com.example.exam_backend.service.JudgeQuestionService;
import com.example.exam_backend.service.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
    private MultiQuestionService multiQuestionService;

    @Autowired
    private FillQuestionService fillQuestionService;

    @Autowired
    private JudgeQuestionService judgeQuestionService;

    /**
     * 根据试卷编号查题库
     *
     * @param paperId 试卷编号
     * @return 题库结果集
     */
    @GetMapping("/paper/{paperId}")
    public Map<Integer, List<?>> findById(@PathVariable Integer paperId) {
        List<MultiQuestion> multiQuestionList = multiQuestionService.findByIdAndType(paperId);
        List<FillQuestion> fillQuestionList = fillQuestionService.findByIdAndType(paperId);
        List<JudgeQuestion> judgeQuestionList = judgeQuestionService.findByIdAndType(paperId);
        Map<Integer, List<?>> result = new HashMap<>();
        // 选择题
        result.put(1, multiQuestionList);
        // 填空题
        result.put(2, fillQuestionList);
        // 判断题
        result.put(3, judgeQuestionList);
        return result;
    }

}

