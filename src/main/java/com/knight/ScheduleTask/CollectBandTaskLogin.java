package com.knight.ScheduleTask;

import com.knight.Service.ConfigService;
import com.knight.Service.ErrorLogService;
import com.knight.Service.HttpService;
import com.knight.Util.JsonDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by forget on 2020/1/10.
 */
@Component
public class CollectBandTaskLogin implements Runnable{

    @Autowired
    HttpService httpService;

    @Autowired
    ErrorLogService errorLogService;

    @Autowired
    ConfigService configService;

    @Autowired
    JsonDataUtil jsonDataUtil;

    @Override
    public void run() {
    }
}
