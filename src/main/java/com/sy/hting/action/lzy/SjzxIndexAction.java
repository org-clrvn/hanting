package com.sy.hting.action.lzy;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lzy.SjrzOrderBiz;
import com.sy.hting.biz.lzy.SjzxIndexBiz;
<<<<<<< Updated upstream
import com.sy.hting.pojo.Orders;
import com.sy.hting.pojo.User;
=======
import com.sy.hting.pojo.*;
import com.sy.hting.vo.lzy.AppSertypeVo;
>>>>>>> Stashed changes
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< Updated upstream
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
=======
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.lang.System;
>>>>>>> Stashed changes

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 21:57
 */
<<<<<<< Updated upstream
=======
@SuppressWarnings("all")
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======
    @GetMapping("/loadAppraisalapplyList")
    public String loadAppraisalapplyList(HttpSession session, Model model){
        User userCount = (User)session.getAttribute("USER");
        //userCount.getUserID()
        model.addAttribute("appList", indexBiz.loadAppraisalapplyList(userCount.getUserID()));

        return "lzyQianstage/sjzx-auth";
    }

    @GetMapping("/skipSjrzJdinfoPage")
    public String skipSjrzJdinfoPage(){
        return "lzyQianstage/sjzx-jdinfo";
    }

    @GetMapping("/skipSjrzZjyjdPage")
    public String skipSjrzZjyjdPage(int applyID, Model model){
        model.addAttribute("applyID", applyID);

        return "lzyQianstage/sjzx-zjyjd";
    }

    @GetMapping("/skipSjrzXxzyjdPage")
    public String skipSjrzXxzyjdPage(int applyID, Model model){
        model.addAttribute("applyID", applyID);

        return "lzyQianstage/sjzx-xxzyjd";
    }

    @GetMapping("/skipSjrzWzxjdPage")
    public String skipSjrzWzxjdPage(int applyID, Model model){
        model.addAttribute("applyID", applyID);

        return "lzyQianstage/sjzx-wzxjd";
    }

    @GetMapping("/skipSjrzHyfyjdPage")
    public String skipSjrzHyfyjdPage(int applyID, Model model){
        model.addAttribute("applyID", applyID);

        return "lzyQianstage/sjzx-hyfyjd";
    }

    @GetMapping("/skipSjrzLxzjjdPage")
    public String skipSjrzLxzjjdPage(int applyID, Model model){
        model.addAttribute("applyID", applyID);

        return "lzyQianstage/sjzx-lxzjjd";
    }

    @RequestMapping("/modifyAppraisalapplyByApplyID")
    public String modifyAppraisalapplyByApplyID(Appraisalapply appraisalapply, MultipartFile translateFile, MultipartFile koreaLicenseFile, MultipartFile schoolReportFile) throws Exception{
        System.out.println("appraisalapply.getApplyID() = " + appraisalapply.getApplyID());

        if (translateFile != null){
            String fileName1 = translateFile.getOriginalFilename();
            appraisalapply.setTranslate(File.separator + fileName1);
            translateFile.transferTo(new File("E:\\myfile" + File.separator + fileName1));
        }

        if (koreaLicenseFile != null){
            String fileName2 = koreaLicenseFile.getOriginalFilename();
            appraisalapply.setKoreaLicense(File.separator + fileName2);
            koreaLicenseFile.transferTo(new File("E:\\myfile" + File.separator + fileName2));
        }

        if (schoolReportFile != null){
            String fileName3 = schoolReportFile.getOriginalFilename();
            appraisalapply.setSchoolReport(File.separator + fileName3);
            schoolReportFile.transferTo(new File("E:\\myfile" + File.separator + fileName3));
        }

        int count = indexBiz.modifyAppraisalapplyByApplyID(appraisalapply);
        System.out.println("count = " + count);

        return "redirect:/lzy/c/loadAppraisalapplyList";
    }

>>>>>>> Stashed changes
}
