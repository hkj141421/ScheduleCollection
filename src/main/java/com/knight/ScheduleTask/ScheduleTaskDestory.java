package com.knight.ScheduleTask;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * Created by forget on 2019/12/30.
 */
public class ScheduleTaskDestory implements ApplicationListener<ContextClosedEvent>{
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {

    }
}
