package com.marshal.springframework.aop;

public class TaoistPriest {

    // 带参数后置通知所需带返回值的方法
    public Integer xiangyaochumo(){

        System.out.println("降妖除魔！..");

        // 后置通知所需返回值
        return 60;
    }

    public void xunlongdianxue(){

        // 异常通知所需抛出异常
        int x = 10/0;
        System.out.println("寻龙点穴！..");
    }

    public void daomujuebao(){

        System.out.println("盗墓掘宝！..");
    }

}
