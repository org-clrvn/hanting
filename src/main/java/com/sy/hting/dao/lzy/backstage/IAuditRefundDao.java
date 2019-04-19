package com.sy.hting.dao.lzy.backstage;

import com.sy.hting.pojo.Refund;
import com.sy.hting.vo.lzy.UserOrderServicesRefundVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/16 0:02
 */
public interface IAuditRefundDao {

    /**
     * 加载查询退款信息
     * @return
     */
    public List<UserOrderServicesRefundVo> loadUserOrderServicesRefundVo();


    public UserOrderServicesRefundVo queryUOSRByRefundID(@Param("refundID") int refundID);


    public int updateRefund(@Param("refundVo")UserOrderServicesRefundVo refundVo);

}
