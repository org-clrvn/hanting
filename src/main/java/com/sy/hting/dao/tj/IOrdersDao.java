package com.sy.hting.dao.tj;

import com.sy.hting.pojo.Goldnotes;
import com.sy.hting.pojo.Integralrecord;
import com.sy.hting.vo.tj.OrdersAndServices;

import java.util.List;

public interface IOrdersDao {
    /**
     * 查询最近预约服务
     * @param id
     * @return
     */
    List<OrdersAndServices> queryOas(Integer id);

    /**
     * 查询待付款订单
     * @param id
     * @return
     */
    List<OrdersAndServices> queryOrderDfk(Integer id);

    /**
     * 查询金币流向操作记录
     * @param id
     * @return
     */
    List<Goldnotes> queryGoldnotes(Integer id,Integer am);

    /**
     * 查询积分流向操作记录
     * @param id
     * @return
     */
    List<Integralrecord> queryIntegralRecord(Integer id);
}
