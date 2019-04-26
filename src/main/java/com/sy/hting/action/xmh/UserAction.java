package com.sy.hting.action.xmh;

import com.github.pagehelper.PageInfo;
import com.sy.hting.biz.xmh.UserBiz;
import com.sy.hting.pojo.News;
import com.sy.hting.pojo.Sharea;
import com.sy.hting.pojo.User;
import com.sy.hting.util.code.VerifyCode;
import com.sy.hting.util.email.Email;
import com.sy.hting.util.email.EmailBoard;
import com.sy.hting.util.file.Upload;
import com.sy.hting.vo.xmh.ListVo;
import com.sy.hting.vo.xmh.NewsVo;
import com.sy.hting.vo.xmh.TimeOutEmailDateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @describe
 * @company 晟源科技有限公司
 * @create 2019-03-24 14:10
 */
@Controller
@RequestMapping("/c/xmh")
public class UserAction {
    @Autowired
    private UserBiz userBiz;

    /**
     * 验证是否存在邮箱账号
     * @param email
     * @return
     */
    @GetMapping("/user/yzEmail")
    @ResponseBody
    public Map<String,String> queryEmail(String email){
        Map<String,String> map=new HashMap<>();
        try {
            if(userBiz.queryEmail(email)) {
                map.put("code", "200");
            }else {
                map.put("code", "500");
            }
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }

    /**
     * 邮箱注册
     * @param email
     * @return
     */
    @PostMapping("/user/gotoLogin")
    public String gotoLogin(Model model, String email, String username) {
        System.out.println(email+"-----"+username+"----");
        try {
            //生成安全码
            String codeId= VerifyCode.createVerifyCode(8);
            if(ListVo.emailList.get(email)==null) {
                ListVo.emailList.put(email,new TimeOutEmailDateVo(email, codeId, new Date()));
            }else {
                ListVo.emailList.get(email).setTime(new Date());
                ListVo.emailList.get(email).setCodeId(codeId);
            }

            Email.sendSimpleMail(email, "用户注册", EmailBoard.register(username, "http://127.0.0.1:1111/c/xmh/user/emailYanz?email="+email+"&nickName="+username+"&codeId="+codeId));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/szy-login.html";
    }

    /**
     * 激活邮箱
     * @param model
     * @param email
     * @param nickName
     * @param codeId
     * @return
     */
    @GetMapping("/user/emailYanz")
    public String emailYanz(Model model,String email,String nickName,String codeId) {
        if(ListVo.emailList.get(email)==null) {
            return "/szy-yz-no.html";
        }else {
            if(ListVo.emailList.get(email).getCodeId().trim().equals(codeId.trim())) {
                model.addAttribute("user", new TimeOutEmailDateVo(email,nickName));
                return "/szy-zuce-yz.html";
            }else {
                return "/szy-yz-no.html";
            }
        }
    }
    /**
     * 新增邮箱登陆用户
     * @param tqedv
     * @return
     */
    @PostMapping("/user/saveEmail")
    public String saveEmail(TimeOutEmailDateVo tqedv,Model model) {
        if(userBiz.saveEmailUser(tqedv)) {
            model.addAttribute("email",tqedv.getEmail());
            return "/szy-yz-yes.html";
        }else{
            return "/szy-zuce-yz.html";
        }
    }

    /**
     *
     * @param session
     * @param email 邮箱登录
     * @param password
     * @return
     */
    @PostMapping("/user/loginEmail")
    @ResponseBody
    public Map<String,String> loginEmail(HttpSession session,String email,String password){
        Map<String,String> map = new HashMap<String,String>();
        try {
            User user=userBiz.login(email,password);
            if(user!=null){
                session.setAttribute("USER",user);
                map.put("code", "200");
            }else{
                map.put("code", "500");
            }
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }
    /**
     * 邮件重置密码
     * @param email
     * @return
     */
    @PostMapping("/user/updatePwd")
    @ResponseBody
    public Map<String,String> updatePwd(String email){
        Map<String,String> map=new HashMap<>();
        try {
            String pwd=VerifyCode.createVerifyCode(6);
            Email.sendSimpleMail(email, "重置密码", EmailBoard.verifyCode(email, "您的密码已重置,新密码为:", pwd));
            if(userBiz.updatePwd(email, pwd)) {
                map.put("code", "200");
            }else {
                map.put("code", "500");
            }
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }

    /**
     * 获取当前用户session
     * @param session
     * @return
     */
    @RequestMapping(value="/user/queryAUser")
    @ResponseBody
    public User queryAUser(HttpSession session) {
        if(session.getAttribute("USER")==null) {
            return null;
        }else {
            Integer userID=((User)session.getAttribute("USER")).getUserID();
            User u=userBiz.queryUser(userID);
            session.setAttribute("USER", u);
            return u;
        }
    }
    /**
     * 退出登陆
     * @param session
     * @return
     */
    @GetMapping("/user/close")
    public String close(HttpSession session) {
        session.removeAttribute("USER");
        session.removeAttribute("Email");
        return "/szy-login.html";
    }
    /**
     * 获取用户信息方法
     * @param
     * @return
     */
    @GetMapping("/user/queryGrzxInfo")
    public String queryGrzxInfo(){
        return "/zhsz-grzl.html";
    }
    /**
     * 查看中韩行政地区
     * @return
     */
    @GetMapping("/user/querySharea")
    @ResponseBody
    public List<Sharea> querySharea(){
        return userBiz.querySharea();
    }
    /**
     * 修改图片
     * @param session
     * @param file
     * @return
     */
    @PostMapping("/user/updateUserImg")
    public String updateUserImg(HttpSession session,@RequestParam("img") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                Integer userID=((User)session.getAttribute("USER")).getUserID();
                String url = Upload.uploadFile(file);
                userBiz.updateUserImg(url, userID);
                session.setAttribute("USER", userBiz.queryUser(userID));
            } catch (IllegalStateException | IOException e) {
                e.printStackTrace();
            }
        }
        return "zhsz-grzl.html";
    }
    /**
     * 修改账户信息
     * @param session
     * @param u
     * @return
     */
    @PostMapping("/user/updateUserInfo")
    @ResponseBody
    public Map<String,String> updateUserInfo(HttpSession session,User u){
        Map<String,String> map=new HashMap<>();
        if(userBiz.updateUserInfo(u)) {
            Integer userID=((User)session.getAttribute("USER")).getUserID();
            session.setAttribute("USER", userBiz.queryUser(userID));
            map.put("code","200");
        }else{
            map.put("code","500");
        }
        return map;
    }
    /**
     * 修改密码
     * @param session
     * @param password
     * @return
     */
    @PostMapping("/user/updateEmailPwd")
    @ResponseBody
    public Map<String,String> updateEmailPwd(HttpSession session,String password) {
        Map<String,String> map=new HashMap<>();
        String email=session.getAttribute("Email").toString();
        if(userBiz.updatePwd(email, password)){
            session.removeAttribute("USER");
            session.removeAttribute("Email");
            map.put("code","200");
        }else{
            map.put("code","500");
        }
        return map;
    }
    /**
     * 查询店铺信息
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/user/getdpszInfo")
    public String getdpszInfo(Model model,HttpSession session) {
        Integer userID=((User)session.getAttribute("USER")).getUserID();
        model.addAttribute("User", userBiz.queryUser(userID));
        return "/zhsz-dpxx.html";
    }
    /**
     * 查询服务类别
     * @param id
     * @return
     */
    @GetMapping("/user/getSerType")
    @ResponseBody
    public String getSerType(Integer id) {
        return userBiz.querySerType(id);
    }
    /**
     * 修改店铺信息
     * @param u
     * @param file1
     * @param file2
     * @param file3
     * @param file4
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping(value="/user/updateUserDpxx",method=RequestMethod.POST)
    public String updateUserDpxx(HttpSession session,User u,@RequestParam("thumb") MultipartFile file1,@RequestParam("idcardpic1") MultipartFile file2,@RequestParam("idcardpic2") MultipartFile file3,@RequestParam("vippic") MultipartFile file4) throws IllegalStateException, IOException {
        System.out.println("1");
        if(file1.getSize()!= 0) {
            u.setShopImg(Upload.uploadFile(file1));
        }
        if(file2.getSize()!= 0) {
            u.setIdentityPositiveImg(Upload.uploadFile(file2));
        }
        if(file3.getSize()!= 0) {
            u.setIdentityNegativeImg(Upload.uploadFile(file3));
        }
        if(file4.getSize()!= 0) {
            u.setIdentityHandImg(Upload.uploadFile(file4));
        }
        Integer userID=((User)session.getAttribute("USER")).getUserID();
        u.setUserID(userID);
        userBiz.updateUserDpxx(u);
        session.setAttribute("USER", userBiz.queryUser(userID));
        return "redirect:/c/xmh/user/getdpszInfo";
    }
    /**
     * 分页查询用户系统信息
     * @param session
     * @param newsType
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/user/queryNewPageInfo")
    @ResponseBody
    public PageInfo<News> queryNewPageInfo(HttpSession session,Integer newsType,Integer pageNum,Integer pageSize){
        Integer userID=((User)session.getAttribute("USER")).getUserID();
        return userBiz.queryNewPageInfo(userID, newsType, pageNum, pageSize);
    }
    /**
     * 查询所有系统消息
     * @param
     * @return
     */
    @GetMapping("/user/queryAllNews")
    @ResponseBody
    public List<News> queryAllNews(HttpSession session){
        Integer userID=((User)session.getAttribute("USER")).getUserID();
        return userBiz.queryAllNews(userID);
    }
    /**
     * 修改系统消息状态
     * @param newsID
     * @return
     */
    @PostMapping("/user/updateXtNews")
    @ResponseBody
    public Map<String,String> updateXtNews(String newsID) {
        Map<String,String> m=new HashMap<>();
        newsID=newsID.substring(0, newsID.length()-1);
        try {
            userBiz.updateXtNews(newsID);
            m.put("code", "200");
        } catch (Exception e) {
            m.put("code", "500");
            m.put("msg", e.getMessage());
        }
        return m;
    }
    /**
     * 删除系统消息
     * @param newsID
     * @return
     */
    @RequestMapping(value="/user/deleteNews",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,String> deleteNews(String newsID){
        Map<String,String> m=new HashMap<>();
        newsID=newsID.substring(0, newsID.length()-1);
        try {
            userBiz.deleteNews(newsID);
            m.put("code", "200");
        } catch (Exception e) {
            m.put("code", "500");
            m.put("msg", e.getMessage());
        }
        return m;
    }
//    /**
//     * 查询用户站内信
//     * @param session
//     * @param pageNum
//     * @param pageSize
//     * @return
//     */
//    @GetMapping("/user/queryZnxNewsPageInfo")
//    @ResponseBody
//    public PageInfo<NewsVo>  queryZnxNewsPageInfo(HttpSession session, Integer pageNum, Integer pageSize){
//        Integer userID=((User)session.getAttribute("USER")).getUserID();
//        PageInfo<NewsVo> page=userBiz.queryZnxNewsPageInfo(userID, pageNum, pageSize);
//        for(NewsVo ne:page.getList()){
//            ne.setCountt(userBiz.readNum(ne.getAddressee(),ne.getMessagegroup()));
//        }
//        return page;
//    }
    /**
     * 修改站内信状态
     * @param groupID
     * @return
     */
    @PostMapping(value="/user/updateZnxNews")
    @ResponseBody
    public Map<String,String> updateZnxNews(HttpSession session,String groupID) {
        Map<String,String> m=new HashMap<>();
        User user=(User)session.getAttribute("USER");
        groupID=groupID.substring(0, groupID.length()-1);
        try {
            userBiz.updateZnxNews(groupID,user.getUserID());
            m.put("code", "200");
        } catch (Exception e) {
            m.put("code", "500");
            m.put("msg", e.getMessage());
        }
        return m;
    }
//    /**
//     * 删除站内消息
//     * @param
//     * @return
//     */
//    @PostMapping("/user/deleteZnxNews")
//    @ResponseBody
//    public Map<String,String> deleteZnxNews(HttpSession session, String groupID){
//        Map<String,String> m=new HashMap<>();
//        User user=(User)session.getAttribute("USER");
//        groupID=groupID.substring(0, groupID.length()-1);
//        try {
//            userBiz.deleteZnxNews(groupID,user.getUserID());
//            m.put("code", "200");
//        } catch (Exception e) {
//            m.put("code", "500");
//            m.put("msg", e.getMessage());
//        }
//        return m;
//    }
//    /**
//     * 查询站内信详情
//     * @param model
//     * @param groupID
//     * @return
//     */
//    @GetMapping("/user/queryZnxXq")
//    public String queryZnxXq(Model model ,String groupID) {
//        model.addAttribute("news", userBiz.queryZnxXq(groupID));
//        return "/xx-znx-xq.html";
//    }
    /**
     * 新增站内信
     * @param session
     * @param thesender
     * @param content
     * @param newstype
     * @param messagegroup
     * @return
     */
    @GetMapping("/user/saveZnx")
    @ResponseBody
    public Map<String,String> saveZnx(HttpSession session,Integer thesender,String content,Integer newstype,Integer messagegroup) {
        Integer userID=((User)session.getAttribute("USER")).getUserID();
        Map<String,String> m=new HashMap<>();
        News n=new News();
        n.setTheSender(userID);
        n.setContent(content);
        n.setNewsType(newstype);
        n.setMessageGroup(messagegroup);
        n.setAddRessee(thesender);
        try {
            userBiz.saveZnx(n);
            m.put("code", "200");
        } catch (Exception e) {
            m.put("code", "500");
            m.put("msg", e.getMessage());
        }
        return m;
    }
}
