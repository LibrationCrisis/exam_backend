package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.mapper.MultiQuestionMapper;
import com.example.exam_backend.service.MultiQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 选择题题库表 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Service
public class MultiQuestionServiceImpl extends ServiceImpl<MultiQuestionMapper, MultiQuestion> implements MultiQuestionService {

    /**
     * 根据试卷编号查选择题
     *
     * @param paperId 试卷编号
     * @return 选择题列表
     */
    @Override
    public List<MultiQuestion> findByIdAndType(Integer paperId) {
        // 拼接SQL
        String sql = String.format("SELECT question_id FROM paper_manage WHERE question_type = 1 AND paper_id = %d", paperId);
        // 条件构造器
        QueryWrapper<MultiQuestion> multiQuestionQueryWrapper = new QueryWrapper<>();
        multiQuestionQueryWrapper.inSql("question_id", sql);
        return list(multiQuestionQueryWrapper);
    }
}
