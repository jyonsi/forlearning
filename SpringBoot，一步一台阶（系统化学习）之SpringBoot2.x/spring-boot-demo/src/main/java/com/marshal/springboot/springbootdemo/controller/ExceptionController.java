package com.marshal.springboot.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author 王毅
 * @Date 2020/4/26 16:29
 */
@Slf4j
@Controller
@RequestMapping("exception")
public class ExceptionController {

    @RequestMapping("toMethod1")
    public String toMethod1(){

        return "exception/method1commit";
    }

    @RequestMapping("method1")
    public ModelAndView method1(){

        String name = null;
        name.substring(9);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("exception/method1result");

        return modelAndView;
    }

    @RequestMapping("toMethod2")
    public String toMethod2(){

        return "exception/method2commit";
    }

    @RequestMapping("method2")
    public ModelAndView method2(){

        int x = 10;
        int y = x/0;

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("exception/method2result");

        return modelAndView;
    }

    /*
    @ExceptionHandler(value = {java.lang.NullPointerException.class,
                               java.lang.ArithmeticException.class})
    public ModelAndView exceptionHandler(Exception exception){

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exception.printStackTrace(printWriter);

        String exceptionMessage = stringWriter.toString();

        log.info(exceptionMessage);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception",exceptionMessage);
        modelAndView.setViewName("exception/exceptionview");

        return modelAndView;
    }
    */
}
