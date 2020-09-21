package com.marshal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王毅
 * @Date 2020/3/18 14:22
 */
@Controller
public class ResultController {

    @RequestMapping("/result")
    public ModelAndView result(){

        String result = "Hello Marshal !! ";

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("result", result);
        modelAndView.setViewName("simple/result");

        return modelAndView;
    }

}
