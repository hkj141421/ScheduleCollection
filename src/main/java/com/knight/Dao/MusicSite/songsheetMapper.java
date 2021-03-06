package com.knight.Dao.MusicSite;

import com.knight.Bean.songsheet;
import com.knight.Bean.songsheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface songsheetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    long countByExample(songsheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int deleteByExample(songsheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insert(songsheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insertSelective(songsheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<songsheet> selectByExampleWithBLOBs(songsheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<songsheet> selectByExample(songsheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") songsheet record, @Param("example") songsheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") songsheet record, @Param("example") songsheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExample(@Param("record") songsheet record, @Param("example") songsheetExample example);
}