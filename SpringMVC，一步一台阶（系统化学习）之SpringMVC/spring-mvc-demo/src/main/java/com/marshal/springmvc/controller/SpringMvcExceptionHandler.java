package com.marshal.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author 王毅
 * @Date 2020/3/26 10:11
 */
//@ControllerAdvice
public class SpringMvcExceptionHandler {

    private static Logger logger = Logger.getLogger(SpringMvcExceptionHandler.class);

    @ExceptionHandler({java.lang.ArithmeticException.class,
                       java.lang.NullPointerException.class,
                       java.lang.ArrayIndexOutOfBoundsException.class})
    public ModelAndView exceptHandler(Exception exception){

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exception.printStackTrace(printWriter);

        logger.info(stringWriter.toString());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",stringWriter.toString());
        modelAndView.setViewName("exception/exceptionhandler");

        return modelAndView;
    }
}
