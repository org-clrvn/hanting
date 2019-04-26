package com.sy.hting.action.lzy.backstage;

import com.alibaba.fastjson.JSON;
import com.sy.hting.biz.lzy.backstage.AuditRefundBiz;
import com.sy.hting.vo.lzy.UserOrderServicesRefundVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/16 0:02
 */
@Controller
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
        System.out.println("refundID = " + refundID);
       // System.out.println(refundBiz.findUOSRByRefundID(refundID).getRefundstatus());
        model.addAttribute("data", refundBiz.findUOSRByRefundID(refundID));

        return "backstage/Refund";
    }


    @PostMapping("/modifyRefund")
    public String modifyRefund(UserOrderServicesRefundVo refundVo, String sign[]){
        System.out.println("JSON.toJSON(refundVo) = " + JSON.toJSON(refundVo));
        for (int i=0;i<sign.length;i++){
            System.err.println(sign[i]);
            if (sign[i] != null){
                if ("同意退款".equals(sign[i])){
                    refundVo.setAdminStatus(2);
                }else if ("拒绝退款".equals(sign[i])){
                    refundVo.setAdminStatus(3);
                }
                System.out.println("adminStatus = " + refundVo.getAdminStatus());
                continue;
            }
        }
        System.out.println(refundVo.getAdminStatus());
        return refundBiz.modifyRefund(refundVo)>0 ? "redirect:/bt/lzy/c/loadUserOrderServicesRefundVo?num=1&size=2":"redirect:/bt/lzy/c/findUOSRByRefundID?refundID=43";
    }

}
