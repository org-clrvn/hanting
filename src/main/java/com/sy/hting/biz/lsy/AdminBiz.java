package com.sy.hting.biz.lsy;

import com.sy.hting.dao.lsy.IAdminDao;
import com.sy.hting.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS, readOnly = true)
public class AdminBiz {

    @Autowired
    private IAdminDao dao;

    /**
     * @description:登录后台
     * @param name 登录的管理员名称
     * @return
     */
    public Admin login(String name, String password){
        return dao.login(name, password);
    }
}


