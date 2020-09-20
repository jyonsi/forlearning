package com.marshal.springframework.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author 王毅
 * @Date 2020/2/29 15:17
 */
public class Forecast {

    private String result = "yes";
//    private String result = "no";

    public void tuiCeJiXiong(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        if(result.equals("yes")){

            System.out.println("大吉，干吧！..");
            proceedingJoinPoint.proceed();
        }else{

            System.out.println("大凶，扯呼！..");
        }
    }
}
