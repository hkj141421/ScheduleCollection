package com.knight.Service;

import com.knight.Bean.lrc;
import com.knight.Dao.MusicSite.lrcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by forget on 2019/12/30.
 */
@Service
public class LrcServiceImpl implements LrcService {
    @Autowired
    lrcMapper lmapper;

    @Override
    public int addLrc(lrc lrc) {
        return lmapper.insertSelective(lrc);
    }
}
