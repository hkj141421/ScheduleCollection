package com.knight.Util;

import com.alibaba.fastjson.JSONObject;
import com.knight.Config.CustomConfig;
import com.knight.Service.HttpService;
import javafx.scene.media.MediaException;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by forget on 2019/12/28.
 */
public class HttpClientUtil {

    private static OkHttpClient okHttpClient=new OkHttpClient();

    private static MediaType jsonMedia=MediaType.get("application/json;charset=utf-8");

    private static CustomConfig customConfig;

    public static JSONObject get(String url,Map<String,String> Param,boolean islogin){
        Response response=getResponse(url,Param,islogin);
        try {
          JSONObject jsonObject =  JSONObject.parseObject(response.body().string());
          if(jsonObject.getIntValue("code")==301)
          { //Cookie过期，登录账号，并重新获取一次
              CacheConfigUtil.setLoginCookie(null);
              boolean res=SpringUtil.getBean(HttpService.class).login();
              if(res){
                  return JSONObject.parseObject(getResponse(url,Param,islogin).body().string());
              }
          }
            return jsonObject;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Response getResponse(String url,Map<String,String> Param,boolean islogin){

//        if (customConfig==null)customConfig=SpringUtil.getBean(CustomConfig.class);

//        url="http://"+customConfig.getIp()+":"+customConfig.getPort()+url;
        url="http://localhost:3000"+url;
        StringBuilder p=null;

        if(Param!=null)
        {
            Set<String> keys=Param.keySet();
            for (String k:keys) {
                if(p==null)p=new StringBuilder("?");
                p.append(k+"="+Param.get(k));
                p.append("&");
            }
        }

        if(p!=null){
            p=p.delete(p.length()-1,p.length());
            url=url+p;
        }
        Request request=null;
        Response response=null;

        if(islogin) request= new Request.Builder().url(url).addHeader("Cookie",CacheConfigUtil.getLoginCookie()).build();
        else request= new Request.Builder().url(url).get().build();

        try {
            response=okHttpClient.newCall(request).execute();
            return response;
        } catch (SocketTimeoutException e)
        {
            System.out.println("url:"+url+",");
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String post(String url,JSONObject params)
    {
        RequestBody body=RequestBody.create(params.toJSONString(),jsonMedia);
        Request request= new Request.Builder().url("http://"+customConfig.getIp()+":"+customConfig.getPort()+url).post(body).build();
        Response response=null;
        try {
            response=okHttpClient.newCall(request).execute();
            if(response.body().contentType().type().equals("application/json"))
            {
                return response.message();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
