package com.sy.hting.dao.lzy.backstage;

import com.sy.hting.vo.lzy.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/5/10 9:25
 */
public interface IAuditAppraisalapplyDao {

    List<AppSertypeVo> loadAppSertypeVo(@Param("applyID") int applyID);

    int updateAppSertypeVoByApplyID(@Param("auditStatus")int auditStatus, @Param("adminOpinion")String adminOpinion, @Param("applyID")int applyID);
}
