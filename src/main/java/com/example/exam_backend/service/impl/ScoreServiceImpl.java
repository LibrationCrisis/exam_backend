package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exam_backend.entity.Score;
import com.example.exam_backend.entity.Student;
import com.example.exam_backend.mapper.ScoreMapper;
import com.example.exam_backend.service.ScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 成绩管理表 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

    /**
     * 根据学生ID查找成绩
     *
     * @param studentId 学生ID
     * @return 成绩列表
     */
    @Override
    public List<Score> findById(Integer studentId) {
        // 条件构造器
        QueryWrapper<Score> scoreQueryWrapper = new QueryWrapper<>();
        scoreQueryWrapper.eq("student_id", studentId);
        return list(scoreQueryWrapper);
    }
}
