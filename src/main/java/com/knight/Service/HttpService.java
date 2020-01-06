package com.knight.Service;

import com.alibaba.fastjson.JSONObject;
import com.knight.Bean.accountConfig;
import com.knight.Dao.Schedule.accountConfigMapper;
import com.knight.Util.CacheConfigUtil;
import com.knight.Util.HttpClientUtil;
import com.knight.Util.PathUtil;
import netscape.javascript.JSObject;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by forget on 2019/12/28.
 */
@Service
public class HttpService {

    @Autowired
    private accountConfigMapper mapper;

    /**
     * 登录网易云音乐
     * @return
     */
    public boolean login() {
        JSONObject jsonObject=null;
        if(CacheConfigUtil.getLoginCookie()==null||CacheConfigUtil.getLoginCookie().equals("")){
            accountConfig config=mapper.selectValidAccount();
            if(config!=null){

                Map<String,String> map=new HashMap<>();
                String loginpath=null;

                if(config.getLogintype().equals("mobile")) {
                    loginpath=PathUtil.mobileLogin;
                    map.put("phone",config.getLoginname());
                    map.put("password",config.getPassword());
                }
                else {
                    loginpath=PathUtil.emailLogin;
                    map.put("email",config.getLoginname());
                    map.put("password",config.getPassword());
                }

                Response res=HttpClientUtil.getResponse(loginpath,map,false);
                try {
                     jsonObject=JSONObject.parseObject(res.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
                if(jsonObject.getIntValue("code")==200)
                {
                    List<String> list=res.headers("Set-Cookie");

                    String cookie=list.stream().map(s->s.substring(0,s.indexOf(";")+1)).reduce("",(s1,s2)->s1+s2);

                    CacheConfigUtil.setLoginCookie(cookie);

                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /**
     * 查看登录状态
     * @return
     */
    public boolean isLogin(){
        JSONObject res=HttpClientUtil.get(PathUtil.refreshLogin,null,false);
        if(res!=null&&res.getString("code").equals("200"))return true;
        return false;
    }

    public JSONObject getRecommendSong(){
        return HttpClientUtil.get(PathUtil.recommendSongs,null,true);
    }

    public JSONObject getLrc(Long musicid){
        HashMap<String,String> map=new HashMap<>();
        map.put("id",musicid.toString());
        return HttpClientUtil.get(PathUtil.lyric,map,false);
    }

    public JSONObject getSongUrl(Long musicid){
        HashMap<String,String> map=new HashMap<>();
        map.put("id",musicid.toString());
        map.put("br","128000");
        return HttpClientUtil.get(PathUtil.songUrl,map,false);
    }

    public JSONObject getSongDetail(Long musicid){
        HashMap<String,String> map=new HashMap<>();
        map.put("ids",musicid.toString());
        return HttpClientUtil.get(PathUtil.songDetail,map,false);
    }

}
