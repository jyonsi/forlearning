package com.marshal.springboot.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王毅
 * @Date 2020/4/20 21:51
 */
@Controller
@RequestMapping("jsp")
public class JspController {

    @RequestMapping("method1")
    public ModelAndView method1(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result","I am a jsp page!!");
        modelAndView.setViewName("method1result");

        return modelAndView;
    }
}
