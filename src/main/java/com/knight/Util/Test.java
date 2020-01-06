package com.knight.Util;

import com.knight.ScheduleTask.CollectSongTask;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by forget on 2019/12/29.
 */
@Configuration
@EnableScheduling
@Lazy(value = false)
public class Test {

//    @Scheduled(cron = "0/10 * * * * ?")
//    public void test(){
//        Thread thread=new Thread((Runnable)()->{
//            System.out.println("执行中");
//        });
//        thread.start();
//    }

}
