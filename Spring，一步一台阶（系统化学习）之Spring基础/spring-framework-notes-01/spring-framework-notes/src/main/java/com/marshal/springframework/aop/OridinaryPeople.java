package com.marshal.springframework.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author 王毅
 * @Date 2020/2/29 11:07
 */
@Component("oridinaryPeople")
@Aspect
@Order(3)
public class OridinaryPeople {

    @After("execution(* com.marshal.springframework.aop.TaoistPriestOfAop.*(..))")
    public void eulogize(){

        System.out.println("互相传颂！..后置通知");
    }
}
