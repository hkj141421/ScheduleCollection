package com.knight.ScheduleTask;

import com.knight.Bean.scheduleTaskConfig;
import com.knight.Config.CustomConfig;
import com.knight.Dao.Schedule.scheduleTaskConfigMapper;
import com.knight.Service.ConfigService;
import com.knight.Util.CacheConfigUtil;
import com.knight.Util.CronUtil;
import com.knight.Util.JsonDataUtil;
import com.knight.Util.SpringUtil;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by forget on 2019/12/29.
 */
@Component
public class TaskConfig implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private ConfigService configService;

    @Autowired
    private ScheduleTaskActuator actuator;

    @Autowired
    private CustomConfig customConfig;

    @Autowired
    JsonDataUtil jsonDataUtil;

    @Autowired
    SpringUtil springUtil;

    @PostConstruct
    public void startTask(){
        List<scheduleTaskConfig> taskConfigList = configService.getAllTaskConfig();
        taskConfigList.stream().forEach(scheduleTaskConfig -> {
            CacheConfigUtil.setCache(scheduleTaskConfig.getTaskname(),scheduleTaskConfig);
        });

        if(CacheConfigUtil.getValue(customConfig.getCollectDaySongName()).getTaskstatus().equals("Y"))
        {
            boolean res=actuator.startTask(springUtil.getBean(CollectSongTask.class),customConfig.getCollectDaySongName());
            if (res) System.out.println("----------开启收集每日歌曲任务成功------");
            else System.out.println("----------------开启收集每日歌曲任务失败-----------------");
        }

        Thread thread=new Thread(springUtil.getBean(CollectBandTaskLogin.class));
        thread.start();
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

    }
}
