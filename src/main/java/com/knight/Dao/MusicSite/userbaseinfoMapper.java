package com.knight.Dao.MusicSite;

import com.knight.Bean.userbaseinfo;
import com.knight.Bean.userbaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface userbaseinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    long countByExample(userbaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int deleteByExample(userbaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insert(userbaseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int insertSelective(userbaseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<userbaseinfo> selectByExampleWithBLOBs(userbaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    List<userbaseinfo> selectByExample(userbaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") userbaseinfo record, @Param("example") userbaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") userbaseinfo record, @Param("example") userbaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbaseinfo
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    int updateByExample(@Param("record") userbaseinfo record, @Param("example") userbaseinfoExample example);


}