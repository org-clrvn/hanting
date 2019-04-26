package com.sy.hting.action.lzy;

import com.sy.hting.biz.lzy.NewServiceReleaseBiz;
import com.sy.hting.pojo.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.lang.System;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/26 14:40
 */
@SuppressWarnings("all")
@Controller
@RequestMapping("/lzy/c")
public class NewServiceReleaseAction {

    @Resource
    private NewServiceReleaseBiz newSerBiz;

    /**
     *@描述  新服务发布
     *@参数  [service]
     *@返回值  java.util.Map<java.lang.String,java.lang.String>
     *@创建人  lizeyun
     *@创建时间  2019/4/13
     *@修改人和其它信息
     */
    @PostMapping("/addServices")//MultipartFile main_photo2_cut,MultipartFile main_photo3_cut, MultipartFile main_photo4_cut,  MultipartFile main_photo5_cut
    public String addServices(Services service, HttpSession session, MultipartFile serviceCoverImgTemp, MultipartFile serviceImgUrlOneTemp, MultipartFile serviceImgUrlTwoTemp, MultipartFile serviceImgUrlThreeTemp, MultipartFile serviceImgUrlFourTemp) throws Exception{
        User userCount = (User) session.getAttribute("USER");
        /*userCount.getUserID()*/

        System.out.println(serviceCoverImgTemp);
        String fileName1 = serviceCoverImgTemp.getOriginalFilename();
        service.setServiceCoverImg(File.separator + fileName1);
        serviceCoverImgTemp.transferTo(new File("E:\\myfile" + File.separator + fileName1));

        String fileName2 = serviceImgUrlOneTemp.getOriginalFilename();
        service.setServiceImgUrlOne(File.separator + fileName2);
        serviceImgUrlOneTemp.transferTo(new File("E:\\myfile" + File.separator + fileName2));

        String fileName3 = serviceImgUrlTwoTemp.getOriginalFilename();
        service.setServiceImgUrlTwo(File.separator + fileName3);
        serviceImgUrlTwoTemp.transferTo(new File("E:\\myfile" + File.separator + fileName3));

        String fileName4 = serviceImgUrlThreeTemp.getOriginalFilename();
        service.setServiceImgUrlThree(File.separator + fileName4);
        serviceImgUrlThreeTemp.transferTo(new File("E:\\myfile" + File.separator + fileName4));

        String fileName5 = serviceImgUrlFourTemp.getOriginalFilename();
        service.setServiceImgUrlFour(File.separator + fileName5);
        serviceImgUrlFourTemp.transferTo(new File("E:\\myfile" + File.separator + fileName5));

        service.setUserID(userCount.getUserID());

        int count = newSerBiz.addServices(service);

        if (count > 0){
            return "redirect:/lzy/c/getServicesListByUserID?num=1&size=3";
        }else {
            return "redirect:/lzy/c/skipSjzxZjyfbfwPage";
        }
    }

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

}