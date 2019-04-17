package com.sy.hting.action.lzy;

import com.sy.hting.biz.lzy.ApplyforRecruitmentBiz;
import com.sy.hting.biz.lzy.SjrzOrderBiz;
import com.sy.hting.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/lzy/c")
public class ApplyforRecruitmentAction {

    @Resource
    private ApplyforRecruitmentBiz recruitmentBiz;

    @Resource
    private SjrzOrderBiz orderBiz;

    /**
     * 用户已开通商家的提示
     * @return
     */
    @GetMapping("/skipSjrzYktsjPage")
    public String skipSjrzYktsjPage() { return "sjrz-yktsj"; }

    /**
     * 跳转到商家入驻的页面
     * @return
     */
    @GetMapping("/skipEnterintoRecruitmentPage")
    public String skipEnterintoRecruitmentPage(HttpSession session){
        User user = (User)session.getAttribute("user");
        if (user == null){
            return "";
        }else {//user.getUserID()
            if (orderBiz.judgeUserAuditStatusByUserID(user.getUserID()) != null){
                return "sjrz-yktsj";
            }else {
                return "sjrz-xz";
            }
        }
    }

    /**
     * 跳转到商家入驻填写资料的页面，并进行所有加载查询
     * @param model
     * @return
     */
    int pid;
    @GetMapping("/skipRecruitmentPage")
    public String skipRecruitmentPage(HttpSession session, Model model){
        //保存登录用户的信息到HttpSession中
        session.setAttribute("user", recruitmentBiz.loginQueryUserByUserID(12));

        //加载查询申请服务类别的所有信息
        model.addAttribute("sertypeItems", recruitmentBiz.loadServicetypeList());

        //加载查询系统配置表的信息
        model.addAttribute("system", recruitmentBiz.loadSystem());

        //加载查询服务语言表的所有信息
        model.addAttribute("languagetypeItems", recruitmentBiz.loadLanguagetypeList());

        //加载查询专业表的所有信息
        model.addAttribute("majortypeItems", recruitmentBiz.loadMajortypeList());

        //加载查询中韩行政地区表的所有信息
        model.addAttribute("shareaItems", recruitmentBiz.loadShareaItems(pid));

        //加载查询所在城市的信息
       /* model.addAttribute("shareaList", recruitmentBiz.loadShareaList());*/

        return "sjrz-txzl";
    }

    /**
     * 提交申请商家入驻信息
     * @param user
     * @return
     */
    @RequestMapping("/addRecruitmentUser")
    public String modifyRecruitmentUser(User user, String serviceID, MultipartFile shopImgTemp, MultipartFile identityPositiveImgTemp, MultipartFile identityNegativeImgTemp, MultipartFile identityHandImgTemp) throws Exception{
        System.out.println(user.getUserID());
        System.out.println(user.getLanguageNameText());
        System.out.println(user.getMajorNameText());

        String fileName1 = shopImgTemp.getOriginalFilename();
        user.setShopImg(File.separator + fileName1);
        shopImgTemp.transferTo(new File("D:\\myfile" + File.separator + fileName1));

        String fileName2 = identityPositiveImgTemp.getOriginalFilename();
        user.setIdentityPositiveImg(File.separator + fileName2);
        identityPositiveImgTemp.transferTo(new File("D:\\myfile" + File.separator + fileName2));

        String fileName3 = identityNegativeImgTemp.getOriginalFilename();
        user.setIdentityNegativeImg(File.separator + fileName3);
        identityNegativeImgTemp.transferTo(new File("D:\\myfile" + File.separator + fileName3));

        String fileName4 = identityHandImgTemp.getOriginalFilename();
        user.setIdentityHandImg(File.separator + fileName4);
        identityHandImgTemp.transferTo(new File("D:\\myfile" + File.separator + fileName4));


        String[] split = serviceID.split(",");
        user.setFirstServiceID(Integer.parseInt(split[0]));
        user.setSecondServiceID(Integer.parseInt(split[1]));

        int count = recruitmentBiz.modifyRecruitmentUser(user);

        return count > 0 ? "redirect:/lzy/c/skipPage":"redirect:/lzy/c/skipRecruitmentPage";

    }

    /**
     * 用户提交商家入驻申请时,后台审核中的提示
     * @return
     */
    @GetMapping("/skipSjrzShzlPage")
    public String skipSjrzShzlPage(HttpSession session) {
        User user = (User)session.getAttribute("user");
        if (orderBiz.judgeUserAuditStatusByUserID(12) != null){
            return "redirect:/lzy/c/skipSjrzYktsjPage";
        }else {
            return "redirect:/lzy/c/SjrzShzlPage";
        }

    }

    @GetMapping("/SjrzShzlPage")
    public String SjrzShzlPage(HttpSession session) {
        return "sjrz-shzl";

    }



    /*public static void main(String[] args) {

    }*/

}
