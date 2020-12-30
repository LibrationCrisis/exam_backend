package com.example.exam_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 学生信息表
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer studentId;

    /**
     * 姓名
     */
    private String studentName;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色(0管理员，1教师，2学生)
     */
    private String role;


}
