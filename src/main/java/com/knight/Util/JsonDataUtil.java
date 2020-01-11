package com.knight.Util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.knight.Bean.*;
import com.knight.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.*;

/**
 * Created by forget on 2019/12/30.
 */
@Component
public class JsonDataUtil {

    @Autowired
    private MusicService musicService;

    @Autowired
    private HttpService httpService;

    @Autowired
    private LrcService lrcService;

    @Autowired
    private RelationShipService relationShipService;

    @Autowired
    private SongSheetService infoService;

    public boolean parseRecomSongsData(JSONObject data)
    {
        JSONArray jsonArray=data.getJSONArray("recommend");

        for (Object item:jsonArray) {
            JSONObject recommendData=(JSONObject) item;
            JSONObject albun=recommendData.getJSONObject("album");
            String language=LanguageUtil.checkLanguage(recommendData.getString("name"));
            Long musicid=recommendData.getLong("id");
            String name=recommendData.getString("name");

            JSONArray ArtList=recommendData.getJSONArray("artists");
            String singer=ArtList.stream().map((j)->((JSONObject)j).getString("name")).reduce("",(s1,s2)->s1+s2+"&");
            singer=singer.substring(0,singer.lastIndexOf("&"));

            if(musicService.isExist(name,singer)){
                System.out.println("跳过音乐ID为："+musicid+" 的数据");
                continue;
            }

            musicbaseinfo music=new musicbaseinfo();
            music.setMusicname(recommendData.getString("name"));
            music.setTime(parseTime(recommendData.getInteger("duration")));
            music.setAlbum(albun.getString("name"));
            music.setMusicimg(albun.getString("picUrl"));
            music.setLanguage(language);
            music.setCreationdate(new Date(System.currentTimeMillis()));
            music.setType("["+'"'+language+'"'+"]");
            music.setLyricid(getLrcId(musicid,recommendData.getString("name")));
            music.setMusicaddress(getMusicUrl(musicid));
            music.setSinger(singer);

            musicService.insertMusic(music);
        }
        return true;
    }

    public String  getMusicUrl(Long musicid){
       JSONObject jsonObject = httpService.getSongUrl(musicid);
       JSONArray array=jsonObject.getJSONArray("data");
       JSONObject data= (JSONObject) array.stream().findFirst().get();
       return data.getString("url");
    }

    public Long getLrcId(Long musicid,String name){

        JSONObject object=httpService.getLrc(musicid);
        if(object.getJSONObject("lrc")==null)return null;
        String text=object.getJSONObject("lrc").getString("lyric");

        lrc l=new lrc();
        l.setLrcname(name);
        l.setContent(text);
        System.out.println("歌词"+name);
//        lrcService.addLrc(l);

        return l.getLrcid();
    }

    public static String parseTime(int s1) {
        int s=s1/1000;
        String str = "0" + s / 60 + ":";
        if ((s / 60) < 10 && (s / 60) > 0) {
            str = "0" + (s / 60) + ":";
        } else if ((s / 60) < 1) {
            str = "00:";
        } else {
            str = s / 60 + ":";
        }

        if ((s % 60) < 10) {
            str = str + "0" + (s % 60);
        } else {
            str = str + (s % 60);
        }
        return str;
    }

    public void getMusicUrlById(String url,int start,int end){
        System.out.println("执行任务：修改URL");
        int count=0;
        List<musicbaseinfo> list=musicService.selectMusic(url,start,end);
        for (musicbaseinfo m:list) {
            String musicaddr=m.getMusicaddress();

            if(musicaddr.substring(musicaddr.indexOf("id="),musicaddr.indexOf("&")).equals("")){
                System.out.println(m.getMusicid());
                continue;
            }

            Long musicid=Long.parseLong(musicaddr.substring(musicaddr.indexOf("=")+1,musicaddr.indexOf("&")));
            JSONObject J =httpService.getSongUrl(musicid);

            Optional<Object> addr=J.getJSONArray("data").stream().findFirst();
            if (addr.isPresent())
            {
                String address=((JSONObject)addr.get()).getString("url");
                if(address==null)address="id="+musicid;
                else count++;
                boolean re=musicService.updateAddress(address,m.getMusicid());
            }
        }
        System.out.println("执行完毕,共修改"+count+"条数据");
    }

    public void updateaddress(String url,int startNum,int size){
        System.out.println("执行任务：增加音乐关系");
        int count=0;
        int start = (startNum*size);
        List<musicbaseinfo> list=musicService.selectMusic(url,start,size);
        for (musicbaseinfo m:list) {

            String musicaddr=m.getMusicaddress();

            String newStr=musicaddr.substring(musicaddr.indexOf("=")+1);

//            JSONObject jsonres=httpService.getSongDetail(Long.parseLong(newStr));
//
//            String picurl = parseSongDetailData(jsonres);

//            boolean re=musicService.updateAddress(picurl,m.getMusicid());
            relationship ship=new relationship();
            ship.setExternaltype("网易云音乐");
            ship.setExternalmusicid(newStr);
            ship.setNativemusicid(m.getMusicid().toString());
            boolean re=relationShipService.insertRelation(ship);
            if (re){
                count++;
            }
        }
        System.out.println("执行完毕,共插入"+count+"条数据");
    }

    public String  parseSongDetailData(JSONObject json){
       Optional<Object> j=json.getJSONArray("songs").stream().findFirst();
       if(j.isPresent()){
           JSONObject object = (JSONObject) j.get();
           return object.getJSONObject("al").getString("picUrl");
       }

       return null;
    }

    public boolean parseRecomSheetData(JSONObject data)
    {
        JSONArray sheet=data.getJSONArray("recommend");

        for (Object o:sheet) {
            JSONObject item= (JSONObject) o;
            if(infoService.IsExist(item.getString("name"),item.getJSONObject("creator").getString("nickname"))) {
                System.out.println("跳过歌单ID："+item.getString("id"));
                continue;
            }
            songsheet ss=new songsheet();
            ss.setSongsheetname(item.getString("name"));
            ss.setProducer(item.getJSONObject("creator").getString("nickname"));
            ss.setCoverimg(item.getString("picUrl"));
            ss.setTime(new Date(System.currentTimeMillis()));

            JSONObject res=httpService.getSongBySheetId(item.getLong("id"));
            ss.setIntroduce(res.getString("description"));
            ss.setType(res.getJSONArray("tags").toJSONString());

            Long sheetid=infoService.addsongsheet(ss);

            JSONArray tracks=res.getJSONObject("playlist").getJSONArray("tracks");

            for (Object d:tracks) {
                JSONObject musicJson= (JSONObject) d;
                String singer=musicJson.getJSONArray("ar").stream().map(f->((JSONObject)f).getString("name")).reduce((s1,s2)->s1+"&"+s2).get();
                String name=musicJson.getString("name");

                if(musicService.isExist(name,singer)){
                    System.out.println("跳过音乐ID为："+musicJson.getString("id")+" 的数据");
                    continue;
                }

                musicbaseinfo music=new musicbaseinfo();
                music.setCreationdate(new Date(System.currentTimeMillis()));
                music.setLanguage(LanguageUtil.checkLanguage('['+'"'+musicJson.getString("name"))+'"'+']');
                music.setMusicname(musicJson.getString("name"));
                if(musicJson.getJSONObject("al")!=null){
                    music.setMusicimg(musicJson.getJSONObject("al").getString("picUrl"));
                    music.setAlbum(musicJson.getJSONObject("al").getString("name"));
                }
                music.setMusicaddress("id="+musicJson.getString("id"));
                music.setTime(parseTime(musicJson.getInteger("dt")));
                music.setPlaynumber(musicJson.getLong("pop"));

                music.setSinger(singer);
                music.setLyricid(getLrcId(musicJson.getLong("id"),name));

//                musicService.insertMusic(music);
                songsheetinfo info =new songsheetinfo();
                info.setMusicid(music.getMusicid());
                info.setSheetid(ss.getSheetid());

                infoService.insertSongSheetRelation(info);

            }
        }
        return true;
    }

}
