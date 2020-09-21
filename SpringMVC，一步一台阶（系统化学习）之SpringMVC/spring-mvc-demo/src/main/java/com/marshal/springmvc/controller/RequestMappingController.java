package com.marshal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王毅
 * @Date 2020/3/18 16:35
 */
@Controller
@RequestMapping(value = "/requestmapping")
public class RequestMappingController {

    @RequestMapping("/method1")
    public ModelAndView method1(){

        System.out.println("requestMapping method1 ok !!");

        String result = "requestMapping method1 ok !!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", result);
        modelAndView.setViewName("requestmapping/method1result");

        return modelAndView;
    }

    @RequestMapping(value = "/method2")
    public ModelAndView method2(){

        System.out.println("requestMapping method2 ok !!");

        String result = "requestMapping method2 ok !!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", result);
        modelAndView.setViewName("requestmapping/method2result");

        return modelAndView;
    }

    @RequestMapping(value = "/method3", method = RequestMethod.GET)
    public ModelAndView method3(){

        System.out.println("requestMapping method3 ok !!");

        String result = "requestMapping method3 ok !!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", result);
        modelAndView.setViewName("requestmapping/method3result");

        return modelAndView;
    }

    @RequestMapping(value = "/method4", method = RequestMethod.POST)
    public ModelAndView method4(){

        System.out.println("requestMapping method4 ok !!");

        String result = "requestMapping method4 ok !!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", result);
        modelAndView.setViewName("requestmapping/method4result");

        return modelAndView;
    }

    @RequestMapping(value = "/method5", params = {"name","age=23"})
    public ModelAndView method5(String name,String age){

        System.out.println("requestMapping method5 ok !!");

        String result = "requestMapping method5 ok !! "+ name + age;

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", result);
        modelAndView.setViewName("requestmapping/method5result");

        return modelAndView;
    }





}
