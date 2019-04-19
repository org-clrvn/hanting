package com.sy.hting.biz.lsy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.lsy.IRecordDao;
import com.sy.hting.vo.gsh.IntegralVo;
import com.sy.hting.vo.gsh.PutforwardrecordVo;
import com.sy.hting.vo.gsh.RecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordBiz {
    @Autowired
    private IRecordDao dao;

    public PageInfo<RecordVo> queryAll(Integer pageNum, Integer pageSize,String userName) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<RecordVo>(dao.queryAll(userName));
    }

    public PageInfo<RecordVo> queryRecharge(Integer pageNum, Integer pageSize, String userName) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<RecordVo>(dao.queryRecharge(userName));
    }

    public PageInfo<IntegralVo> queryIntegral(Integer pageNum, Integer pageSize, String userName) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<IntegralVo>(dao.queryIntegral(userName));
    }

    public PageInfo<PutforwardrecordVo> findtixian(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<PutforwardrecordVo>(dao.querytixian());
    }
}
