package com.sy.hting.biz.lzy;

import com.sy.hting.dao.lzy.INewServiceReleaseDao;
import com.sy.hting.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/13 14:40
 */
@Service
public class NewServiceReleaseBiz {

    @Resource
    private INewServiceReleaseDao newSerDao;

    /**
     *@描述  新服务发布
     *@参数  [service]
     *@返回值  int
     *@创建人  lizeyun
     *@创建时间  2019/4/13
     *@修改人和其它信息
     */
    public int addServices(Services service){
        return newSerDao.saveServices(service);
    }

}
