package com.example.exam_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 成绩管理表
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分数编号
     */
    @TableId(value = "score_id", type = IdType.AUTO)
    private Integer scoreId;

    /**
     * 考试编号
     */
    private Integer examCode;

    /**
     * 学号
     */
    @TableField("studentId")
    private Integer studentid;

    /**
     * 课程名称
     */
    private String subject;

    /**
     * 考试成绩
     */
    private Integer score;

    /**
     * 答题日期
     */
    private String answerDate;


}
