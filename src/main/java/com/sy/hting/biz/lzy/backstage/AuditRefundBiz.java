package com.sy.hting.biz.lzy.backstage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lzy.backstage.IAuditRefundDao;
import com.sy.hting.pojo.Refund;
import com.sy.hting.vo.lzy.UserOrderServicesRefundVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/16 0:02
 */
@Service
public class AuditRefundBiz {

    @Resource
    private IAuditRefundDao refundDao;

    /**
     *@描述  加载查询退款信息
     *@参数  [pageNum, pageSize]
     *@返回值  com.github.pagehelper.PageInfo<com.sy.hting.vo.lzy.UserOrderServicesRefundVo>
     *@创建人  lizeyun
     *@创建时间  2019/4/16
     *@修改人和其它信息
     */
    public PageInfo<UserOrderServicesRefundVo> loadUserOrderServicesRefundVo(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<UserOrderServicesRefundVo> pageInfo = new PageInfo<UserOrderServicesRefundVo>(refundDao.loadUserOrderServicesRefundVo());

        return pageInfo;

    }


    public UserOrderServicesRefundVo findUOSRByRefundID(int refundID){
        return refundDao.queryUOSRByRefundID(refundID);
    }


    public int modifyRefund(UserOrderServicesRefundVo refundVo){
        return refundDao.updateRefund(refundVo);
    }

}
