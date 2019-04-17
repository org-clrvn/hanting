package com.sy.hting.action.tj;

import com.sy.hting.biz.tj.OrdersAndServicesBiz;
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
    @Autowired
    private OrdersAndServicesBiz oasbiz;

    /**
     * 跳转到个人中心
     * @param model
     * @param session
     * @return
     */
    @GetMapping("index")
    public String gotoPage(Model model, Session session){
        model.addAttribute("user", biz.findUserById(24));
        model.addAttribute("oasList",oasbiz.queryOas(24));
        return "grzx-index";
    }

    /**
     * 跳转到待付款
     * @param model
     * @param session
     * @return
     */
    @GetMapping("order")
    public String gotoOrder(Model model, Session session){
        model.addAttribute("orderDfk",oasbiz.queryOrderDfk(24));
        return "grzx-order";
    }

    /**
     * 跳转到我的收藏
     * @param model
     * @param session
     * @return
     */
    @GetMapping("favs")
    public String gotoFavs(Model model, Session session){
        return "grzx-favs";
    }

    /**
     * 跳转到我的评价
     * @param model
     * @param session
     * @return
     */
    @GetMapping("comments")
    public String gotoComments(Model model, Session session){
        return "grzx-comments";
    }

    /**
     * 跳转到我发出的物流
     * @param model
     * @param session
     * @return
     */
    @GetMapping("logistics")
    public String gotoLogistics(Model model, Session session){
        return "grzx-logistics";
    }

    /**
     * 跳转到我的金币
     * @param model
     * @param session
     * @return
     */
    @GetMapping("moneys")
    public String gotoMoneys(Model model, Session session,Integer p,Integer s,Integer am){
        if(p==null){
            p=1;
        }if(s==null){
            s=3;
        }
        model.addAttribute("goList",oasbiz.queryGoldnotes(24,p,s,am));
        model.addAttribute("user", biz.findUserById(24));
        return "grzx-moneys";
    }

    /**
     *跳转到我的积分
     * @param model
     * @param session
     * @return
     */
    @GetMapping("points")
    public String gotoPoints(Model model, Session session,Integer p,Integer s){
        if(p==null){
            p=1;
        }if(s==null){
            s=3;
        }
        model.addAttribute("goList",oasbiz.queryIntegralRecord(24,p,s));
        model.addAttribute("user", biz.findUserById(24));
        return "grzx-points";
    }

    /**
     * 跳转到我的退款
     * @param model
     * @param session
     * @return
     */
    @GetMapping("refund")
    public String gotoRefund(Model model, Session session){
        return "grzx-refund";
    }
}
