package com.sy.hting.action.lzy;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lzy.SjrzOrderBiz;
import com.sy.hting.biz.lzy.SjzxIndexBiz;
import com.sy.hting.pojo.Orders;
import com.sy.hting.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 21:57
 */
@Controller
@RequestMapping("/lzy/c")
public class SjzxIndexAction {

    @Resource
    private SjzxIndexBiz indexBiz;

    @Resource
    private SjrzOrderBiz orderBiz;

    @GetMapping("/loadUserOrderList")
    public String loadUserOrderList(HttpSession session, int num, int size, Model model){
        User userCount = (User)session.getAttribute("USER");
        //user.getUserID();

        if (orderBiz.judgeAuditStatusByUserID(userCount.getUserID()) == 2){
            //System.out.println("user:"+indexBiz.loadUserByUserID(12));
            model.addAttribute("user", indexBiz.loadUserByUserID(userCount.getUserID()));

            PageInfo<Orders> pageInfo = orderBiz.loadOrdersList(num, size, userCount.getUserID());
            System.err.println(JSON.toJSON(pageInfo.getList()));
            model.addAttribute("data", pageInfo);

            return "lzyQianstage/sjzx-index";
        }else {
            return "redirect:/lzy/c/skipSjzxXzjPage";
        }
    }

}
