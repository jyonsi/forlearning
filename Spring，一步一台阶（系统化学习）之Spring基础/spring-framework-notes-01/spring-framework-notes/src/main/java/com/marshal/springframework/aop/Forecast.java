package com.marshal.springframework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author 王毅
 * @Date 2020/2/29 15:17
 */
@Component("forecast")
@Aspect
public class Forecast {

    private String result = "yes";
//    private String result = "no";

    @Around("execution(* com.marshal.springframework.aop.TaoistPriestOfAop.xunlongdianxue())")
    public void tuiCeJiXiong(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        if(result.equals("yes")){

            System.out.println("大吉，干吧！..环绕通知");
            proceedingJoinPoint.proceed();
        }else{

            System.out.println("大凶，扯呼！..环绕通知");
        }
    }
}
