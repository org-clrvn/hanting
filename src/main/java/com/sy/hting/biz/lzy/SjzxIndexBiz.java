package com.sy.hting.biz.lzy;

import com.sy.hting.dao.lzy.ISjzxIndexDao;
import com.sy.hting.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 21:57
 */
@Service
public class SjzxIndexBiz {

    @Resource
    private ISjzxIndexDao indexDao;

    /**
     *@描述  加载查询商家中心列表信息--商家信息
     *@参数  [userID]
     *@返回值  com.sy.hting.pojo.User
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    public User loadUserByUserID(int userID){
        return indexDao.loadUserByUserID(userID);
    }

}
