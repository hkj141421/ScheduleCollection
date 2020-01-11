package com.knight.Service;

import com.knight.Bean.songsheet;
import com.knight.Bean.songsheetinfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by forget on 2020/1/10.
 */
public interface SongSheetService {
    /**
     * 添加多张歌单
     *
     * @param SSlist
     * @return
     */
    public int addsongsheetList(List<songsheet> SSlist);

    /**
     * 添加一张歌单
     *
     * @param sheet
     * @return 插入成功则返回主键，否则为null
     */
    public Long addsongsheet(songsheet sheet);

    /**
     * 创建一张歌单
     *
     * @param songsheetInfo
     * @return
     */
    public int Createsongsheet(songsheet songsheetInfo);

    /**
     * 删除一张歌单
     *
     * @param SheetId
     * @return
     */
    public int deletesongsheet(Long SheetId);

    /**
     * 修改一张歌单的信息
     *
     * @param SS
     * @return
     */
    public int Updatesongsheet(songsheet SS);

    /**
     * 获取一张歌单的信息，根据歌单名和制作人
     *
     * @param SS
     * @return
     */
    public List<songsheet> getsongsheet(songsheet SS);

    /**
     * 分页获取所有歌单信息
     *
     * @param start 页数
     * @param size  每页数量
     * @return
     */
    public List<songsheet> getAllsongsheet(Integer start, Integer size);

    List<songsheet> getsongsheetBytype(Integer start, Integer size, String type);

    /**
     * 获取用户的所有歌单信息
     *
     * @param id
     * @return
     */
    Map<String, List<songsheet>> getUsersongsheet(Long id, String name);

    /**
     * 根据sheetid获得歌单,userid确定歌单是否被收藏
     *
     * @param sheetid
     * @return
     */
    HashMap<String, Object> getSheetByid(Long sheetid, Long userid);

    boolean insertSongSheetRelation(songsheetinfo info);

    boolean IsExist(String name,String creater);

}
