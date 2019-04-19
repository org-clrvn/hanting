package com.sy.hting.action.lsy;

import com.sy.hting.biz.lsy.AdminBiz;
import com.sy.hting.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/lsy/admin")
public class AdminAction {

    @Autowired
    private AdminBiz biz;

    @GetMapping("login")
    @ResponseBody
    public Map<String, Object> login(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password, HttpSession session) {
        Map<String, Object> msg = new HashMap<>();
        try {
            Admin admin1 = biz.login(name, password);
            if (admin1 != null) {
                msg.put("code", 200);
                msg.put("msg", "登陆成功！");
                session.setAttribute("Admin", admin1);
            } else {
                msg.put("code", 500);
                msg.put("msg", "登陆失败！");
            }
        } catch (Exception ex) {
            msg.put("code", 505);
            msg.put("msg", ex.getMessage());
        }

        return msg;
    }
}

