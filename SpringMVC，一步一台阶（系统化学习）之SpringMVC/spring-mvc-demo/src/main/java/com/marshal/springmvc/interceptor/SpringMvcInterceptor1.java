package com.marshal.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 王毅
 * @Date 2020/3/27 20:16
 */
public class SpringMvcInterceptor1 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse,
                             Object o) throws Exception {

        System.out.println("SpringMvcInterceptor1 preHandle：目标方法执行之前所执行的方法！");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o,
                           ModelAndView modelAndView) throws Exception {

        System.out.println("SpringMvcInterceptor1 postHandle：目标方法执行之后所执行的方法！");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o,
                                Exception e) throws Exception {

        System.out.println("SpringMvcInterceptor1 afterCompletion：目标方法执行完成以后所执行的方法！");
    }
}
