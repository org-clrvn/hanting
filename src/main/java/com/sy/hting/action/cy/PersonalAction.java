package com.sy.hting.action.cy;

import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.cy.PersonalBiz;
import com.sy.hting.pojo.Orders;
import com.sy.hting.pojo.Refund;
import com.sy.hting.pojo.User;
import com.sy.hting.vo.cy.CollectVo;
import com.sy.hting.vo.cy.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PersonalAction {

    @Autowired
    private PersonalBiz biz;

    @GetMapping("queryUserById/{id}")
    public User queryUserById(@PathVariable Integer id){
        return biz.queryUserById(id);
    }

    @GetMapping("queryOrdersByIdAndStatusId/{uid}/{statusId}/{pageNum}/{pageSize}")
    public PageInfo<OrderDetail> queryOrdersByIdAndStatusId(@PathVariable Integer uid, @PathVariable Integer statusId, @PathVariable Integer pageNum, @PathVariable Integer pageSize){
       return biz.queryOrdersByIdAndStatusId(uid,statusId,pageNum,pageSize);
    }

    @GetMapping("queryOrderByOid/{oid}")
    public OrderDetail queryOrderByOid(@PathVariable String oid){
        return biz.queryOrderByOid(oid);
    }

    @GetMapping("orderPay/{uid}/{totalPrice}/{oid}")
    public Map<String,String> orderPay(@PathVariable Integer uid,@PathVariable Integer totalPrice,@PathVariable String oid){

        Map<String,String> map = new HashMap<>();
        try{
            biz.orderPay(uid,totalPrice,oid);
            map.put("code","200");
        }catch (Exception e){
            map.put("code","400");
            e.printStackTrace();
        }
        return map;
    }

    @GetMapping("orderCancel/{oid}")
    public Map<String,String> orderCancel(@PathVariable String oid){

        Map<String,String> map = new HashMap<>();
        try{
            biz.orderCancel(oid);
            map.put("code","200");
        }catch (Exception e){
            map.put("code","400");
            e.printStackTrace();
        }
        return map;
    }

    @GetMapping("queryMyCollectByUid/{uid}/{pageNum}/{pageSize}")
    public  PageInfo<CollectVo> queryMyCollectByUid(@PathVariable Integer uid,@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return  biz.queryMyCollectByUid(uid,pageNum,pageSize);
    }

    @GetMapping("addOrderRefund")
    public void addOrderRefund(MultipartFile myFile,String orderID,
                              String refundReason, Integer userID,
                               Float applyRefundMoney,String refundExplain){
        System.err.println(orderID);
        Refund refund = new Refund();

        /*退款提交时间*/
        refund.setApplicationTime(new Date());
        /*审核指向（1.商家 2.管理员）*/
        refund.setPoint(1);
        refund.setOrderID(orderID);
        refund.setApplyRefundMoney(applyRefundMoney);
        refund.setRefundExplain(refundExplain);
        refund.setRefundReason(refundReason);

        //biz.addOrderRefund(refund);
    }
}
