package com.knight.Service;

import com.knight.Bean.relationship;
import com.knight.Dao.MusicSite.relationshipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by forget on 2020/1/3.
 */
@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private relationshipMapper shipMapper;

    @Override
    public boolean insertRelation(relationship ship) {
        return shipMapper.insert(ship)==1?true:false;
    }

    @Override
    public relationship getRelationByMusicid(Long musicid) {
        return shipMapper.selectByPrimaryKey(musicid.toString());
    }
}
