package com.marshal.springboot.springbootdemo.config;

import com.marshal.springboot.springbootdemo.filter.SpringBootDemoFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 王毅
 * @Date 2020/4/26 21:45
 */
//@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean createFilterRegistrationBean(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SpringBootDemoFilter2());
        filterRegistrationBean.setName("SpringBootDemoFilter2");
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);

        return filterRegistrationBean;
    }
}
