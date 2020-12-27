package com.example.exam_backend.controller;


import com.example.exam_backend.entity.Score;
import com.example.exam_backend.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 成绩管理表 前端控制器
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    /**
     * 根据学生ID查找成绩 不分页
     *
     * @param studentId 学生ID
     * @return Score list
     */
    @GetMapping("/score/{studentId}")
    public List<Score> findById(@PathVariable Integer studentId) {
        return scoreService.findById(studentId);
    }

    /**
     * 根据学生ID查找成绩 分页
     *
     * @param page      当前页
     * @param size      每页个数
     * @param studentId 学生ID
     * @return Score list
     */
    @GetMapping("/score/{page}/{size}/{studentId}")
    public List<Score> findById(@PathVariable Integer page, @PathVariable Integer size, @PathVariable Integer studentId) {
        return scoreService.findById(page, size, studentId);
    }

    /**
     * 根据考试编号查找成绩
     *
     * @param examCode 考试编号
     * @return 考试分数列表
     */
    @GetMapping("/scores/{examCode}")
    public List<Score> findByExamCode(@PathVariable Integer examCode) {
        return scoreService.findByExamCode(examCode);
    }

    /**
     * 保存考试分数
     *
     * @param score 考试分数
     * @return 是否插入成功
     */
    @PostMapping("/score")
    public Boolean add(@RequestBody Score score) {
        return scoreService.save(score);
    }
}

