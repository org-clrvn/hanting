package com.sy.hting.biz.lsy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lsy.IAssessDao;
import com.sy.hting.vo.gsh.PingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssessBiz {
    @Autowired
    private IAssessDao dao;

    public PageInfo<PingVo> queryAllAssess(Integer pageNum, Integer pageSize, String userName, String title){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<PingVo>(dao.queryAllAssess(userName, title));
    }
}
