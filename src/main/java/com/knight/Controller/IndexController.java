package com.knight.Controller;

import com.alibaba.fastjson.JSONObject;
import com.knight.Bean.AjaxResponse;
import com.knight.Bean.accountConfig;
import com.knight.Bean.musicbaseinfo;
import com.knight.Bean.scheduleTaskConfig;
import com.knight.Service.ConfigService;
import com.knight.Service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by forget on 2019/12/28.
 */
@RestController("/api")
public class IndexController {

    @Autowired
    private ConfigService configService;

    @Autowired
    private MusicService musicService;

    @PostMapping("/taskconfig")
    public AjaxResponse updateTaskConfig(@RequestBody scheduleTaskConfig taskConfig){
        return new AjaxResponse("200","success",null);
    }

    @GetMapping("/")
    public AjaxResponse insertAccountConfig(){
        accountConfig config=new accountConfig();
        config.setLoginname("18153843332");
        config.setLogintype("mobile");
        config.setPassword("18153843332hkj");
        config.setStatus("true");
//        this.configService.addAccountConfig(config);
        return new AjaxResponse("200","success",null);
    }

    @GetMapping("/music/{id}")
    public AjaxResponse selectUserById(@PathVariable Long id){
        musicbaseinfo music = musicService.selectMusicByid(id);
        return new AjaxResponse("200","success",music);
    }
}
