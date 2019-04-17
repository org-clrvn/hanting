package com.sy.hting.action.lzy.backstage;

import com.sy.hting.biz.lzy.backstage.AuditNewServicesReleaseBiz;
import com.sy.hting.pojo.Services;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 11:29
 */
@RestController
@RequestMapping("/bt/lzy/api")
public class ApiAuditNewServicesReleaseAction {

    @Resource
    private AuditNewServicesReleaseBiz newSerBiz;

    /**
     *@描述  后台,审核新服务发布
     *@参数  [recommendBool, adminOpinion, shelfState, auditStatus, serviceID]
     *@返回值  java.util.Map<java.lang.String,java.lang.String>
     *@创建人  lizeyun
     *@创建时间  2019/4/15
     *@修改人和其它信息
     */
    /*@PutMapping("/modifyServicesByServiceID")
    public Map<String, String> modifyServicesByServiceID(@PathVariable int recommendBool, @PathVariable String adminOpinion, @PathVariable int shelfState, @PathVariable int auditStatus, @PathVariable int serviceID){
        Map<String, String> message = new HashMap<String, String>();
        message.put("init", "100");

        int count = newSerBiz.modifyServicesByServiceID(recommendBool, adminOpinion, shelfState, auditStatus, serviceID);

        if (count > 0){
           message.put("code", "200");
        }else {
            message.put("msg", "500");
        }

        return message;
    }*/

}
