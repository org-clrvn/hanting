package com.sy.hting.biz.tj;

import com.sy.hting.dao.tj.IOrdersDao;
import com.sy.hting.vo.tj.OrdersAndServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS, readOnly = true)
public class OrdersAndServicesBiz {
    @Autowired
    private IOrdersDao dao;

    /**
     * 查询最新订单
     * @param id
     * @return
     */
    public List<OrdersAndServices> queryOas(Integer id){
        return dao.queryOas(id);
    }

    /**
     * 查询待付款订单
     * @param id
     * @return
     */
    public List<OrdersAndServices> queryOrderDfk(Integer id){
        return dao.queryOrderDfk(id);
    }
}
