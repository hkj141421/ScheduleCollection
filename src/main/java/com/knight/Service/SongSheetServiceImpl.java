package com.knight.Service;

import com.knight.Bean.songsheet;
import com.knight.Bean.songsheetExample;
import com.knight.Bean.songsheetinfo;
import com.knight.Dao.MusicSite.songsheetMapper;
import com.knight.Dao.MusicSite.songsheetinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by forget on 2020/1/10.
 */
@Service
public class SongSheetServiceImpl implements SongSheetService {

    @Autowired
    songsheetMapper sheetMapper;

    @Autowired
    songsheetinfoMapper infoMapper;

    @Override
    public int addsongsheetList(List<songsheet> SSlist) {
        return 0;
    }

    @Override
    public Long addsongsheet(songsheet sheet) {
        int i=sheetMapper.insertSelective(sheet);
        if(i==1)return sheet.getSheetid();
        return null;
    }

    @Override
    public int Createsongsheet(songsheet songsheetInfo) {
        return 0;
    }

    @Override
    public int deletesongsheet(Long SheetId) {
        return 0;
    }

    @Override
    public int Updatesongsheet(songsheet SS) {
        return 0;
    }

    @Override
    public List<songsheet> getsongsheet(songsheet SS) {
        return null;
    }

    @Override
    public List<songsheet> getAllsongsheet(Integer start, Integer size) {
        return null;
    }

    @Override
    public List<songsheet> getsongsheetBytype(Integer start, Integer size, String type) {
        return null;
    }

    @Override
    public Map<String, List<songsheet>> getUsersongsheet(Long id, String name) {
        return null;
    }

    @Override
    public HashMap<String, Object> getSheetByid(Long sheetid, Long userid) {
        return null;
    }

    @Override
    public boolean insertSongSheetRelation(songsheetinfo info) {
        return infoMapper.insert(info)==1?true:false;
    }

    @Override
    public boolean IsExist(String name, String creater) {

        songsheetExample example=new songsheetExample();
        example.createCriteria().andProducerEqualTo(creater).andSongsheetnameEqualTo(name);

        return  sheetMapper.selectByExample(example).size()>0?true:false;
    }
}
