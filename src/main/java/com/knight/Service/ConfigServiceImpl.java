package com.knight.Service;

import com.knight.Bean.accountConfig;
import com.knight.Bean.accountConfigExample;
import com.knight.Bean.scheduleTaskConfig;
import com.knight.Bean.scheduleTaskConfigExample;
import com.knight.Dao.Schedule.accountConfigMapper;
import com.knight.Dao.Schedule.scheduleTaskConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by forget on 2019/12/28.
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    public accountConfigMapper accountConfigMapper;

    @Autowired
    public scheduleTaskConfigMapper taskConfigMapper;

    @Override
    public boolean addAccountConfig(accountConfig accountConfig) {
        int i=this.accountConfigMapper.insert(accountConfig);
        return i==1?true:false;
    }

    @Override
    public boolean updateTaskConfig(scheduleTaskConfig taskConfig) {
        scheduleTaskConfigExample example=new scheduleTaskConfigExample();
        example.createCriteria().andTasknameEqualTo(taskConfig.getTaskname());
        int i=taskConfigMapper.updateByExampleSelective(taskConfig,example);
        return i==1?true:false;
    }

    @Override
    public boolean addTaskConfig(scheduleTaskConfig taskConfig) {
        int i=taskConfigMapper.insertSelective(taskConfig);
        return i==1?true:false;
    }

    @Override
    public accountConfig getAccountConfig() {
        return accountConfigMapper.selectValidAccount();
    }

    @Override
    public scheduleTaskConfig getTaskConfig(String taskName) {
        scheduleTaskConfigExample example=new scheduleTaskConfigExample();
        example.createCriteria().andTasknameEqualTo(taskName).andTaskstatusEqualTo("Y");
        Optional<scheduleTaskConfig> taskConfig=taskConfigMapper.selectByExample(example).stream().findFirst();
        return taskConfig.isPresent()?taskConfig.get():null;
    }

    @Override
    public List<scheduleTaskConfig> getAllTaskConfig() {
        scheduleTaskConfigExample example=new scheduleTaskConfigExample();
        List<scheduleTaskConfig> taskConfig=taskConfigMapper.selectByExample(example);
        return taskConfig;
    }


}
