package com.marshal.springframework.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author 王毅
 * @Date 2020/2/29 11:04
 */
@Component("servant")
@Aspect
@Order(2)
public class Servant {

    @After("execution(* com.marshal.springframework.aop.TaoistPriestOfAop.*(..))")

    public void clean(){

        System.out.println("清理现场！..后置通知");
    }
}
