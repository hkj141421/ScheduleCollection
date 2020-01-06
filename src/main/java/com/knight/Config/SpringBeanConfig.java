package com.knight.Config;

import com.knight.ScheduleTask.ScheduleTaskActuator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * Created by forget on 2019/12/29.
 */
@Configuration
public class SpringBeanConfig {

    @Bean(name = "threadPoolTask")
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }


}
