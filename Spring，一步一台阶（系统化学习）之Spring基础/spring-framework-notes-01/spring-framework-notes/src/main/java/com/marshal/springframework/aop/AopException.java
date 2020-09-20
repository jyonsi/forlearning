package com.marshal.springframework.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("aopException")
@Aspect
public class AopException {

    @AfterThrowing(pointcut = "execution(* com.marshal.springframework.aop.TaoistPriestOfAop.xunlongdianxue())",
                   throwing = "throwable")
    public void fail(Throwable throwable){

        System.out.println("道士失败了！......异常通知");
    }
}
