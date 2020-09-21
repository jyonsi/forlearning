package com.marshal.springboot.springbootdemo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author 王毅
 * @Date 2020/4/26 14:32
 */
@Configuration      // 将类设置为配置类
@EnableScheduling   // 启动定时任务
@EnableAsync        // 启用多线程
@Slf4j
public class ScheduleDemo2 {

    @Async
//    @Scheduled(fixedRate = 3000)
    public void task1() throws InterruptedException {

        Thread.sleep(3000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        log.info("当前 ScheduleDemo2 的方法 task1 执行 ："+simpleDateFormat.format(Calendar.getInstance().getTime()));
    }

    @Async
//    @Scheduled(cron = "0/5 * * * * ?")
    public void task2(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        log.info("当前 ScheduleDemo2 的方法 task2 执行 ："+simpleDateFormat.format(Calendar.getInstance().getTime()));
    }

}
