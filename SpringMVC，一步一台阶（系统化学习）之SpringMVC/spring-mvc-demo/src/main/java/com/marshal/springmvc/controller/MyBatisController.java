package com.marshal.springmvc.controller;

import com.marshal.springmvc.dao.entity.MybatisStudentTbl;
import com.marshal.springmvc.service.MyBatisStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/3/29 21:57
 */
@Controller
@RequestMapping("mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisStudentService myBatisStudentService;

    @RequestMapping("getStudents")
    public ModelAndView getStudents(){

        List<MybatisStudentTbl> mybatisStudentTblList = myBatisStudentService.getStudents();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("mybatisStudentTblList", mybatisStudentTblList);
        modelAndView.setViewName("mybatis/students");

        return modelAndView;
    }
}
