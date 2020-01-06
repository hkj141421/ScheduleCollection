package com.knight.Util;

import org.springframework.scheduling.support.CronSequenceGenerator;

/**
 * Created by forget on 2019/12/29.
 */
public class CronUtil {

    public static String getValidCron(String cron){
        if(CronSequenceGenerator.isValidExpression(cron))return cron;
        else return "0 0/10 * * * ?";
    }

}
