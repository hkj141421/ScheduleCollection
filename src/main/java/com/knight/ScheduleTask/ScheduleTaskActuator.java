package com.knight.ScheduleTask;

import com.knight.Util.CacheConfigUtil;
import com.knight.Util.CronUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/**
 * Created by forget on 2019/12/29.
 * 定时任务执行器
 */
@Component
public class ScheduleTaskActuator {

    @Autowired
    @Qualifier(value = "threadPoolTask")
    private ThreadPoolTaskScheduler poolTaskScheduler;

    private Map<String,ScheduledFuture> futureMap=new HashMap<>();

    /**
     * 开启定时任务
     * @param runnable 定时任务
     * @param taskname 任务名
     * @return
     */
    public boolean startTask(Runnable runnable,String taskname){

        if(futureMap.get(taskname)!=null)return false;

        ScheduledFuture future=poolTaskScheduler.schedule(runnable, new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                String cron=CacheConfigUtil.getValue(taskname).getTaskinterval();
                return new CronTrigger(CronUtil.getValidCron(cron)).nextExecutionTime(triggerContext);
            }
        });

        futureMap.put(taskname,future);

        return true;
    }

    /**
     * 结束定时任务
     * @param taskname 任务名
     * @return
     */
    public boolean stopTask(String taskname){
        ScheduledFuture future=futureMap.get(taskname);
        if(future==null)return false;
        future.cancel(true);
        futureMap.remove(taskname);
        return true;
    }
}
