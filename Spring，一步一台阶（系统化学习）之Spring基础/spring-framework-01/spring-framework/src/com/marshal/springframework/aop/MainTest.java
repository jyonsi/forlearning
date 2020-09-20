package com.marshal.springframework.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        TaoistPriest taoistPriest = (TaoistPriest) applicationContext.getBean("taoistPriest");

//        taoistPriest.xunlongdianxue();
//        taoistPriest.xiangyaochumo();
        taoistPriest.daomujuebao();

    }
}
