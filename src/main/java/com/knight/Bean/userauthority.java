package com.knight.Bean;

public class userauthority {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userauthority.UserID
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userauthority.RoleID
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    private Long roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userauthority.UserID
     *
     * @return the value of userauthority.UserID
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userauthority.UserID
     *
     * @param userid the value for userauthority.UserID
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userauthority.RoleID
     *
     * @return the value of userauthority.RoleID
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userauthority.RoleID
     *
     * @param roleid the value for userauthority.RoleID
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}