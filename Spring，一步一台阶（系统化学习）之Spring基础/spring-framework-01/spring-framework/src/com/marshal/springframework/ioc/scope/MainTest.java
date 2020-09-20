package com.marshal.springframework.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        // 启动框架（applicationContext代表容器）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过框架配置文件中的“id”值来获取Spring容器中创建的对象
        TaoistPriest taoistPriest1 = (TaoistPriest) applicationContext.getBean("taoistPriest");
        TaoistPriest taoistPriest2 = (TaoistPriest) applicationContext.getBean("taoistPriest");
        TaoistPriest taoistPriest3 = (TaoistPriest) applicationContext.getBean("taoistPriest");

        taoistPriest1.work();
        taoistPriest2.work();
        taoistPriest3.work();

        System.out.println(taoistPriest1 == taoistPriest2);
        System.out.println(taoistPriest2 == taoistPriest3);

        System.out.println(taoistPriest1.equals(taoistPriest2));
        System.out.println(taoistPriest2.equals(taoistPriest3));

    }
}
