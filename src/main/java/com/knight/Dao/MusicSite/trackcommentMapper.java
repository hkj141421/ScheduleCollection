package com.knight.Dao.MusicSite;

import com.knight.Bean.trackcomment;
import com.knight.Bean.trackcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface trackcommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    long countByExample(trackcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int deleteByExample(trackcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insert(trackcomment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insertSelective(trackcomment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<trackcomment> selectByExampleWithBLOBs(trackcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<trackcomment> selectByExample(trackcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") trackcomment record, @Param("example") trackcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") trackcomment record, @Param("example") trackcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExample(@Param("record") trackcomment record, @Param("example") trackcommentExample example);
}