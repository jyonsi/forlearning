package com.marshal.springboot.springbootdemo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author 王毅
 * @Date 2020/4/26 20:47
 */
@Slf4j
@ControllerAdvice
public class MyExceptionHandler {

    /*
    @ExceptionHandler(value = {java.lang.Exception.class})
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
