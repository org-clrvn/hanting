package com.sy.hting.biz.lzy;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lzy.ISjrzOrderDao;
import com.sy.hting.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.System;
import java.util.List;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/8 9:40
 */
@Service
public class SjrzOrderBiz {

    @Resource
    private ISjrzOrderDao orderDao;

    /**
     *@描述
     *@参数  [pageNum, pageSize, userID]
     *@返回值  com.github.pagehelper.PageInfo<com.sy.hting.pojo.Services>
     *@创建人  lizeyun
     *@创建时间  2019/4/17
     *@修改人和其它信息
     */
    public PageInfo<Services> loadServicesList(int pageNum, int pageSize, int userID){
        PageHelper.startPage(pageNum, pageSize);

        PageInfo<Services> pageInfo = new PageInfo<Services>(orderDao.loadServicesList(userID));

        return pageInfo;
    }

    /**
     *@描述
     *@参数  [userID]
     *@返回值  java.util.List<com.sy.hting.pojo.Orders>
     *@创建人  lizeyun
     *@创建时间  2019/4/17
     *@修改人和其它信息
     */
    public PageInfo<Orders> loadOrdersList(int userID, int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        //System.out.println("biz:"+ JSON.toJSON(orderDao.loadOrdersList(userID).get(0)));
        PageInfo<Orders> pageInfo = new PageInfo<Orders>(orderDao.loadOrdersList(userID));

        return pageInfo;
    }

    public int judgeServices(int userID){
        return orderDao.judgeServices(userID);
    }

    /**
     * 加载查询商家用户的服务类别编号
     * @param userID
     * @return
     */
    public User loadFirBecServiceIDByUserID(int userID){
        return orderDao.loadFirBecServiceIDByUserID(userID);
    }

    /**
     *@描述  判断登录用户是否为商家
     *@参数  [userID]
     *@返回值  com.sy.hting.pojo.User
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    public int judgeAuditStatusByUserID(int userID){
        System.out.println("判断登录用户是否为商家:"+orderDao.judgeAuditStatusByUserID(userID));
        return orderDao.judgeAuditStatusByUserID(userID);
    }

}
