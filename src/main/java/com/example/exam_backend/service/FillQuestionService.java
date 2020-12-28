package com.example.exam_backend.service;

import com.example.exam_backend.entity.FillQuestion;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.entity.MultiQuestion;

import java.util.List;

/**
 * <p>
 * 填空题题库 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
public interface FillQuestionService extends IService<FillQuestion> {

    /**
     * 查询填空题id
     *
     * @return 填空题id
     */
    Integer findOnlyQuestion();

    /**
     * 根据试卷编号查填空题
     *
     * @param paperId 试卷编号
     * @return 填空题列表
     */
    List<FillQuestion> findByIdAndType(Integer paperId);

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 填空题列表
     */
    List<FillQuestion> findAll(Integer page, Integer size);

}
