package com.marshal.springboot.springbootdemo.config;

import com.marshal.springboot.springbootdemo.interceptor.SpringBootDemoInterceptor1;
import com.marshal.springboot.springbootdemo.interceptor.SpringBootDemoInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 王毅
 * @Date 2020/4/27 7:29
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new SpringBootDemoInterceptor1())
                .addPathPatterns("/interceptor/targetMethod")
                .order(1);

        registry.addInterceptor(new SpringBootDemoInterceptor2())
                .addPathPatterns("/interceptor/targetMethod")
                .order(2);
    }
}
