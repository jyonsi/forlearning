package com.marshal.springframework.ioc.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        // 启动框架（applicationContext代表容器）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("不做任何的对象实例的引用和操作");

    }
}
