package com.marshal.springframework.di.listsetmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        // 启动框架（applicationContext代表容器）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过框架配置文件中的“id”值来获取Spring容器中创建的对象
        Immortal immortal = (Immortal) applicationContext.getBean("immortal");

        System.out.println(immortal);

    }
}
