package com.marshal.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王毅
 * @Date 2020/4/22 8:29
 */
@Controller
@RequestMapping(value = "requestmapping")
public class RequestMappingController {

    @RequestMapping(value = "toMethod1")
    public ModelAndView toMethod1(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","RequestMapping Demo");
        modelAndView.setViewName("requestmapping/method1commit");

        return modelAndView;
    }

    @RequestMapping(value = "method1")
    public ModelAndView method1(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","RequestMapping Demo");
        modelAndView.addObject("result","RequestMapping Demo Page");
        modelAndView.setViewName("requestmapping/method1result");

        return modelAndView;
    }

    @RequestMapping(value = "toMethod2")
    public ModelAndView toMethod2(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","RequestMapping Demo");
        modelAndView.setViewName("requestmapping/method2commit");

        return modelAndView;
    }

    @RequestMapping(value = "method2",
                    method = RequestMethod.GET)
    public ModelAndView method2(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","RequestMapping Demo");
        modelAndView.addObject("result","RequestMapping Http post type Page");
        modelAndView.setViewName("requestmapping/method2result");

        return modelAndView;
    }

    @RequestMapping(value = "method3",
                    method = RequestMethod.GET,
                    params = {"name","age"})
    public ModelAndView method3(String name,
                                String age){

        System.out.println("name is : " + name);
        System.out.println("age is : " + age);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","RequestMapping Demo");
        modelAndView.addObject("result","RequestMapping params demo Page");
        modelAndView.setViewName("requestmapping/method3result");

        return modelAndView;
    }

}
