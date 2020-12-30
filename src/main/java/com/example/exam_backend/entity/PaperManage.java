package com.example.exam_backend.entity;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 试卷管理表
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PaperManage implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 试卷编号
     */
    private Integer paperId;

    /**
     * 题目类型
     */
    private Integer questionType;

    /**
     * 题目编号
     */
    private Integer questionId;


}
