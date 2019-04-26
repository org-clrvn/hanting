package com.sy.hting.dao.lzy;

import com.sy.hting.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/8 9:04
 */
public interface ISjrzOrderDao {

    /**
     * 加载查询商家中心-订单列表-订单表
     * @return
     */
    public List<Orders> loadOrdersList(@Param("userID") int userID);

    /**
     * 加载查询商家中心-订单列表-服务表(商品表)
     * @return
     */
    public List<Services> loadServicesList(@Param("userID") int userID);


    public int judgeServices(@Param("userID") int userID);

    /**
     * 加载查询商家用户的服务类别编号
     * @param userID
     * @return
     */
    public User loadFirBecServiceIDByUserID(@Param("userID") int userID);

    /**
     * 判断登录用户是否为商家
     * @param userID
     * @return
     */
    public int judgeAuditStatusByUserID(@Param("userID") int userID);

}
