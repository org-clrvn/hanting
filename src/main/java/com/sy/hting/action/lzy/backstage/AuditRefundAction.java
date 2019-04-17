package com.sy.hting.action.lzy.backstage;

import com.sy.hting.biz.lzy.backstage.AuditRefundBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/16 0:02
 */
@Controller()
@RequestMapping("/bt/lzy/c")
public class AuditRefundAction {

    @Resource
    private AuditRefundBiz refundBiz;

    /**
     *@描述  加载查询退款信息
     *@参数  [num, size, model]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/16
     *@修改人和其它信息
     */
    @GetMapping("/loadUserOrderServicesRefundVo")
    public String loadUserOrderServicesRefundVo(int num, int size, Model model){
        model.addAttribute("data", refundBiz.loadUserOrderServicesRefundVo(num, size));

        return "backstage/Audit_service";
    }

    @GetMapping("/findUOSRByRefundID")
    public String findUOSRByRefundID(int refundID, Model model){
        model.addAttribute("data", refundBiz.findUOSRByRefundID(refundID));

        return "backstage/Refund";
    }

}
