package com.knight.Util;

import com.knight.Bean.scheduleTaskConfig;
import com.knight.Config.CustomConfig;
import com.knight.Dao.Schedule.scheduleTaskConfigMapper;
import com.knight.Service.ConfigService;

import java.util.HashMap;

/**
 * Created by forget on 2019/12/29.
 */
public class CacheConfigUtil {

    private static HashMap<String,scheduleTaskConfig> cacheMap=new HashMap<>();

    private static String LoginCookie=null;

    private static CustomConfig customConfig;

    private static ConfigService taskConfigService;

    public static scheduleTaskConfig getValue(String key) {
        return cacheMap.get(key);
    }

    public synchronized static void setCache(String key,scheduleTaskConfig value) {
        CacheConfigUtil.cacheMap.put(key,value);
    }

    public static boolean refreshCache(){
        SpringUtil springUtil=new SpringUtil();
//        if(customConfig==null)customConfig=SpringUtil.getBean(CustomConfig.class);
        if (taskConfigService==null)taskConfigService=springUtil.getBean(ConfigService.class);
        try {
            taskConfigService.getAllTaskConfig().stream().forEach(scheduleTaskConfig -> cacheMap.put(scheduleTaskConfig.getTaskname(),scheduleTaskConfig));
        } catch (Exception e){
          return false;
        }
        return true;
    }

    public static String getLoginCookie() {
        return LoginCookie;
    }

    public static synchronized void setLoginCookie(String loginCookie) {
        LoginCookie = loginCookie;
    }
}
