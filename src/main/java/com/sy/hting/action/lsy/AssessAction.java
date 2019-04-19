package com.sy.hting.action.lsy;

import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lsy.AssessBiz;
import com.sy.hting.vo.gsh.PingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Assess")
public class AssessAction {

    @Autowired
    private AssessBiz biz;



    @GetMapping("getAssess")
    public String queryAssess(Integer p, Integer s, Model model, String userName, String title) {
        if (userName.equals("0")||userName.equals("")) {
            userName = null;
        }
        if (title.equals("0")||title.equals("")) {
            title = null;
        }
        PageInfo<PingVo> pageInfo = biz.queryAllAssess(p, s, userName, title);
        model.addAttribute("PAGE_INFO", pageInfo);
        model.addAttribute("userName", userName);
        model.addAttribute("title", title);
        return "lsy/Evaluation-management";
    }
}
