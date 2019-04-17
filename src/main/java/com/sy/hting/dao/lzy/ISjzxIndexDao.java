package com.sy.hting.dao.lzy;

import com.sy.hting.pojo.User;
import org.apache.ibatis.annotations.Param;


/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 21:56
 */
public interface ISjzxIndexDao {

    /**
     * 加载查询商家中心列表信息--商家信息
     * @param userID
     * @return
     */
    public User loadUserByUserID(@Param("userID") int userID);

}
