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

        //加载查询商家中心-订单列表-订单表
        PageInfo<Orders> data = orderBiz.loadOrdersList(num, size, userCount.getUserID());
        System.out.println("action:"+data.getList());
        model.addAttribute("ordersList", data);

        return "lzyQianstage/sjzx-order";
    }
    /**
     *@描述
     *@参数  [num, size, session, model]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/19
     *@修改人和其它信息
     */
   /* @GetMapping("/getServicesListByUserID")
    public String getServicesListByUserID(int num, int size, HttpSession session, Model model) {
        User userCount = (User) session.getAttribute("USER");
        *//*userCount.getUserID()*//*

        model.addAttribute("ServicesList", orderBiz.loadServicesList(num, size, userCount.getUserID(), null));

        return "";
    }*/

    @GetMapping("/getServicesListByUserID")
    public String getServicesListByUserID(int num, int size, HttpSession session, Model model, String serviceTitle){
        User userCount = (User) session.getAttribute("USER");
        System.out.println("serviceTitle = " + serviceTitle);
        model.addAttribute("ServicesList", orderBiz.loadServicesList(num, size, userCount.getUserID(), serviceTitle));


        return "lzyQianstage/sjzx-services";
    }

    @GetMapping("/loadFirBecServiceIDByUserID")
    public String loadFirBecServiceIDByUserID(HttpSession session, Model model){
        User userCount = (User) session.getAttribute("USER");

        User user = orderBiz.loadFirBecServiceIDByUserID(userCount.getUserID());

        if (user != null){
            model.addAttribute("user", user);
        }

        return "lzyQianstage/sjzx-xzfwlb";
    }


    @GetMapping("/clickSjzx")
    public String clickSjzx(HttpSession session) {
        User userCount = (User) session.getAttribute("USER");
        if (userCount == null) {
            return ""; //跳登录页面
        } else {//user.getUserID()
            if (orderBiz.judgeAuditStatusByUserID(userCount.getUserID()) == 2) {
                return "lzyQianstage/sjrz-yktsj"; //商家中心中转页面
            } else {
                return "lzyQianstage/sjrz-xz";
            }
        }
    }
    /**
     *@描述  首页点击商家入驻
     *@参数  [session]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/4/27
     *@修改人和其它信息
     */
    @GetMapping("/clickGoSjzx")
    public String clickGoSjzx(HttpSession session){
        User userCount = (User)session.getAttribute("USER");
        if (userCount == null){ //未登录
            return "fw-loginHint"; //跳登录页面
        }else { //已登录
            if (orderBiz.judgeAuditStatusByUserID(userCount.getUserID()) == 2){ //已开通商家
                return "lzyQianstage/sjrz-yktsj"; //商家中心中转页面
            }else { //未开通商家
                return "lzyQianstage/sjrz-xz"; //商家入驻(下一步)页面
            }
        }
    }

    @GetMapping("/clickSjzxSucceed")
    public String clickSjzxSucceed(HttpSession session){
        User userCount = (User)session.getAttribute("USER");
        if (userCount != null && orderBiz.judgeAuditStatusByUserID(userCount.getUserID()) == 2){
            return "redirect:/lzy/c/loadUserOrderList?num=1&size=2";
        }else {
            return "redirect:/lzy/c/clickSjzx";
        }
    }

    @GetMapping("/skipPage")
    public String skipSjrzShzlPage(HttpSession session){
        User userCount = (User)session.getAttribute("USER");

        return orderBiz.judgeAuditStatusByUserID(userCount.getUserID()) == 2 ? "lzyQianstage/sjrz-yktsj":"lzyQianstage/sjrz-shzl";
    }

    @GetMapping("/skipSjzxXzjPage")
    public String skipSjzxXzjPage(){
        return "lzyQianstage/sjrz-xz";
    }

    @GetMapping("/skipSjzxYktsjPage")
    public String skipSjzxYktsjPage(){
        return "lzyQianstage/sjrz-yktsj";
    }


    @GetMapping("/skipSjzxFbfwPage")
    public String skipSjzxFbfwPage(){
        return "lzyQianstage/sjzx-fbfw";
    }

    @GetMapping("/skipSjzxHwfyfbPage")
    public String skipSjzxHwfyfbPage() {
        return "lzyQianstage/sjzx-hwfyfb";
    }
    @GetMapping("/skipSjzxServicesPage")
    public String skipSjzxServicesPage(){
        return "lzyQianstage/sjzx-services";
    }

    @GetMapping("/skipSjzxZjyfbfwPage")
    public String skipSjzxZjyfbfwPage(){
        return "lzyQianstage/sjzx-zjyfbfw";
    }

    @GetMapping("/skipSjzxWzxfbPage")
    public String skipSjzxWzxfbPage(){
        return "lzyQianstage/sjzx-wzxfb";
    }

    @GetMapping("/skipSjzxXxzyfbPage")
    public String skipSjzxXxzyfbPage(){
        return "lzyQianstage/sjzx-xxzyfb";
    }

    @GetMapping("/skipSjzxXzfwlbPage")
    public String skipSjzxXzfwlbPage(){
        return "lzyQianstage/sjzx-xzfwlb";
    }

}
