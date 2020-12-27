package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.exam_backend.entity.ExamManage;
import com.example.exam_backend.entity.JudgeQuestion;
import com.example.exam_backend.mapper.JudgeQuestionMapper;
import com.example.exam_backend.service.JudgeQuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 判断题题库表 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Service
public class JudgeQuestionServiceImpl extends ServiceImpl<JudgeQuestionMapper, JudgeQuestion> implements JudgeQuestionService {

    /**
     * 根据试卷编号查判断题
     *
     * @param paperId 试卷编号
     * @return 判断题列表
     */
    @Override
    public List<JudgeQuestion> findByIdAndType(Integer paperId) {
        // 拼接SQL
        String sql = String.format("SELECT question_id FROM paper_manage WHERE question_type = 3 AND paper_id = %d", paperId);
        // 条件构造器
        QueryWrapper<JudgeQuestion> judgeQuestionQueryWrapper = new QueryWrapper<>();
        judgeQuestionQueryWrapper.inSql("question_id", sql);
        return list(judgeQuestionQueryWrapper);
    }

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 判断题列表
     */
    @Override
    public List<JudgeQuestion> findAll(Integer page, Integer size) {
        IPage<JudgeQuestion> judgeQuestionPage = getBaseMapper().selectPage(new Page<>(page, size), null);
        return judgeQuestionPage.getRecords();
    }
}
