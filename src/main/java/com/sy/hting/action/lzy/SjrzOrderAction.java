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
<<<<<<< Updated upstream
        /*userCount.getUserID()*/
=======
>>>>>>> Stashed changes

        //加载查询商家中心-订单列表-订单表
        PageInfo<Orders> data = orderBiz.loadOrdersList(num, size, 26);
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
    @GetMapping("/getServicesListByUserID")
<<<<<<< Updated upstream
    public String getServicesListByUserID(int num, int size, HttpSession session, Model model){
        User userCount = (User) session.getAttribute("USER");
        /*userCount.getUserID()*/

        model.addAttribute("ServicesList", orderBiz.loadServicesList(num, size, userCount.getUserID()));

        /*if (orderBiz.judgeServices(12) > 0){

        }*/
=======
    public String getServicesListByUserID(int num, int size, HttpSession session, Model model, String serviceTitle){
        User userCount = (User) session.getAttribute("USER");
        System.out.println("serviceTitle = " + serviceTitle);
        model.addAttribute("ServicesList", orderBiz.loadServicesList(num, size, userCount.getUserID(), serviceTitle));
>>>>>>> Stashed changes

        return "lzyQianstage/sjzx-services";
    }

    @GetMapping("/loadFirBecServiceIDByUserID")
    public String loadFirBecServiceIDByUserID(HttpSession session, Model model){
        User userCount = (User) session.getAttribute("USER");
<<<<<<< Updated upstream
        /*userCount.getUserID()*/
=======

>>>>>>> Stashed changes
        User user = orderBiz.loadFirBecServiceIDByUserID(userCount.getUserID());

        if (user != null){
            model.addAttribute("user", user);
        }

        return "lzyQianstage/sjzx-xzfwlb";
    }

<<<<<<< Updated upstream
    @GetMapping("/clickSjzx")
    public String clickSjzx(HttpSession session){
        User userCount = (User)session.getAttribute("USER");
        if (userCount == null){
            return ""; //跳登录页面
        }else {//user.getUserID()
            if (orderBiz.judgeAuditStatusByUserID(userCount.getUserID()) == 2){
                return "lzyQianstage/sjrz-yktsj"; //商家中心中转页面
            }else {
=======
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
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        //user.getUserID()
=======
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream

    @GetMapping("/skipSjzxFbfwPage")
    public String skipSjzxFbfwPage(){

        return "lzyQianstage/sjzx-fbfw";
    }

    @GetMapping("/skipSjzxHwfyfbPage")
    public String skipSjzxHwfyfbPage(){

        return "lzyQianstage/sjzx-hwfyfb";
=======
    @GetMapping("/skipSjzxServicesPage")
    public String skipSjzxServicesPage(){

        return "lzyQianstage/sjzx-services";
    }

    @GetMapping("/skipSjzxZjyfbfwPage")
    public String skipSjzxZjyfbfwPage(){

        return "lzyQianstage/sjzx-zjyfbfw";
>>>>>>> Stashed changes
    }

    @GetMapping("/skipSjzxWzxfbPage")
    public String skipSjzxWzxfbPage(){

        return "lzyQianstage/sjzx-wzxfb";
    }

<<<<<<< Updated upstream
    @GetMapping("/skipSjzxXxzyfbPage")
    public String skipSjzxXxzyfbPage(){

        return "lzyQianstage/sjzx-xxzyfb";
    }

    @GetMapping("/skipSjzxZjyfbfwPage")
    public String skipSjzxZjyfbfwPage(){

        return "lzyQianstage/sjzx-zjyfbfw";
    }

    @GetMapping("/skipSjzxXzfwlbPage")
    public String skipSjzxXzfwlbPage(){

        return "lzyQianstage/sjzx-xzfwlb";
    }

    @GetMapping("/skipSjzxServicesPage")
    public String skipSjzxServicesPage(){

        return "lzyQianstage/sjzx-services";
=======
    @GetMapping("/skipSjzxFbfwPage")
    public String skipSjzxFbfwPage(){

        return "lzyQianstage/sjzx-fbfw";
    }

    @GetMapping("/skipSjzxHwfyfbPage")
    public String skipSjzxHwfyfbPage(){

        return "lzyQianstage/sjzx-hwfyfb";
    }

    @GetMapping("/skipSjzxXxzyfbPage")
    public String skipSjzxXxzyfbPage(){

        return "lzyQianstage/sjzx-xxzyfb";
>>>>>>> Stashed changes
    }

}
