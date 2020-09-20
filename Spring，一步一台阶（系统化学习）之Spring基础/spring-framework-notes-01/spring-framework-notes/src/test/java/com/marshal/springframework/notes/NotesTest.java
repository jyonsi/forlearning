package com.marshal.springframework.notes;

import com.marshal.springframework.aop.TaoistPriestOfAop;
import com.marshal.springframework.di.listsetmap.Immortal;
import com.marshal.springframework.di.property.TaoistPriestOfPropertyDi;
import com.marshal.springframework.ioc.initdestory.TaoistPriestOfInitDestory;
import com.marshal.springframework.ioc.scope.TaoistPriestOfScope;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 王毅
 * @Date 2020/3/4 9:48
 */
public class NotesTest {

    private ApplicationContext applicationContext = null;

    @Before
    public void init(){

        // 启动框架（applicationContext代表容器）
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testScope(){

        // 通过框架配置文件中的“id”值来获取Spring容器中创建的对象
        TaoistPriestOfScope taoistPriest1 = (TaoistPriestOfScope) applicationContext.getBean("taoistPriestOfScope");
        TaoistPriestOfScope taoistPriest2 = (TaoistPriestOfScope) applicationContext.getBean("taoistPriestOfScope");
        TaoistPriestOfScope taoistPriest3 = (TaoistPriestOfScope) applicationContext.getBean("taoistPriestOfScope");

        taoistPriest1.xiangYaoChuMo();
        taoistPriest2.xiangYaoChuMo();
        taoistPriest3.xiangYaoChuMo();

        // 引用的比较
        System.out.println(taoistPriest1==taoistPriest2);
        System.out.println(taoistPriest2==taoistPriest3);

        System.out.println(taoistPriest1.equals(taoistPriest2));
        System.out.println(taoistPriest2.equals(taoistPriest3));

    }

    @Test
    public void testInitDestory(){

        // 通过框架配置文件中的“id”值来获取Spring容器中创建的对象
        TaoistPriestOfInitDestory taoistPriest = (TaoistPriestOfInitDestory) applicationContext.getBean("taoistPriestOfInitDestory");

        taoistPriest.xiangYaoChuMo();

        // 关闭容器，销毁类实例
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void testLazy(){

        System.out.println("道士下山了吗？");
    }

    @Test
    public void testPropertyDi(){

        TaoistPriestOfPropertyDi taoistPriestOfPropertyDi = (TaoistPriestOfPropertyDi) applicationContext.getBean("taoistPriestOfPropertyDi");

        System.out.println(taoistPriestOfPropertyDi);
    }

    @Test
    public void testListSetMapDi(){

        Immortal immortal = (Immortal) applicationContext.getBean("immortal");

        System.out.println(immortal);
    }

    @Test
    public void testAop(){

        TaoistPriestOfAop taoistPriestOfAop = (TaoistPriestOfAop) applicationContext.getBean("taoistPriestOfAop");

        taoistPriestOfAop.xunlongdianxue();
        System.out.println();

//        taoistPriestOfAop.xiangyaochumo();
//        System.out.println();
//
//        taoistPriestOfAop.daomujuebao();
    }
}
