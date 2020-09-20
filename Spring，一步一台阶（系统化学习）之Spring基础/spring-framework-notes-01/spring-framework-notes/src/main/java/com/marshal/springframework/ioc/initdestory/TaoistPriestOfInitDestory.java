package com.marshal.springframework.ioc.initdestory;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author 王毅
 * @Date 2020/3/3 19:09
 */
@Component("taoistPriestOfInitDestory")
public class TaoistPriestOfInitDestory {

    public TaoistPriestOfInitDestory() {

        System.out.println("道士下山！..");
    }

    @PostConstruct   // 初始化方法注解
    public void init(){

        System.out.println("初始化方法 —— 购买装备！..");
    }

    public void xiangYaoChuMo(){

        System.out.println("降妖除魔！..");
    }

    @PreDestroy   // 销毁方法注解
    public void destory(){

        System.out.println("销毁方法 —— 道士回山！..");
    }
}
