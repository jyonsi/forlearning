package com.marshal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王毅
 * @Date 2020/3/27 20:20
 */
@Controller
@RequestMapping("interceptor")
public class InterceptorController {

    @RequestMapping("method1")
    public ModelAndView targetMethod1(){

        System.out.println("InterceptorController targetMethod1：执行目标方法1！");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result","成功执行了目标方法1！");
        modelAndView.setViewName("interceptor/method1result");

        return modelAndView;
    }
}
