package com.example.exam_backend.controller;


import com.example.exam_backend.entity.ExamManage;
import com.example.exam_backend.service.ExamManageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    private final ExamManageService examManageService;

    public ExamManageController(ExamManageService examManageService) {
        this.examManageService = examManageService;
    }

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

    /**
     * 根据ID查找
     *
     * @param examCode 试卷ID
     * @return 试卷对象
     */
    @GetMapping("/exam/{examCode}")
    public ExamManage findById(@PathVariable Integer examCode) {
        return examManageService.getById(examCode);
    }

    /**
     * 删除操作
     *
     * @param examCode 考试编号
     * @return true false
     */
    @DeleteMapping("/exam/{examCode}")
    public Boolean deleteById(@PathVariable Integer examCode) {
        return examManageService.removeById(examCode);
    }

    /**
     * 更新操作
     *
     * @param examManage 对象
     * @return true false
     */
    @PutMapping("/exam")
    public Boolean update(@RequestBody ExamManage examManage) {
        System.out.println(examManage.getExamDate());
        return examManageService.updateById(examManage);
    }

    /**
     * 插入操作
     *
     * @param examManage 对象
     * @return true false
     */
    @PostMapping("/exam")
    public Boolean add(@RequestBody ExamManage examManage) {
        return examManageService.save(examManage);
    }

    /**
     * 查询最后一条记录的paperId,返回给前端达到自增效果
     *
     * @return paperId
     */
    @GetMapping("/examManagePaperId")
    public Integer findOnlyPaperId() {
        return examManageService.findOnlyPaperId();
    }
}

