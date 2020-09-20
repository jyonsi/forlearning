package com.marshal.springframework.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("bodyResult")
@Aspect
public class BodyResult {

    @AfterReturning(pointcut = "execution(* com.marshal.springframework.aop.TaoistPriestOfAop.xiangyaochumo())",
            returning="bodyValue")
    public void bodyResult(Integer bodyValue){

        System.out.println("所剩体力值："+bodyValue);
    }
}
