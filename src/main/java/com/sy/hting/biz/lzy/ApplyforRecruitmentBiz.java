package com.sy.hting.biz.lzy;

import com.sy.hting.dao.lzy.IApplyforRecruitmentDao;
import com.sy.hting.pojo.*;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.System;
import java.util.List;

@Service
public class ApplyforRecruitmentBiz {

    @Resource
    private IApplyforRecruitmentDao recruitmentDao;

    /**
     * 登录查询用户信息
     * @param userID
     * @return
     */
    public User loginQueryUserByUserID(int userID){
        return recruitmentDao.loginQueryUserByUserID(userID);
    }

    /**
     * 申请商家入驻页面加载时，查询服务类别表的所有信息
     * @return
     */
    public List<Servicetype> loadServicetypeList(){
        return recruitmentDao.loadServicetypeList();
    }

    /**
     * 申请商家入驻页面加载时，查询系统配置表的信息
     * @return
     */
    public com.sy.hting.pojo.System loadSystem(){
        return recruitmentDao.loadSystem();
    }

    /**
     * 申请商家入驻页面加载时，查询服务语言表的所有信息
     * @return
     */
    public List<Languagetype> loadLanguagetypeList(){
        return recruitmentDao.loadLanguegetypeList();
    }

    /**
     * 申请商家入驻页面加载时，查询专业表的所有信息
     * @return
     */
    public List<Majortype> loadMajortypeList(){
        return recruitmentDao.loadMajortypeList();
    }

    /**
     * 申请商家入驻页面加载时，查询中韩行政地区表的所有信息
     * @return
     */
    public List<Sharea> loadShareaItems(int pid){
        return recruitmentDao.loadShareaItems(pid);
    }

    /**
     * 申请商家入驻页面加载时，查询所在城市的信息
     * @return
     */
    public List<Sharea> loadShareaList(){ return recruitmentDao.loadShareaList(); }

    /**
     * 所在城市
     * @param pid
     * @return
     */
    public List<Sharea> findShareaList(int pid){
        return recruitmentDao.queryShareaList(pid);
    }

    /**
     *@描述  判断用户是否注册
     *@参数  [userID]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/22
     *@修改人和其它信息
     */
    public String findUserNameByUserName(int userID){
        String userName = recruitmentDao.queryUserNameByUserID(userID);
        System.out.println(userName);
        return userName;
    }

    /**
     * 提交申请商家入驻信息
     * @param user
     * @return
     */
    public int modifyRecruitmentUser(User user) {
        return recruitmentDao.updateRecruitmentUser(user);
    }

}
