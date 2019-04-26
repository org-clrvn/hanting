package com.sy.hting.dao.lzy;

import com.sy.hting.pojo.*;
import com.sy.hting.pojo.System;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IApplyforRecruitmentDao {

    /**
     * 登录查询用户信息
     * @param userID
     * @return
     */
    public User loginQueryUserByUserID(@Param("userID") int userID);

    /**
     * 申请商家入驻页面加载时，查询服务类别表的所有信息
     * @return
     */
    public List<Servicetype> loadServicetypeList();

    /**
     * 申请商家入驻页面加载时，查询系统配置表的信息
     * @return
     */
    public System loadSystem();

    /**
     * 申请商家入驻页面加载时，查询服务语言表的所有信息
     * @return
     */
    public List<Languagetype> loadLanguegetypeList();

    /**
     * 申请商家入驻页面加载时，查询专业表的所有信息
     * @return
     */
    public List<Majortype> loadMajortypeList();

    /**
     * 申请商家入驻页面加载时，查询专业表的所有信息
     * @return
     */
    public List<Sharea> loadShareaItems(@Param("pid") int pid);

    /**
     * 申请商家入驻页面加载时，查询所在城市的信息
     * @return
     */
    public List<Sharea> loadShareaList();

    /**
     * 所在城市
     * @param pid
     * @return
     */
    public List<Sharea> queryShareaList(@Param("pid") int pid);

    /**
     * 判断用户是否注册
     * @param userID
     * @return
     */
    public String queryUserNameByUserID(@Param("userID") int userID);

    /**
     * 提交申请商家入驻信息
     * @param user
     * @return
     */
    public int updateRecruitmentUser(@Param("user") User user);

}
