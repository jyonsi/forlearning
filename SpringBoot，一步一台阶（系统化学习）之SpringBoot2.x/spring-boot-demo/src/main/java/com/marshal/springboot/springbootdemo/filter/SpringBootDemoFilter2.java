package com.marshal.springboot.springbootdemo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author 王毅
 * @Date 2020/4/26 21:26
 */
@Slf4j
public class SpringBootDemoFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        log.info("过滤器类 SpringBootDemoFilter2 的初始方法 init ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) {

        log.info("过滤器类 SpringBootDemoFilter2 的执行方法 doFilter 开始");
        try {
            log.info("过滤器类 SpringBootDemoFilter2 的执行方法 doFilter 执行");
            filterChain.doFilter(servletRequest,servletResponse);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        log.info("过滤器类 SpringBootDemoFilter2 的执行方法 doFilter 结束");
    }

    @Override
    public void destroy() {

        log.info("过滤器类 SpringBootDemoFilter2 的销毁方法 destroy ");
    }
}
