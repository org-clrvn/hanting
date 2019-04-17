package com.sy.hting.action.lzy;

import com.sy.hting.biz.lzy.ApplyforRecruitmentBiz;
import com.sy.hting.pojo.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.*;
import java.lang.System;
import java.net.*;
import java.util.List;

@RestController
@RequestMapping("/lzy/api")
public class ApiAppforRecritmentAction {

    @Resource
    private ApplyforRecruitmentBiz apiRecruitmentBiz;

    /**
     * 查询身份住址
     * @return
     */
    @GetMapping("/shareas/{pid}/items")
    public List<Sharea> findShareaItems(@PathVariable int pid){
        return apiRecruitmentBiz.loadShareaItems(pid);
    }

    /**
     * 申请商家入驻页面加载时，查询所在城市的信息
     * @return
     */
    @GetMapping("/shareas")
    public List<Sharea> loadShareaList(){
        //System.out.println(apiRecruitmentBiz.loadShareaList().get(0));
        return apiRecruitmentBiz.loadShareaList();
    }

    /**
     * 所在城市
     * @return
     */
    @GetMapping("/shareas/{pid}/list")
    public List<Sharea> findShareaList(@PathVariable int pid){
        System.out.println(pid);
        return apiRecruitmentBiz.findShareaList(pid);
    }

    /**
     * 身份证验证
     * @param identityCard
     * @return
     * @throws Exception
     */
    @GetMapping(value="/identityCardVerify/{identityCard}", produces = "text/html;charset=UTF-8")
    public String identityCardVerify(@PathVariable String identityCard) throws Exception {
        System.out.println(identityCard);
        return polymerizationVerify("http://apis.juhe.cn/idcard/index?cardno=" + identityCard + "&key=4cf775e1c696f52197d642506442fbe8");
    }

    /**
     * 电话号码验证
     * @param phone
     * @return
     * @throws Exception
     */
    @GetMapping(value="/phoneVerify/{phone}", produces = "text/html;charset=UTF-8")
    public String phoneVerify(@PathVariable String phone) throws Exception {
        System.out.println(phone);
        return polymerizationVerify("http://apis.juhe.cn/mobile/get?phone=" + phone + "&key=5ddfdcb65ee003df0f458e8e518c7080");
    }

    /**
     * 聚合验证
     * @param uri
     * @return
     * @throws Exception
     */
    public String polymerizationVerify(String uri) throws Exception {
        BufferedReader br = null;
        StringBuffer data = new StringBuffer();
        try {
            // 1.定义标识符
            URL url = new URL(uri);
            // 2.获得连接资源
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            // 3.设置连接信息
            httpConn.setRequestMethod("GET");
            httpConn.setReadTimeout(50 * 1000);
            httpConn.setConnectTimeout(4 * 1000);
            // 4.开始连接
            httpConn.connect();
            // 5.接收响应信息
            int rsCode = httpConn.getResponseCode();
            switch (rsCode) {
                case HttpURLConnection.HTTP_OK:
                    // 6.利用流处理数据
                    // 高级字符流
                    br = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
                    for (String rs; (rs = br.readLine()) != null; ) {
                        data.append(rs);
                    }
                    break;
                case HttpURLConnection.HTTP_NOT_FOUND:
                    break;
                case HttpURLConnection.HTTP_INTERNAL_ERROR:
                    break;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return data.toString();
    }
}
