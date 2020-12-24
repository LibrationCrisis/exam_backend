package com.example.exam_backend.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.exam_backend.entity.ExamManage;
import com.example.exam_backend.mapper.ExamManageMapper;
import com.example.exam_backend.service.ExamManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 考试管理表 服务实现类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@Service
public class ExamManageServiceImpl extends ServiceImpl<ExamManageMapper, ExamManage> implements ExamManageService {

    /**
     * 分页查找
     *
     * @param page 当前页
     * @param size 每页个数
     * @return ExamManage集合
     */
    @Override
    public List<ExamManage> pageSearch(Integer page, Integer size) {
        IPage<ExamManage> examManageIPage = getBaseMapper().selectPage(new Page<>(page, size), null);
        return examManageIPage.getRecords();
    }
}
