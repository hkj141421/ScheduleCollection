package com.knight.Service;

import com.knight.Bean.lrc;
import com.knight.Bean.musicbaseinfo;

import java.util.List;

/**
 * Created by forget on 2019/12/28.
 */
public interface MusicService {

    public musicbaseinfo selectMusicByid(Long id);

    public int insertMusic(musicbaseinfo music);

    public boolean updateMusic(musicbaseinfo music);

    public boolean isExist(String name,String singer);

    public List<musicbaseinfo> selectMusic(String url,int startNum,int pageSize);

    public boolean updateAddress(String url ,Long musicid);

}
