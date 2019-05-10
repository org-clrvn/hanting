package com.sy.hting.dao.lzy.backstage;

import com.sy.hting.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IAuditApplyforRecruitmentDao {

    /**
     * 后台,加载查询商家申请入驻的信息
     * @return
     */
    public List<User> loadUserList();

    /**
     * 后台,根据多条件查询申请商家入驻的用户信息
     * @param userName
     * @param merchantType
     * @param auditStatus
     * @return
     */
    public List<User> queryUserByObj(@Param("userName") String userName, @Param("merchantType") int merchantType, @Param("auditStatus") int auditStatus);

    /**
     * 后台,根据用户编号查询用户信息
     * @param UserID
     * @return
     */
    public User queryUserByUserID(@Param("userID") int UserID);

    public int[] queryFirSecByUserID(@Param("userID") int userID);

    /**
     * 后台,管理员审核
     * @param user
     * @return
     */
    public int updateUser(@Param("user") User user, @Param("data")int[] data);

}
