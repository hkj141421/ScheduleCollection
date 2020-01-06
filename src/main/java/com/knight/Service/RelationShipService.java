package com.knight.Service;

import com.knight.Bean.relationship;

/**
 * Created by forget on 2020/1/3.
 */
public interface RelationShipService {

    public boolean insertRelation(relationship ship);

    public relationship getRelationByMusicid(Long musicid);
}
