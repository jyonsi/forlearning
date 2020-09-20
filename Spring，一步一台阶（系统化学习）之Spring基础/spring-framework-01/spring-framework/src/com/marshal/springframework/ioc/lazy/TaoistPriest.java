package com.marshal.springframework.ioc.lazy;

public class TaoistPriest {

    public TaoistPriest() {

        System.out.println("一个道士下山了！！");
    }

    public void init(){

        System.out.println("道士购买了武器装备！！");
    }

    public void work(){

        System.out.println("降妖除魔！！");
    }

    public void destory(){

        System.out.println("完成任务回山了！！");
    }
}
