package com.sy.hting.dao.lzy.backstage;

import com.sy.hting.pojo.*;
import com.sy.hting.vo.lzy.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/13 15:04
 */
public interface IAuditNewServicesReleaseDao {

    /**
     * 后台,加载新服务信息
     * @return
     */
    public List<SerUserSertypeVo> loadSerUserSertypeVoList(@Param("userID") int userID);


    public SerUserSertypeVo querySerUserSertypeVoByServiceID(@Param("userID") int userID, @Param("serviceID") int serviceID);

    /**
     * 后台,审核新服务发布
     * @param services
     * @return
     */
    int updateServicesByServiceID(@Param("services") Services services);
    /*@Param("recommendBool") int recommendBool, @Param("adminOpinion") String adminOpinion, @Param("shelfState") int shelfState, @Param("auditStatus") int auditStatus, @Param("serviceID") int serviceID*/
}
