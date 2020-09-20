package com.marshal.springframework.ioc.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author 王毅
 * @Date 2020/3/3 19:09
 */
@Component("taoistPriestOfScope")
@Scope("singleton")  // 单例模式
//@Scope("prototype")  // 多例模式
public class TaoistPriestOfScope {

    public TaoistPriestOfScope() {

        System.out.println("道士下山！..");
    }

    public void xiangYaoChuMo(){

        System.out.println("降妖除魔！..");
    }
}
