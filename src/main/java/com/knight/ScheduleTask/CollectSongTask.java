package com.knight.ScheduleTask;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.knight.Bean.scheduleTaskConfig;
import com.knight.Service.ConfigService;
import com.knight.Service.ErrorLogService;
import com.knight.Service.HttpService;
import com.knight.Util.HttpClientUtil;
import com.knight.Util.JsonDataUtil;
import com.knight.Util.PathUtil;
import com.knight.Util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.SocketUtils;

import java.util.Date;

/**
 * Created by forget on 2019/12/28.
 */
@Component
public class CollectSongTask implements Runnable{

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

        JSONObject res=httpService.getRecommendSong();

        if(!(res.getIntValue("code")==200))
        {
            System.out.println(res.toJSONString());
            errorLogService.insertErrorLog(res.toJSONString(),this.getClass().getName());
            return;
        }

        jsonDataUtil.parseRecomSongsData(res);

        scheduleTaskConfig config=new scheduleTaskConfig();
        config.setTaskname("CollectSongTask");
        config.setLastexecutetime(new Date(System.currentTimeMillis()));
        configService.updateTaskConfig(config);

    }

}
