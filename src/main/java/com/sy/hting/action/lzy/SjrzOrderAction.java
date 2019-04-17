package com.sy.hting.action.lzy;

import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lzy.SjrzOrderBiz;
import com.sy.hting.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.lang.System;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/8 9:47
 */

@SuppressWarnings("ALL")
@Controller
@RequestMapping("/lzy/c")
public class SjrzOrderAction {

    @Resource
    private SjrzOrderBiz orderBiz;

    /**
     *@描述  加载查询商家中心-订单列表
     *@参数  [num, size, model]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/8
     *@修改人和其它信息
     */
    @GetMapping("/loadOrdersList")
    public String loadOrdersList(int num, int size, Model model, HttpSession session){
        User userCount = (User) session.getAttribute("user");
        /*userCount.getUserID()*/

        //加载查询商家中心-订单列表-订单表
        PageInfo<Orders> data = orderBiz.loadOrdersList(num, size, 29);
        System.out.println("action:"+data.getList());
        model.addAttribute("ordersList", data);

        return "sjzx-order";
    }

    @GetMapping("/getServicesListByUserID")
    public String getServicesListByUserID(int num, int size, HttpSession session, Model model){
        User userCount = (User) session.getAttribute("user");
        /*userCount.getUserID()*/

        model.addAttribute("ServicesList", orderBiz.loadServicesList(num, size, 29));

        return "sjzx-services";
    }

    @GetMapping("/loadFirBecServiceIDByUserID")
    public String loadFirBecServiceIDByUserID(HttpSession session, Model model){
        User userCount = (User) session.getAttribute("user");
        /*userCount.getUserID()*/
        User user = orderBiz.loadFirBecServiceIDByUserID(29);

        if (user != null){
            model.addAttribute("user", user);
        }

        return "sjzx-xzfwlb";
    }

    @GetMapping("/clickSjzx")
    public String clickSjzx(HttpSession session){
        User user = (User)session.getAttribute("user");
        if (user == null){
            return ""; //跳登录页面
        }else {//user.getUserID()
            if (orderBiz.judgeUserAuditStatusByUserID(user.getUserID()) != null){
                return "sjrz-yktsj"; //商家中心中转页面
            }else {
                return "sjrz-xz"; //商家入驻(下一步)页面
            }
        }
    }

    @GetMapping("/clickSjzxSucceed")
    public String clickSjzxSucceed(HttpSession session){
        User user = (User)session.getAttribute("user");
        if (user != null && orderBiz.judgeUserAuditStatusByUserID(user.getUserID()) != null){
            return "redirect:/lzy/c/loadUserOrderList?num=1&size=2";
        }else {
            return "redirect:/lzy/c/clickSjzx";
        }
    }

    @GetMapping("/skipPage")
    public String skipSjrzShzlPage(HttpSession session){
        User user = (User)session.getAttribute("user");
        //user.getUserID()
        return orderBiz.judgeUserAuditStatusByUserID(29)!=null ? "sjrz-yktsj":"sjrz-shzl";
    }

    @GetMapping("/skipSjzxXzjPage")
    public String skipSjzxXzjPage(){

        return "sjrz-xz";
    }

    @GetMapping("/skipSjzxYktsjPage")
    public String skipSjzxYktsjPage(){

        return "sjrz-yktsj";
    }


    @GetMapping("/skipSjzxFbfwPage")
    public String skipSjzxFbfwPage(){

        return "sjzx-fbfw";
    }

    @GetMapping("/skipSjzxHwfyfbPage")
    public String skipSjzxHwfyfbPage(){

        return "sjzx-hwfyfb";
    }

    @GetMapping("/skipSjzxWzxfbPage")
    public String skipSjzxWzxfbPage(){

        return "sjzx-wzxfb";
    }

    @GetMapping("/skipSjzxXxzyfbPage")
    public String skipSjzxXxzyfbPage(){

        return "sjzx-xxzyfb";
    }

    @GetMapping("/skipSjzxZjyfbfwPage")
    public String skipSjzxZjyfbfwPage(){

        return "sjzx-zjyfbfw";
    }

    @GetMapping("/skipSjzxXzfwlbPage")
    public String skipSjzxXzfwlbPage(){

        return "sjzx-xzfwlb";
    }

    @GetMapping("/skipSjzxServicesPage")
    public String skipSjzxServicesPage(){

        return "sjzx-services";
    }

}
