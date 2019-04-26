package com.sy.hting.action.xmh;

import com.sy.hting.biz.xmh.MerchantEnterAndServiceBiz;
import com.sy.hting.biz.xmh.UserBiz;
import com.sy.hting.pojo.*;
import com.sy.hting.util.file.Upload;
import com.sy.hting.vo.xmh.ServicesVO;
import com.sy.hting.vo.xmh.AdvertisementVO;
import com.sy.hting.vo.xmh.HomePostVO;
import com.sy.hting.vo.xmh.SerRecommendVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.System;
import java.util.List;

/**
 * @author Administrator
 * @describe
 * @company 晟源科技有限公司
 * @create 2019-03-20 14:36
 */
@Controller
@RequestMapping("/c/xmh")
public class MerchantEnterAndServiceAction {
    @Autowired
    private MerchantEnterAndServiceBiz merchantEnterAndServiceBiz;
    @Autowired
    private UserBiz userBiz;

    @GetMapping("merchantEnterUrlCheck")
    public String merchantEnterUrlCheck(HttpSession session) {
        User user = (User) session.getAttribute("USER");
        if (user != null) {
            Integer auditstatus = user.getAuditStatus();
            if (auditstatus == 1) {
                return "redirect:/sjrz-shzl.html";
            } else if (auditstatus == 2) {
                return "redirect:/sjrz-yktsj.html";
            } else {
                return "redirect:/sjrz-xz.html";
            }
        } else {
            return "redirect:/fw-loginHint.html";
        }
    }

    /**
     * 商家入驻填写资料地址
     *
     * @param model
     * @param session
     * @return
     */
    @GetMapping("merchantEnterUrl")
    public String merchantEnterUrl(Model model, HttpSession session) {
        User user = (User) session.getAttribute("USER");
        //获取服务类别
        List<Servicetype> servicetypeList = merchantEnterAndServiceBiz.queryServiceType(null, null);
        //获取服务语言
        List<Languagetype> languagetypeList = merchantEnterAndServiceBiz.queryLanguagetype();
        //获取擅长专业
        List<Majortype> majortypeList = merchantEnterAndServiceBiz.queryMajortype();
        //获取国家
        List<Sharea> shareaList = merchantEnterAndServiceBiz.querySharea(null, false);
        //获取韩国城市
        List<Sharea> liveCityList = merchantEnterAndServiceBiz.querySharea(2, false);
        //将服务类别集合存入request
        model.addAttribute("servicetypeList", servicetypeList);
        //将服务语言集合存入request
        model.addAttribute("languagetypeList", languagetypeList);
        //将擅长专业集合存入request
        model.addAttribute("majortypeList", majortypeList);
        //将国家集合存入request
        model.addAttribute("shareaList", shareaList);
        //将韩国城市集合存入request
        model.addAttribute("liveCityList", liveCityList);
        //将商家入驻需缴纳保证金额大小存入request
        model.addAttribute("bond", merchantEnterAndServiceBiz.queryBond());
        //将用户金额存入request
        model.addAttribute("userMoney", user.getUserMoney());
        String email = session.getAttribute("Email").toString();
        model.addAttribute("Email", email == null ? null : email);
        return "sjrz-txzl";
    }

    /**
     * 查询地址api
     *
     * @param pid
     * @return
     */
    @GetMapping("api/querySharea")
    @ResponseBody
    public List<Sharea> querySharea(Integer pid) {
        return merchantEnterAndServiceBiz.querySharea(pid, false);
    }

    /**
     * 商家入驻
     *
     * @return
     */
    @PostMapping("merchantEnter")
    public String merchantMove(HttpSession session, User user, String serviceID, MultipartFile shopimgData, MultipartFile identitypositiveimgData, MultipartFile identitynegativeimgData, MultipartFile identityhandimgData) {
        //登录用户
        User loginUser = (User) session.getAttribute("USER");
        //入驻缴纳保证金金额要求
        float bond = merchantEnterAndServiceBiz.queryBond();
        //如果当前登录用户的金额足够缴纳保证金
        if (loginUser.getUserMoney() >= bond) {
            //如果用户选择的服务类别为两个
            if (serviceID.split(",").length == 2) {
                user.setFirstServiceID(Integer.parseInt(serviceID.split(",")[0]));
                user.setSecondServiceID(Integer.parseInt(serviceID.split(",")[1]));
            } else {
                user.setFirstServiceID(Integer.parseInt(serviceID));
            }
            try {
                String shopimgDataFName = Upload.uploadFile(shopimgData);
                String identitypositiveimgDataFName = Upload.uploadFile(identitypositiveimgData);
                String identitynegativeimgDataFName = Upload.uploadFile(identitynegativeimgData);
                String identityhandimgDataFName = Upload.uploadFile(identityhandimgData);
                //设置数据库存储图片路径
                user.setShopImg(shopimgDataFName);
                user.setIdentityPositiveImg(identitypositiveimgDataFName);
                user.setIdentityNegativeImg(identitynegativeimgDataFName);
                user.setIdentityHandImg(identityhandimgDataFName);
                //当前登录用户编号赋给修改对象
                user.setUserID(loginUser.getUserID());
            } catch (IllegalStateException | IOException e) {
                e.printStackTrace();
            }
            //商家入驻受影响行数
            if (merchantEnterAndServiceBiz.merchantMove(user, bond) > 0) {
                //添加金币流向记录
                merchantEnterAndServiceBiz.saveGoldNotes(loginUser.getUserID(), 4, "商家入驻缴纳保证金", -bond, 2);
                //添加系统消息
                userBiz.saveXtxx(loginUser.getUserID(), "您好，您已成功提交商家入驻的申请，请等待管理员审核。");
                return "redirect:/sjrz-shzl.html";
            } else {
                return "redirect:/error/500.html";
            }
        } else {
            return "redirect:/error/500.html";
        }
    }

    /**
     * MVC:首页地址
     *
     * @param model
     * @return
     */
    @GetMapping("homeUrl")
    public String homeUrl(Model model) {

        Integer wz = merchantEnterAndServiceBiz.queryGraphyid("4,5,6,7");

       ///首页社区服务轮播图广告位查询
        List<AdvertisementVO> homeSlideshowList = merchantEnterAndServiceBiz.queryHomeAdvertising(1, wz);
        System.err.println(merchantEnterAndServiceBiz.queryHomeAdvertising(1, wz));
        //首页社区服务中间广告位查询
        List<AdvertisementVO> homeMidAdvertingList = merchantEnterAndServiceBiz.queryHomeAdvertising(2, wz);
        //首页社区上方左右广告位查询
        List<AdvertisementVO> homeTopAdvertingList = merchantEnterAndServiceBiz.queryHomeAdvertising(3, wz);
        //首页社区下方广告位查询
        List<AdvertisementVO> homeBottomAdvertingList = merchantEnterAndServiceBiz.queryHomeAdvertising(4, wz);
        //五大星级服务商家查询
        List<SerRecommendVO> recommendStidByOneList = merchantEnterAndServiceBiz.querySerRecommendVO(1);    //自驾游
        List<SerRecommendVO> recommendStidByTwoList = merchantEnterAndServiceBiz.querySerRecommendVO(2);    //微整形
        List<SerRecommendVO> recommendStidByThreeList = merchantEnterAndServiceBiz.querySerRecommendVO(3);    //留学中介
        List<SerRecommendVO> recommendStidByFourList = merchantEnterAndServiceBiz.querySerRecommendVO(4);    //韩语翻译
        List<SerRecommendVO> recommendStidByFiveList = merchantEnterAndServiceBiz.querySerRecommendVO(5);    //学习资源
        //韩汀社区论坛热门贴查询
        List<HomePostVO> homePostVOList = merchantEnterAndServiceBiz.queryHomePostVO();    //最新帖子
        List<Post> homePostMakeUpList = merchantEnterAndServiceBiz.queryHomePostByMakeup();    //美妆版块帖子
        model.addAttribute("homeSlideshowList", homeSlideshowList);
        model.addAttribute("homeMidAdvertingList", homeMidAdvertingList);
        model.addAttribute("recommendStidByOneList", recommendStidByOneList);
        model.addAttribute("recommendStidByTwoList", recommendStidByTwoList);
        model.addAttribute("recommendStidByThreeList", recommendStidByThreeList);
        model.addAttribute("recommendStidByFourList", recommendStidByFourList);
        model.addAttribute("recommendStidByFiveList", recommendStidByFiveList);
        model.addAttribute("homePostVOList", homePostVOList);
        model.addAttribute("homePostMakeUpList", homePostMakeUpList);
        model.addAttribute("homeTopAdvertingList", homeTopAdvertingList);
        model.addAttribute("homeBottomAdvertingList", homeBottomAdvertingList);
        return "fw-sy";
    }

    /**
     * 全文检索
     *
     * @return
     */
    @GetMapping("/getServiceListByName")
    @ResponseBody
    public List<ServicesVO> getServiceListByName(String name) {
        return merchantEnterAndServiceBiz.getServiceListByName(name);
    }

    /**
     * 全文检索页面
     *
     * @return
     */
    @GetMapping("/goToService/{pageNum}/{pageSize}/{name}")
    public String goToService(Model model, @PathVariable Integer pageNum, @PathVariable Integer pageSize, @PathVariable String name) {
        //上方左右广告位查询
        List<AdvertisementVO> homeTopAdvertingList = merchantEnterAndServiceBiz.queryHomeAdvertising(3, null);
        //下方广告位查询
        List<AdvertisementVO> homeBottomAdvertingList = merchantEnterAndServiceBiz.queryHomeAdvertising(4, null);
        model.addAttribute("homeTopAdvertingList", homeTopAdvertingList);
        model.addAttribute("homeBottomAdvertingList", homeBottomAdvertingList);
        //模糊数据
        model.addAttribute("serviceList", merchantEnterAndServiceBiz.getServicePage(pageNum, pageSize, name));
        //关键字
        model.addAttribute("gjz", name);
        return "fw-mhc";
    }
}
