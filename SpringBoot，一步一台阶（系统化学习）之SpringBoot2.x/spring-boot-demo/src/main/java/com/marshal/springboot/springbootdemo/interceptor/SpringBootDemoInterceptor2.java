package com.marshal.springboot.springbootdemo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 王毅
 * @Date 2020/4/27 7:23
 */
@Slf4j
public class SpringBootDemoInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        log.info(" SpringBootDemoInterceptor2  之前  preHandle 执行！！");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {

        log.info(" SpringBootDemoInterceptor2  后  postHandle 执行！！");
    }

    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, @Nullable Exception ex) throws Exception {

        log.info(" SpringBootDemoInterceptor2  完成后  afterCompletion 执行！！");
    }
}
