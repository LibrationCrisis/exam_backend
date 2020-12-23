package com.example.exam_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 填空题题库
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FillQuestion implements Serializable {

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
     * 试题内容
     */
    private String question;

    /**
     * 正确答案
     */
    private String answer;

    /**
     * 题目解析
     */
    private String analysis;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 难度等级
     */
    private String level;

    /**
     * 所属章节
     */
    private String section;


}
