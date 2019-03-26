package com.sy.hting.biz.tj;

import com.sy.hting.dao.tj.IUsesDao;
import com.sy.hting.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS, readOnly = true)
public class UserBiz {

    @Autowired
    private IUsesDao dao;

    public User findUserById(Integer id) {
        return dao.findUserById(id);
    }
}
