package com.marshal.springboot.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 王毅
 * @Date 2020/4/27 7:12
 */
@Slf4j
@Controller
@RequestMapping("interceptor")
public class InterceptorController {

    @RequestMapping("toTargetMethod")
    public String toTargetMethod(){

        return "interceptor/method1commit";
    }

    @RequestMapping("targetMethod")
    public String targetMethod(){

        log.info("控制器 InterceptorController 类中的目标方法 targetMethod 执行！！");

        return "interceptor/method1result";
    }
}
