package com.example.exam_backend.service;

import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.entity.MultiQuestion;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 选择题题库表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
public interface MultiQuestionService extends IService<MultiQuestion> {

    /**
     * 根据试卷编号查选择题
     *
     * @param paperId 试卷编号
     * @return 选择题列表
     */
    List<MultiQuestion> findByIdAndType(Integer paperId);

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 选择题列表
     */
    List<MultiQuestion> findAll(Integer page, Integer size);

}
