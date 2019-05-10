package com.sy.hting.biz.lzy;

import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lzy.ISjzxIndexDao;
import com.sy.hting.pojo.*;
import com.sy.hting.vo.lzy.AppSertypeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     *@描述  加载查询商家中心--我提交的鉴定
     *@参数  [pageNum, pageSize, userID]
     *@返回值  com.github.pagehelper.PageInfo<com.sy.hting.pojo.Appraisalapply>
     *@创建人  lizeyun
     *@创建时间  2019/4/28
     *@修改人和其它信息
     */
    public List<AppSertypeVo> loadAppraisalapplyList(int userID){

        return indexDao.loadAppraisalapplyList(userID);
    }

    /**
     * 提交鉴定
     * @param appraisalapply
     * @return
     */
    public int modifyAppraisalapplyByApplyID(Appraisalapply appraisalapply){
        return indexDao.updateAppraisalapplyByApplyID(appraisalapply);
    }

}
