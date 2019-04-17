package com.sy.hting.biz.lzy.backstage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lzy.backstage.IAuditNewServicesReleaseDao;
import com.sy.hting.pojo.*;
import com.sy.hting.vo.lzy.SerUserSertypeVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/13 15:08
 */
@Service
public class AuditNewServicesReleaseBiz {

    @Resource
    private IAuditNewServicesReleaseDao newSerDao;

    /**
     *@描述  后台,加载查询新服务的信息
     *@参数  [pageNum, pageSize]
     *@返回值  com.github.pagehelper.PageInfo<com.sy.hting.pojo.Services>
     *@创建人  lizeyun
     *@创建时间  2019/4/14
     *@修改人和其它信息
     */
    public PageInfo<SerUserSertypeVo> loadSerUserSertypeVoList(int pageNum, int pageSize, int userID){
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<SerUserSertypeVo> pageInfo = new PageInfo<SerUserSertypeVo>(newSerDao.loadSerUserSertypeVoList(userID));

        return pageInfo;
    }

    /**
     *@描述  根据serviceID查询单个SerUserSertypeVo对象
     *@参数  [userID, serviceID]
     *@返回值  com.sy.hting.vo.lzy.SerUserSertypeVo
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    public SerUserSertypeVo findSerUserSertypeVoByServiceID(int userID, int serviceID){
        return newSerDao.querySerUserSertypeVoByServiceID(userID, serviceID);

    }

    /**
     *@描述  后台,审核新服务发布
     *@参数  [services]
     *@返回值  int
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    public int modifyServicesByServiceID(Services services){/*recommendBool, adminOpinion, shelfState, auditStatus, serviceID*/
        return newSerDao.updateServicesByServiceID(services);
    }

}
