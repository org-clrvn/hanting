package com.sy.hting.biz.cy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.cy.IDriveDao;
import com.sy.hting.pojo.Servicecollection;
import com.sy.hting.pojo.Servicelevel;
import com.sy.hting.pojo.Sharea;
import com.sy.hting.vo.cy.ServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("all")
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly= true)
public class DriveBiz {

    @Autowired
    private IDriveDao dao;

    public List<Sharea> queryCountries(){
        return dao.queryCountries();
    }

    public List<Sharea> queryCities(Integer id){
        return dao.queryCities(id);
    }

    public  List<Servicelevel> queryLevel(Integer id){
        return dao.queryLevel(id);
    }

    public PageInfo<ServiceDetail> queryServices(Integer pageNum, Integer pageSize, Integer stid){
        PageHelper.startPage(pageNum,pageSize);
        return  new PageInfo<>(dao.queryServices(stid));
    }

    public ServiceDetail querySd(Integer id){
        ServiceDetail sd = dao.querySd(id);
        sd.setOrderCount(dao.queryOrderCount(id));
        sd.setCollectCount(dao.queryCollectCount(id));
        return sd;
    }

    public Servicecollection queryCollectByUidAndSid(Integer uid, Integer sid){
        return dao.queryCollectByUidAndSid(uid,sid);
    }

    public void collect(Integer uid,Integer sid){
        Servicecollection s = dao.queryCollectByUidAndSid(uid,sid);
        if(s==null){
            dao.addCollect(uid,sid);
        }else{
            dao.delCollet(s.getSerColleID());
        }
    }
}
