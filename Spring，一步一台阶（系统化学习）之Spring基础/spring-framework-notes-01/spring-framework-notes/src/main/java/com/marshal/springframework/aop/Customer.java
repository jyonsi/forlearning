package com.marshal.springframework.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author 王毅
 * @Date 2020/2/29 11:01
 */
@Component("customer")
@Aspect
public class Customer {

    @Before("execution(* com.marshal.springframework.aop.TaoistPriestOfAop.*(..))")
    public void inventation(){

        System.out.println("邀请道士！..前置通知");
    }
}
