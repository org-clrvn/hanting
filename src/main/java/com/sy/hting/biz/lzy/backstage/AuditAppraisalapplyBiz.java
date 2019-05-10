package com.sy.hting.biz.lzy.backstage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lzy.backstage.IAuditAppraisalapplyDao;
import com.sy.hting.vo.lzy.AppSertypeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/5/10 9:28
 */
@Service
public class AuditAppraisalapplyBiz {

    @Resource
    private IAuditAppraisalapplyDao appraisalapplyDao;


    public PageInfo<AppSertypeVo> loadAppSertypeVo(int pageNum, int pageSize, int applyID){
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<AppSertypeVo> pageInfo = new PageInfo<AppSertypeVo>(appraisalapplyDao.loadAppSertypeVo(applyID));

        return pageInfo;
    }

    public List<AppSertypeVo> findAppSertypeVoByApplyID(int applyID){
        return appraisalapplyDao.loadAppSertypeVo(applyID);
    }

    public int modifyAppSertypeVoByApplyID(int auditStatus, String adminOpinion, int applyID){
        return appraisalapplyDao.updateAppSertypeVoByApplyID(auditStatus, adminOpinion, applyID);
    }


}
