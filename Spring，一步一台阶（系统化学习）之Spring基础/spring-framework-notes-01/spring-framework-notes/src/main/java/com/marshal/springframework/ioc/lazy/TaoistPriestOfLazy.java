package com.marshal.springframework.ioc.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author 王毅
 * @Date 2020/3/3 19:09
 */
@Component("taoistPriestOfLazy")
@Lazy
public class TaoistPriestOfLazy {

    public TaoistPriestOfLazy() {

        System.out.println("道士下山！..lazy?");
    }

    public void xiangYaoChuMo(){

        System.out.println("降妖除魔！..");
    }
}
