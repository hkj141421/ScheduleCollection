package com.knight.Service;

import com.knight.Bean.musicbaseinfo;
import com.knight.Bean.musicbaseinfoExample;
import com.knight.Dao.MusicSite.musicbaseinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * Created by forget on 2019/12/28.
 */
@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private musicbaseinfoMapper mapper;

    @Override
    public musicbaseinfo selectMusicByid(Long id) {
        musicbaseinfoExample example=new musicbaseinfoExample();
        example.createCriteria().andMusicidEqualTo(id);
        Optional<musicbaseinfo> musicOp=mapper.selectByExample(example).stream().findFirst();
        return musicOp.isPresent()?musicOp.get():null;
    }

    @Override
    public int insertMusic(musicbaseinfo music) {
        return mapper.insert(music);
    }

    @Override
    public boolean updateMusic(musicbaseinfo music) {
        musicbaseinfoExample example=new musicbaseinfoExample();
        example.createCriteria().andMusicidEqualTo(music.getMusicid());
        int i=mapper.updateByExampleSelective(music,example);
        return i==1?true:false;
    }

    @Override
    public boolean isExist(String name,String singer) {
        musicbaseinfoExample example=new musicbaseinfoExample();
        example.createCriteria().andMusicnameEqualTo(name).andSingerEqualTo(singer);
        Optional<musicbaseinfo> musicOp=mapper.selectByExample(example).stream().findFirst();
        return musicOp.isPresent()?true:false;
    }

    @Override
    public List<musicbaseinfo> selectMusic(String url,int startNum,int pageSize) {
        return mapper.selectMusicByPage( startNum,pageSize);
    }

    @Override
    public boolean updateAddress(String url ,Long musicid){
        return mapper.updateByAddress(url,musicid)==1?true:false;
    }

}
