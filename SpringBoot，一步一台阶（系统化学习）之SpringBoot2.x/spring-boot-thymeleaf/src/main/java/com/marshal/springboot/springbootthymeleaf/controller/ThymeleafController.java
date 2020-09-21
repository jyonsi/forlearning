package com.marshal.springboot.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王毅
 * @Date 2020/4/21 16:47
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("toMethod1")
    public String toMethod1(){

        return "thymeleaf/method1commit";
    }

    @RequestMapping("method1")
    public ModelAndView method1(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result","I am a theymeleaf page.");
        modelAndView.setViewName("thymeleaf/method1result");

        return modelAndView;
    }
}
