package com.sy.hting.biz.tj;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.tj.IOrdersDao;
import com.sy.hting.pojo.Goldnotes;
import com.sy.hting.pojo.Integralrecord;
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

    /**
     * 查询金币流向操作记录
     * @param id
     * @return
     */
    public PageInfo<Goldnotes> queryGoldnotes(Integer id,Integer p,Integer s,Integer am){
        PageHelper.startPage(p,s);
        return new PageInfo<Goldnotes>(dao.queryGoldnotes(id,am));
    }

    /**
     * 查询积分流向操作记录
     * @param id
     * @param p
     * @param s
     * @return
     */
    public PageInfo<Integralrecord> queryIntegralRecord(Integer id,Integer p,Integer s){
        PageHelper.startPage(p,s);
        return new PageInfo<Integralrecord>(dao.queryIntegralRecord(id));
    }
}
