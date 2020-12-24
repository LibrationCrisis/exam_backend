package com.example.exam_backend.service;

import com.example.exam_backend.entity.Score;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 成绩管理表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
public interface ScoreService extends IService<Score> {
    /**
     * 根据学生ID查找成绩
     *
     * @param studentId 学生ID
     * @return 成绩列表
     */
    List<Score> findById(Integer studentId);

}
