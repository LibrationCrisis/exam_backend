package com.example.exam_backend.service;

import com.example.exam_backend.entity.ExamManage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 考试管理表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
public interface ExamManageService extends IService<ExamManage> {

    /**
     * 分页查找
     *
     * @param page 当前页
     * @param size 每页个数
     * @return ExamManage集合
     */
    List<ExamManage> pageSearch(Integer page, Integer size);

    /**
     * 查询最后一条记录的paperId,返回给前端达到自增效果
     *
     * @return paperId
     */
    Integer findOnlyPaperId();
}
