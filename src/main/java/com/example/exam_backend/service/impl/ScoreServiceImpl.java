package com.example.exam_backend.service.impl;

import com.example.exam_backend.entity.Score;
import com.example.exam_backend.mapper.ScoreMapper;
import com.example.exam_backend.service.ScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
