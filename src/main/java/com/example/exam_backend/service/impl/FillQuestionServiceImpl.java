package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.exam_backend.entity.FillQuestion;
import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.mapper.FillQuestionMapper;
import com.example.exam_backend.service.FillQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 填空题题库 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Service
public class FillQuestionServiceImpl extends ServiceImpl<FillQuestionMapper, FillQuestion> implements FillQuestionService {

    /**
     * 查询填空题id
     *
     * @return 填空题id
     */
    @Override
    public Integer findOnlyQuestion() {
        QueryWrapper<FillQuestion> fillQuestionQueryWrapper = new QueryWrapper<>();
        fillQuestionQueryWrapper.orderByDesc("question_id").last("limit 1");
        return getOne(fillQuestionQueryWrapper).getQuestionId();
    }

    /**
     * 根据试卷编号查填空题
     *
     * @param paperId 试卷编号
     * @return 填空题列表
     */
    @Override
    public List<FillQuestion> findByIdAndType(Integer paperId) {
        // 拼接SQL
        String sql = String.format("SELECT question_id FROM paper_manage WHERE question_type = 2 AND paper_id = %d", paperId);
        // 条件构造器
        QueryWrapper<FillQuestion> fillQuestionQueryWrapper = new QueryWrapper<>();
        fillQuestionQueryWrapper.inSql("question_id", sql);
        return list(fillQuestionQueryWrapper);
    }

    /**
     * 分页查找题库
     *
     * @param page 当前页
     * @param size 每页个数
     * @return 填空题列表
     */
    @Override
    public List<FillQuestion> findAll(Integer page, Integer size) {
        IPage<FillQuestion> fillQuestionPage = getBaseMapper().selectPage(new Page<>(page, size), null);
        return fillQuestionPage.getRecords();
    }
}
