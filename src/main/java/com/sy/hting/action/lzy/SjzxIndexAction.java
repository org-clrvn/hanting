package com.sy.hting.action.lzy;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.lzy.SjrzOrderBiz;
import com.sy.hting.biz.lzy.SjzxIndexBiz;
import com.sy.hting.pojo.Orders;
import com.sy.hting.pojo.User;
import com.sy.hting.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.lang.System;


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

    @GetMapping("/skipSjzxServicecatsPage")
    public String skipSjzxServicecatsPage(){
        return "sjzx-servicecats";
    }

    @GetMapping("/skipSjzxTrustservicePage")
    public String skipSjzxTrustservicePage(){
        return "sjzx-trustservice";
    }

    @GetMapping("/loadTrusteeship")
    public String loadTrusteeship(HttpSession session, Model model){
        User userCount = (User)session.getAttribute("USER");

        model.addAttribute("data", indexBiz.loadTrusteeship(userCount.getUserID()));

        return "lzyQianstage/sjzx-trustservice";
    }

    /**
     *@描述  根据用户编号查询评价信息
     *@参数  [num, size, session, model]
     *@返回值  java.lang.String
     *@创建人  lizeyun
     *@创建时间  2019/5/14
     *@修改人和其它信息
     */
    @GetMapping("/loadEvaUserSerVo")
    public String loadEvaUserSerVo(int num, int size, HttpSession session, Model model){
        User userCount = (User)session.getAttribute("USER");

        model.addAttribute("data", indexBiz.loadEvaUserSerVoList(num, size, userCount.getUserID()));

        return "lzyQianstage/sjzx-comment";
    }
}
