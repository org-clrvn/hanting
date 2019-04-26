package com.sy.hting.action.lzy.backstage;

import com.sy.hting.biz.lzy.backstage.AuditApplyforRecruitmentBiz;
import com.sy.hting.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@Controller
@RequestMapping("/bt/lzy/c")
public class AuditApplyforRecruitmentAction {

    @Resource
    private AuditApplyforRecruitmentBiz auditBiz;

    /**
     * 后台加载查询商家申请入驻的信息
     * @param model
     * @return
     */
    @GetMapping("skipMerchantsMoveIn")
    public String skipMerchantsMoveIn(Model model){
        //后台加载查询商家申请入驻的信息
        model.addAttribute("userItems", auditBiz.loadUserList());

        return "backstage/Merchants-move-in";
    }

    /**
     * 后台,根据多条件查询申请商家入驻的用户信息
     * @param userName
     * @param merchantType
     * @param auditStatus
     * @return
     */
    @GetMapping("/findUserByObj")
    public String findUserByObj(String userName, int merchantType, int auditStatus, Model model){
        model.addAttribute("userItems", auditBiz.findUserByObj(userName, merchantType, auditStatus));

        return "backstage/Merchants-move-in";
    }

    /**
     * 后台,根据用户编号查询用户信息
     * @param model
     * @return
     */
    @GetMapping("/findUserByUserID")
    public String findUserByUserID(Model model, int userID){
        model.addAttribute("user", auditBiz.findUserByUserID(userID));

        return "backstage/Merchant-entry-modification";
    }

    /**
     * 后台,管理员审核
     * @param user
     * @return
     */
    @PostMapping("/modifyUser")
    public String modifyUser(User user, String sign[]){

        for (int i=0;i<sign.length;i++){
            if (sign[i] != null){
                if ("待审核".equals(sign[i])){
                    user.setAuditStatus(1);
                }else if ("审核通过".equals(sign[i])){
                    user.setAuditStatus(2);
                }else if ("拒绝".equals(sign[i])){
                    user.setAuditStatus(3);
                }
                continue;
            }
        }

        return auditBiz.modifyUser(user)>0 ? "redirect:/bt/lzy/c/skipMerchantsMoveIn":"redirect:/bt/lzy/c/findUserByUserID?userID=7";
    }

}
