package com.marshal.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author 王毅
 * @Date 2020/3/25 20:40
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    private static Logger logger = Logger.getLogger(ExceptionController.class);

    @RequestMapping("/method1")
    public ModelAndView method1(){

        String reuslt = "Excption method1 ok!!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("reuslt",reuslt);
        modelAndView.setViewName("exception/method1result");

        return modelAndView;
    }

    @RequestMapping("/method2")
    public ModelAndView method2(){

        int x = 10/0;

        String reuslt = "Excption method2 ok!!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",reuslt);
        modelAndView.setViewName("exception/method2result");

        return modelAndView;
    }

    @RequestMapping("/method3")
    public ModelAndView method3(){

        String name = null;
        name.substring(3);

        String reuslt = "Excption method3 ok!!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",reuslt);
        modelAndView.setViewName("exception/method3result");

        return modelAndView;
    }

    @RequestMapping("/method4")
    public ModelAndView method4(){

        String[] a = new String[3];  // 0,1,2
        a[8] = "9";

        String reuslt = "Excption method4 ok!!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",reuslt);
        modelAndView.setViewName("exception/method4result");

        return modelAndView;
    }

//    @ExceptionHandler({java.lang.ArithmeticException.class,
//                       java.lang.NullPointerException.class,
//                       java.lang.ArrayIndexOutOfBoundsException.class})
//    public ModelAndView exceptHandler(Exception exception){
//
//        StringWriter stringWriter = new StringWriter();
//        PrintWriter printWriter = new PrintWriter(stringWriter);
//        exception.printStackTrace(printWriter);
//
//        logger.info(stringWriter.toString());
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("result",stringWriter.toString());
//        modelAndView.setViewName("exception/exceptionhandler");
//
//        return modelAndView;
//    }

}
