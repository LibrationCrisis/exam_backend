package com.example.exam_backend.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.exam_backend.entity.ExamManage;
import com.example.exam_backend.service.ExamManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 考试管理表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class ExamManageController {
    @Autowired
    private ExamManageService examManageService;

    /**
     * 分页查询所有试卷
     *
     * @param page 当前页
     * @param size 每页个数
     * @return ExamManage集合
     */
    @GetMapping(value = "/exams/{page}/{size}")
    public List<ExamManage> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return examManageService.pageSearch(page, size);
    }
}

