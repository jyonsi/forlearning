package com.marshal.springboot.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.marshal.springboot.springbootdemo.filter")
@MapperScan(basePackages = "com.marshal.springboot.springbootdemo.dao")
public class SpringBootDemoApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(SpringBootDemoApplication.class);
        // 关闭文字图案
//        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
