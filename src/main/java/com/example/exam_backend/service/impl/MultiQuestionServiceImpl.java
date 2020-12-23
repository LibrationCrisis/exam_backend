package com.example.exam_backend.service.impl;

import com.example.exam_backend.entity.MultiQuestion;
import com.example.exam_backend.mapper.MultiQuestionMapper;
import com.example.exam_backend.service.MultiQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
