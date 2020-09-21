package com.marshal.springboot.springbootdemo.controller;

import com.marshal.springboot.springbootdemo.dao.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 王毅
 * @Date 2020/4/23 17:22
 */
@Controller
@RequestMapping("json")
@Slf4j
public class JsonController {

    @RequestMapping("toMethod1")
    public String toMethod1(){

        return "json/method1commit";
    }

    @RequestMapping("method1")
    @ResponseBody
    public Student method1(@RequestBody Student student){

        log.info("在类JsonController中的方法1！");

        System.out.println(student);

        return student;
    }

    @RequestMapping("toMethod2")
    public String toMethod2(){

        return "json/method2commit";
    }

    @RequestMapping("method2")
    @ResponseBody
    public Student method2(@RequestBody Student student){

        System.out.println(student);

        return student;
    }
}
