package com.sy.hting.dao.cy;

import com.sy.hting.pojo.Orders;
import com.sy.hting.pojo.Refund;
import com.sy.hting.pojo.User;
import com.sy.hting.vo.cy.CollectVo;
import com.sy.hting.vo.cy.OrderDetail;
import com.sy.hting.vo.cy.RefundVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 个人中心
 */
public interface IPersonalDao {

    /*根据用户ID查询用户信息*/
    User queryUserById(@Param("id") Integer id);

    /*根据用户ID和订单状态查询订单*/
    List<OrderDetail> queryOrdersByIdAndStatusId(@Param("uid") Integer uid, @Param("statusId") Integer statusId);

    /*根据订单号查询订单详情*/
    OrderDetail queryOrderByOid(@Param("oid") String oid);

    /*支付*/
    void orderPay(@Param("uid")Integer uid,@Param("totalPrice")Integer totalPrice,@Param("oid") String oid,@Param("Integral")Integer Integral);

    /*取消订单*/
    void orderCancel(@Param("oid")String oid);

    /*查询我的收藏(服务)*/
    List<CollectVo> queryMyCollectByUid(@Param("uid") Integer uid);

    /*添加订单退款信息*/
    void addOrderRefund(@Param("refund") Refund refund);

    /*根据用户ID 查询我所有的退款*/
    List<RefundVo> queryRefundDetail(@Param("uid") Integer uid);

    /*根据订单号查询退款详情*/
    RefundVo queryRefundDetailByOid(@Param("oid") String oid);

    /*申请管理员介入*/
    void applyAdmin(@Param("rid") Integer rid,@Param("oid") String oid);

    /*充值金币*/
    void investMoney(@Param("uid")Integer uid,@Param("money") Integer money,@Param("Integral") Integer Integral);
}
