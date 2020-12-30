package com.example.exam_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 选择题题库表
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MultiQuestion implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 试题编号
     */
    @TableId(value = "question_id", type = IdType.AUTO)
    private Integer questionId;

    /**
     * 考试科目
     */
    private String subject;

    /**
     * 问题题目
     */
    private String question;

    /**
     * 选项A
     */
    private String answerA;

    /**
     * 选项B
     */
    private String answerB;

    /**
     * 选项C
     */
    private String answerC;

    /**
     * 选项D
     */
    private String answerD;

    /**
     * 正确答案
     */
    private String rightAnswer;

    /**
     * 题目解析
     */
    private String analysis;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 所属章节
     */
    private String section;

    /**
     * 难度等级
     */
    private String level;


}
