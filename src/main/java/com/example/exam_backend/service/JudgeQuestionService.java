package com.example.exam_backend.service;

import com.example.exam_backend.entity.JudgeQuestion;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.exam_backend.entity.MultiQuestion;

import java.util.List;

/**
 * <p>
 * 判断题题库表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
public interface JudgeQuestionService extends IService<JudgeQuestion> {
    /**
     * 根据试卷编号查判断题
     *
     * @param paperId 试卷编号
     * @return 判断题列表
     */
    List<JudgeQuestion> findByIdAndType(Integer paperId);

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 判断题列表
     */
    List<JudgeQuestion> findAll(Integer page, Integer size);
}
