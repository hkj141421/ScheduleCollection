package com.knight.ScheduleTask;

import com.alibaba.fastjson.JSONObject;
import com.knight.Service.ConfigService;
import com.knight.Service.ErrorLogService;
import com.knight.Service.HttpService;
import com.knight.Util.SpringUtil;
import com.knight.Util.JsonDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by forget on 2019/12/31.
 */
@Component
public class CollectSheetTask implements Runnable{

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
        JSONObject jsonObject=httpService.getRecommedSheet();
    }
}
