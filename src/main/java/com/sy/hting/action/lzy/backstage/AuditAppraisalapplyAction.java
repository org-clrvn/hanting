package com.sy.hting.action.lzy.backstage;

import com.alibaba.fastjson.JSON;
import com.sy.hting.biz.lzy.backstage.AuditAppraisalapplyBiz;
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
 * @Time 2019/5/10 9:41
 */
@Controller
@RequestMapping("/bt/lzy/c")
public class AuditAppraisalapplyAction {

    @Resource
    private AuditAppraisalapplyBiz appraisalapplyBiz;

    @GetMapping("/loadAppSertypeVo")
    public String loadAppSertypeVo(int num, int size, Model model){
        model.addAttribute("appSertype", appraisalapplyBiz.loadAppSertypeVo(num, size, 0));

        return "backstage/Appraisal-audit";
    }

    @GetMapping("/findAppSertypeVoByApplyID")
    public String findAppSertypeVoByApplyID(int applyID, Model model){
        model.addAttribute("data", appraisalapplyBiz.findAppSertypeVoByApplyID(applyID).get(0));

        return "backstage/Appraisal-application";
    }

    @PostMapping("/modifyAppSertypeVoByApplyID")
    public String modifyAppSertypeVoByApplyID(int auditStatus, String adminOpinion, int applyID){
        appraisalapplyBiz.modifyAppSertypeVoByApplyID(auditStatus, adminOpinion, applyID);

        return "redirect:/bt/lzy/c/loadAppSertypeVo?num=1&size=6";
    }

}
