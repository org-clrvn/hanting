package com.sy.hting.dao.lzy;

import com.sy.hting.pojo.Services;
import org.apache.ibatis.annotations.Param;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/13 14:37
 */
public interface INewServiceReleaseDao {

    /**
     * 新服务发布
     * @param service
     * @return
     */
    public int saveServices(@Param("service") Services service);

}
