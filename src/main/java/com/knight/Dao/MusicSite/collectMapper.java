package com.knight.Dao.MusicSite;

import com.knight.Bean.collect;
import com.knight.Bean.collectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface collectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    long countByExample(collectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int deleteByExample(collectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insert(collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insertSelective(collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<collect> selectByExample(collectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") collect record, @Param("example") collectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExample(@Param("record") collect record, @Param("example") collectExample example);
}