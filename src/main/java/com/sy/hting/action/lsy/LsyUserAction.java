package com.sy.hting.action.lsy;

import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lsy.LsyUserBiz;
import com.sy.hting.vo.gsh.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lsy")
public class LsyUserAction {

    @Autowired
    private LsyUserBiz biz;

    @GetMapping("getList")
    public String getUserList(Integer p, Integer s, Model model, String userName) {
        if (userName.equals("0")) {
            userName = null;
        }
        PageInfo<UserVo> pageInfo = biz.findUserListByPage(p, s, userName);

        model.addAttribute("PAGE_INFO", pageInfo);
        model.addAttribute("userName", userName);
        return "lsy/Member-audit";
    }

    @GetMapping("getShopList")
    public String getUserList(Integer p, Integer s, Model model, String userName,String shopName,String merchantType) {
        if (userName.equals("0")||userName.equals("")) {
            userName = null;
        }
        if (shopName.equals("0")||shopName.equals("")) {
            shopName = null;
        }
        if (merchantType.equals("0")||merchantType.equals("")) {
            merchantType = null;
        }

        PageInfo<UserVo> pageInfo = biz.queryShop(p, s, userName, shopName, merchantType);

        model.addAttribute("PAGE_INFO", pageInfo);
        model.addAttribute("userName", userName);
        model.addAttribute("shopName",shopName);
        model.addAttribute("merchantType",merchantType);
        return "lsy/Merchant-management";
    }
}
