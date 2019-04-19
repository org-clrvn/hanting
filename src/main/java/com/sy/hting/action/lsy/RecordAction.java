package com.sy.hting.action.lsy;

import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lsy.RecordBiz;
import com.sy.hting.vo.gsh.IntegralVo;
import com.sy.hting.vo.gsh.PutforwardrecordVo;
import com.sy.hting.vo.gsh.RecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class RecordAction {
    @Autowired
    private RecordBiz biz;

    @GetMapping("getGoldList")
    public String getGoldList(Integer p, Integer s, Model model, String userName) {
        if (userName.equals("0")||userName.equals("")) {
            userName = null;
        }
        PageInfo<RecordVo> pageInfo = biz.queryAll(p, s, userName);

        model.addAttribute("PAGE_INFO", pageInfo);
        model.addAttribute("userName", userName);
        return "lsy/Gold-coin-record";
    }

    @GetMapping("queryRecharge")
    public String queryRecharge(Integer p, Integer s,String userName,Model model) {
        if (userName.equals("0")||userName.equals("")) {
            userName = null;
        }
        PageInfo<RecordVo> pageInfo =biz.queryRecharge(p, s, userName);
        model.addAttribute("PAGE_INFO", pageInfo);
        model.addAttribute("userName", userName);
        return "lsy/Recharge-record";
    }

    @GetMapping("queryIntegral")
    public String queryIntegral(Integer p, Integer s, Model model, String userName) {
        if (userName.equals("0")||userName.equals("")) {
            userName = null;
        }
        PageInfo<IntegralVo> pageInfo = biz.queryIntegral(p, s, userName);
        model.addAttribute("PAGE_INFO", pageInfo);
        model.addAttribute("userName", userName);
        return "lsy/Integral-record";
    }

    @GetMapping("querytixian")
    public String gettixian(Integer p, Integer s, Model model) {
        PageInfo<PutforwardrecordVo> pageInfotixian =biz.findtixian(p, s);
        model.addAttribute("TIXIAN",pageInfotixian);
        return "lsy/tixian";
    }
}
