package com.knight.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by forget on 2020/1/10.
 */
@Component
@Aspect
@Order(1)
public class LogAspect {
    @Pointcut("execution(* com.knight.ScheduleTask.Collect*.run())")
    public void pointCut(){

    }

    @Around("pointCut()")
    public void AroundLog(ProceedingJoinPoint joinPoint){
        try {
            long startTime=System.currentTimeMillis();
            System.out.println("------开始执行"+joinPoint.getTarget().getClass().getName()+"任务,执行时间:"+new Date(startTime)+"------");
            joinPoint.proceed();
            long endTime=System.currentTimeMillis();
            System.out.println("------结束执行"+joinPoint.getTarget().getClass().getName()+"任务,执行时间:"+new Date(endTime)+"------");
            System.out.println("------耗时"+(endTime-startTime)+"毫秒------");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
