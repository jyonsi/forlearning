package com.marshal.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 王毅
 * @Date 2020/4/20 15:45
 */
@Controller
@RequestMapping("simple")
public class SimpleController {

    @RequestMapping("method1")
    @ResponseBody
    public String method1(){

        return "Hello Spring Boot!!";
    }
}
