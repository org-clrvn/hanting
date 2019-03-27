package com.sy.hting.dao.tj;

import com.sy.hting.vo.OrdersAndServices;

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
}
