package com.knight.ScheduleTask;

import com.knight.Service.ConfigService;
import com.knight.Service.ErrorLogService;
import com.knight.Service.HttpService;
import com.knight.Util.SpringUtil;
import com.knight.Util.JsonDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(jsonDataUtil==null)jsonDataUtil= SpringUtil.getBean(JsonDataUtil.class);

        for (int i=101;i<=200;i++)
        {
            jsonDataUtil.updateaddress("https://v1.itooi.cn/netease/pic?id=",i,50);
            System.out.println("当前进度:"+i+"%");
        }

    }
}
