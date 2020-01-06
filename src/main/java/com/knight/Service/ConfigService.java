package com.knight.Service;

import com.knight.Bean.accountConfig;
import com.knight.Bean.scheduleTaskConfig;

import java.util.Date;
import java.util.List;

/**
 * Created by forget on 2019/12/28.
 */

public interface ConfigService {

    public boolean addAccountConfig(accountConfig accountConfig);

    public boolean updateTaskConfig(scheduleTaskConfig taskConfig);

    public boolean addTaskConfig(scheduleTaskConfig taskConfig);

    public accountConfig getAccountConfig();

    public scheduleTaskConfig getTaskConfig(String taskName);

    public List<scheduleTaskConfig> getAllTaskConfig();
}
