package com.sy.hting.action.lzy.backstage;

import com.sy.hting.biz.lzy.backstage.AuditNewServicesReleaseBiz;
import com.sy.hting.pojo.Services;
import com.sy.hting.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/26 15:08
 */
@Controller
@RequestMapping("/bt/lzy/c")
public class AuditNewServicesReleaseAction {

    @Resource
    private AuditNewServicesReleaseBiz newSerBiz;

    /**
     *@描述  后台,加载查询新服务的信息
     *@参数  [num, size, model]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/14
     *@修改人和其它信息
     */
    @GetMapping("/loadSerUserSertypeVoList")
    public String loadSerUserSertypeVoList(int num, int size, Model model, HttpSession session){
        User user = (User)session.getAttribute("user");
        //user.getUserID();

        System.err.println(newSerBiz.loadSerUserSertypeVoList(num, size ,26).getList());;
        model.addAttribute("serList", newSerBiz.loadSerUserSertypeVoList(num, size, 26));

        return "backstage/Refund_Management";
    }

    /**
     *@描述  根据serviceID查询单个SerUserSertypeVo对象
     *@参数  [userID, serviceID]
     *@返回值  com.sy.hting.vo.lzy.SerUserSertypeVo
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    @GetMapping("/findSerUserSertypeVoByServiceID")
    public String findSerUserSertypeVoByServiceID(int serviceID, HttpSession session, Model model){
        User user = (User)session.getAttribute("user");
        //user.getUserID();

        model.addAttribute("serData", newSerBiz.findSerUserSertypeVoByServiceID(26, serviceID));

        return "backstage/Update_audit";
    }

    /**
     *@描述  后台,审核新服务发布
     *@参数  [services]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    @PostMapping("/modifyServicesByServiceID")/*int recommendBool, String adminOpinion, int shelfState, int auditStatus, int serviceID*/
    public String modifyServicesByServiceID(Services services){
        return newSerBiz.modifyServicesByServiceID(services)>0 ? "redirect:/bt/lzy/c/loadSerUserSertypeVoList?num=1&size=2":"redirect:/bt/lzy/c/findSerUserSertypeVoByServiceID?serviceID=42";
    }

}
