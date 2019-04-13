package com.sy.hting.biz.cy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.cy.IPersonalDao;
import com.sy.hting.pojo.Orders;
import com.sy.hting.pojo.Refund;
import com.sy.hting.pojo.User;
import com.sy.hting.vo.cy.CollectVo;
import com.sy.hting.vo.cy.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly= true)
@SuppressWarnings("all")
public class PersonalBiz {

    @Autowired
    private IPersonalDao dao;


    public User queryUserById(Integer id){
        return dao.queryUserById(id);
    }

    public PageInfo<OrderDetail> queryOrdersByIdAndStatusId(Integer uid, Integer statusId, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(dao.queryOrdersByIdAndStatusId(uid,statusId));
    }

    public OrderDetail queryOrderByOid(String oid){
        return dao.queryOrderByOid(oid);
    }

    public void orderPay(Integer uid,Integer totalPrice,String oid){
        dao.orderPay(uid,totalPrice,oid,(int)(totalPrice*0.1));
    };

    public void orderCancel(String oid){
        dao.orderCancel(oid);
    }

    public PageInfo<CollectVo> queryMyCollectByUid(Integer uid,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return  new PageInfo<>(dao.queryMyCollectByUid(uid));
    }

    public void addOrderRefund( Refund refund){
        dao.addOrderRefund(refund);
    }
}
