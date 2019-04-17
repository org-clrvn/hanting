package com.sy.hting.biz.lzy.backstage;

import com.sy.hting.dao.lzy.backstage.IAuditApplyforRecruitmentDao;
import com.sy.hting.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AuditApplyforRecruitmentBiz {

    @Resource
    private IAuditApplyforRecruitmentDao auditDao;

    /**
     * 后台加载查询商家申请入驻的信息
     * @return
     */
    public List<User> loadUserList(){
        return auditDao.loadUserList();
    }

    /**
     * 后台,根据多条件查询申请商家入驻的用户信息
     * @param userName
     * @param merchantType
     * @param auditStatus
     * @return
     */
    public List<User> findUserByObj(String userName, int merchantType, int auditStatus){
        return auditDao.queryUserByObj(userName, merchantType, auditStatus);
    }

    /**
     * 后台,根据用户编号查询用户信息
     * @param userID
     * @return
     */
    public User findUserByUserID(int userID){
        return auditDao.queryUserByUserID(userID);
    }

    /**
     * 后台,管理员审核
     * @param user
     * @return
     */
    public int modifyUser(User user){ return auditDao.updateUser(user); }

}
