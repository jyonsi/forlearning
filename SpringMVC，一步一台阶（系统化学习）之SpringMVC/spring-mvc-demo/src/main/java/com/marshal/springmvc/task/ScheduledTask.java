package com.marshal.springmvc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author 王毅
 * @Date 2020/3/27 15:49
 */
@Component
public class ScheduledTask {

//    @Scheduled(fixedRate = 5000)
    public void task1(){

        System.out.print("定时任务1：");
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void task2(){

        System.out.print("定时任务2：");
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }
}
