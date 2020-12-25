package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.exam_backend.entity.Score;
import com.example.exam_backend.mapper.ScoreMapper;
import com.example.exam_backend.service.ScoreService;
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
     * 根据学生ID查找成绩 不分页
     *
     * @param studentId 学生ID
     * @return Score list
     */
    @Override
    public List<Score> findById(Integer studentId) {
        // 条件构造器
        QueryWrapper<Score> scoreQueryWrapper = new QueryWrapper<>();
        scoreQueryWrapper.eq("student_id", studentId);
        return list(scoreQueryWrapper);
    }

    /**
     * 根据学生ID查找成绩 分页
     *
     * @param page      当前页
     * @param size      每页个数
     * @param studentId 学生ID
     * @return Score list
     */
    @Override
    public List<Score> findById(Integer page, Integer size, Integer studentId) {
        // 条件构造器
        QueryWrapper<Score> scoreQueryWrapper = new QueryWrapper<>();
        scoreQueryWrapper.eq("student_id", studentId);
        Page<Score> scorePage = getBaseMapper().selectPage(new Page<>(page, size), scoreQueryWrapper);
        return scorePage.getRecords();
    }

    /**
     * 根据考试编号查找成绩
     *
     * @param examCode 考试编号
     * @return 考试分散列表
     */
    @Override
    public List<Score> findByExamCode(Integer examCode) {
        // 条件构造器
        QueryWrapper<Score> scoreQueryWrapper = new QueryWrapper<>();
        // 获取学生参加该考试分数最大值
        scoreQueryWrapper.eq("exam_code", examCode).groupBy("student_id").select("MAX(score) AS score", "score_id", "exam_code", "student_id", "subject", "answer_date");
        return list(scoreQueryWrapper);
    }
}
