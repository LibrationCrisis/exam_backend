package com.example.exam_backend.controller;


import com.example.exam_backend.entity.FillQuestion;
import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.entity.PaperManage;
import com.example.exam_backend.service.FillQuestionService;
import com.example.exam_backend.service.JudgeQuestionService;
import com.example.exam_backend.service.MultiQuestionService;
import com.example.exam_backend.service.PaperManageService;
import org.springframework.web.bind.annotation.*;

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

    private final PaperManageService paperManageService;

    private final MultiQuestionService multiQuestionService;

    private final FillQuestionService fillQuestionService;

    private final JudgeQuestionService judgeQuestionService;

    public PaperManageController(PaperManageService paperManageService, MultiQuestionService multiQuestionService, FillQuestionService fillQuestionService, JudgeQuestionService judgeQuestionService) {
        this.paperManageService = paperManageService;
        this.multiQuestionService = multiQuestionService;
        this.fillQuestionService = fillQuestionService;
        this.judgeQuestionService = judgeQuestionService;
    }

    /**
     * 通过中间表关联题库和考试
     *
     * @param paperManage 对象
     * @return true false
     */
    @PostMapping("/paper-manage")
    public Boolean add(@RequestBody PaperManage paperManage) {
        return paperManageService.save(paperManage);
    }

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

