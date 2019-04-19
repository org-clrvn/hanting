package com.sy.hting.dao.cy;

import com.sy.hting.vo.cy.OrderDetail;
import com.sy.hting.vo.cy.RefundVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IBusinessDao {

    /*根据商家ID 查询所有退款*/
    List<RefundVo> queryAllRefund(@Param("sid") Integer sid);

    /*同意退款*/
    void agreeRefund(@Param("rid")Integer rid,@Param("oid")String oid,@Param("handleTime")Date handleTime,
                     @Param("uid") Integer uid,@Param("money") Integer money,@Param("integral") Integer integral);

    /*拒绝退款*/
    void disagreeRefund(@Param("rid")Integer rid, @Param("oid")String oid,
                        @Param("reason")String reason, @Param("handleTime")Date handleTime);

    /*查询商家收到的所有的预定(订单号，订单状态，商家ID)*/
    List<OrderDetail> queryBusinessOrder(@Param("oid") String oid,@Param("status") Integer status,@Param("uid") Integer uid);
}
