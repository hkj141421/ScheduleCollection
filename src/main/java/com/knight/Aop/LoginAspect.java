package com.knight.Aop;

import com.knight.Service.ErrorLogService;
import com.knight.Service.HttpService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by forget on 2020/1/10.
 */
@Component
@Aspect
@Order(100)
public class LoginAspect {

    @Autowired
    HttpService httpService;

    @Autowired
    ErrorLogService errorLogService;

    @Pointcut("execution(* com.knight.ScheduleTask.*Login.run())")
    public void CollectPoint(){}

    @Around("CollectPoint()")
    public void login(ProceedingJoinPoint point){

        System.out.println("开始登录");

        boolean loginstatus=httpService.login();

        if(!loginstatus) {
            errorLogService.insertErrorLog("登录失败",this.getClass().getName());
            return;
        }

        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
