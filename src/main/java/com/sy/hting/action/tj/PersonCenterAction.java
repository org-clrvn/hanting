package com.sy.hting.action.tj;

import com.sy.hting.biz.tj.UserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @description:个人中心Action
 * @date 2019-3-26 10:44
 */
@SuppressWarnings("all")
@Controller
@RequestMapping("/tj/person")
public class PersonCenterAction {


    @Autowired
    private UserBiz biz;

    @GetMapping("index")
    public String gotoPage(Model model, Session session){
        model.addAttribute("user", biz.findUserById(24));
        return "grzx-index";
    }




}