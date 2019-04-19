package com.sy.hting.biz.lsy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lsy.LsyIUserDao;
import com.sy.hting.vo.gsh.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LsyUserBiz {
    @Autowired
    private LsyIUserDao dao;

    public PageInfo<UserVo> findUserListByPage(Integer pageNum, Integer pageSize, String userNickName) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<UserVo>(dao.queryUser(userNickName));
    }

    public PageInfo<UserVo> queryShop(Integer pageNum, Integer pageSize,String userName,String shopName,String merchantType) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<UserVo>(dao.queryShop(userName, shopName, merchantType));
    }
}
