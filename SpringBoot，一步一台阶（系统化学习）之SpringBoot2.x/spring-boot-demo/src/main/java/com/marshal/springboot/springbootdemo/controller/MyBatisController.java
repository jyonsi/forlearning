package com.marshal.springboot.springbootdemo.controller;

import com.marshal.springboot.springbootdemo.dao.entity.MybatisStudentTbl;
import com.marshal.springboot.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/4/29 10:22
 */
@Controller
@RequestMapping("mybatis")
public class MyBatisController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getAllStudents")
    public ModelAndView getAllStudents(){

        ModelAndView modelAndView = new ModelAndView();

        List<MybatisStudentTbl> mybatisStudentTblList = studentService.getAllStudents();

        modelAndView.addObject("mybatisStudentTblList", mybatisStudentTblList);

        modelAndView.setViewName("mybatis/studentlist");

        return modelAndView;
    }

    @RequestMapping("addStudentList")
    public String addStudentList(Model model){

        MybatisStudentTbl mybatisStudentTbl1 = new MybatisStudentTbl("AAA",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl2 = new MybatisStudentTbl("AAB",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl3 = new MybatisStudentTbl("AAC",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl4 = new MybatisStudentTbl("AAD",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl5 = new MybatisStudentTbl("AAE",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl6 = new MybatisStudentTbl("AAF",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl7 = new MybatisStudentTbl("AAG",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl8 = new MybatisStudentTbl("AAH",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl9 = new MybatisStudentTbl("AAI",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl10 = new MybatisStudentTbl("AAJ",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl11 = new MybatisStudentTbl("AAK",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl12 = new MybatisStudentTbl("AAL",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl13 = new MybatisStudentTbl("AAM",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        MybatisStudentTbl mybatisStudentTbl14 = new MybatisStudentTbl("AAN",new Byte((byte) 1),"2020-01-01",178D,70D,1L);
        studentService.addStudent(mybatisStudentTbl1);
        studentService.addStudent(mybatisStudentTbl2);
        studentService.addStudent(mybatisStudentTbl3);
        studentService.addStudent(mybatisStudentTbl4);
        studentService.addStudent(mybatisStudentTbl5);
        studentService.addStudent(mybatisStudentTbl6);
        studentService.addStudent(mybatisStudentTbl7);
        studentService.addStudent(mybatisStudentTbl8);
        studentService.addStudent(mybatisStudentTbl9);
        studentService.addStudent(mybatisStudentTbl10);
        studentService.addStudent(mybatisStudentTbl11);
        studentService.addStudent(mybatisStudentTbl12);
        studentService.addStudent(mybatisStudentTbl13);
        studentService.addStudent(mybatisStudentTbl14);

        List<MybatisStudentTbl> mybatisStudentTblList = studentService.getAllStudents();
        model.addAttribute("mybatisStudentTblList",mybatisStudentTblList);

        return "mybatis/studentlist";
    }
}
