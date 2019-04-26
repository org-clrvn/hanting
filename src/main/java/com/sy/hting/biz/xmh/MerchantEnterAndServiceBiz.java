package com.sy.hting.biz.xmh;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.dao.xmh.IMerchantEnterAndServiceDao;
import com.sy.hting.pojo.*;
import com.sy.hting.util.redis.RedisBaseOps;
import com.sy.hting.vo.xmh.AdvertisementVO;
import com.sy.hting.vo.xmh.HomePostVO;
import com.sy.hting.vo.xmh.SerRecommendVO;
import com.sy.hting.vo.xmh.ServicesVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.Cursor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @describe
 * @company 晟源科技有限公司
 * @create 2019-03-21 14:14
 */
@Service
public class MerchantEnterAndServiceBiz {
    @Autowired
    private IMerchantEnterAndServiceDao dao;
    @Autowired
    private RedisBaseOps rbo;

    /**
     * 查询服务类别
     * @param stpid 服务类别父级编号，为空则代表查询最高级服务类别
     * @return
     */
    public List<Servicetype> queryServiceType(Integer stpid, Integer selectNum){
        return dao.queryServiceType(stpid, selectNum);
    }
    /**
     * 查询服务语言
     * @return
     */
    public List<Languagetype> queryLanguagetype(){
        return dao.queryLanguagetype();
    }
    /**
     * 查询专业
     * @return
     */
    public List<Majortype> queryMajortype(){
        return dao.queryMajortype();
    }
    /**
     * 查询中韩行政地区地址信息
     * @param pid 地址编号
     * @return
     */
    public List<Sharea> querySharea(Integer pid, boolean flag){
        return dao.querySharea(pid,flag);
    }
    /**
     * 查询商家入驻需缴纳保证金金额
     * @return
     */
    public float queryBond() {
        return dao.queryBond();
    }
    /**
     * 商家入驻
     * @return
     */
    public int merchantMove(User user, float bond) {
        return dao.merchantMove(user,bond);
    }
    /**
     * 新增金币流向记录
     * @param userID 用户编号
     * @param acquisitionMode 流向类别
     * @param recordDescribe 记录描述
     * @param recordInAndOut 收入支出
     * @param auditStatus 记录状态
     * @return
     */
    public int saveGoldNotes(Integer userID,Integer acquisitionMode,String recordDescribe,float recordInAndOut,Integer auditStatus) {
        return dao.saveGoldNotes(userID, acquisitionMode, recordDescribe, recordInAndOut, auditStatus);
    }
    /**
     * 查询首页社区服务最新帖子
     * @return
     */
    @Cacheable("queryHomePostVO")
    public List<HomePostVO> queryHomePostVO(){
        return dao.queryHomePostVO();
    }
    /**
     * 查询首页社区服务最新帖子(缓存同步)
     * @return
     */
    @CachePut("queryHomePostVO")
    public List<HomePostVO> refreshQueryHomePostVO(){
        return dao.queryHomePostVO();
    }
    /**
     * 查询首页社区服务美妆天地板块帖子
     * @return
     */
    @Cacheable("queryHomePostByMakeup")
    public List<Post> queryHomePostByMakeup(){
        return dao.queryHomePostByMakeup();
    }
    /**
     * 查询首页社区服务美妆天地板块帖子(缓存同步)
     * @return
     */
    @CachePut("queryHomePostByMakeup")
    public List<Post> refreshQueryHomePostByMakeup(){
        return dao.queryHomePostByMakeup();
    }
    /**
     * 查询排版编号
     * @return
     */
    @Cacheable("queryGraphyid")
    public Integer queryGraphyid(String str){
        return dao.queryGraphyid(str);
    }
    /**
     * 首页社区服务广告位查询
     * @param flag
     * @return
     */
    @Cacheable("queryHomeAdvertising")
    public List<AdvertisementVO> queryHomeAdvertising(Integer flag, Integer graphyid) {
        return dao.queryHomeAdvertising(flag,graphyid);
    }
    /**
     * 首页社区服务星级服务推荐商家
     * @param stid
     * @return
     */
    @Cacheable("querySerRecommendVO")
    public List<SerRecommendVO> querySerRecommendVO(Integer stid){
        return dao.querySerRecommendVO(stid);
    }
    /**
     * 根据服务列表
     * @return
     */
    public List<ServicesVO> queryServices(){
       return dao.queryServices();
    }
    /**
     * 全文检索
     * @return
     */
    public List<ServicesVO> getServiceListByName(String name) {
        Cursor<Object> iter = rbo.sGetByName("set:service",name);
        List<ServicesVO> serivce = new ArrayList<ServicesVO>();
        while(iter.hasNext()) {
            serivce.add(JSON.parseObject(iter.next().toString(),ServicesVO.class));
        }
        return serivce;
    }
    /**
     * 全文检索分页查询
     * @return
     */
    public PageInfo<ServicesVO> getServicePage(Integer pageNum,Integer pageSize,String name) {
        Cursor<Object> iter = rbo.sGetByName("set:service",name);
        rbo.expire("set:service",60*60*60*24);
        List<ServicesVO> serivce = new ArrayList<ServicesVO>();
        while(iter.hasNext()) {
            serivce.add(JSON.parseObject(iter.next().toString(),ServicesVO.class));
        }
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<ServicesVO>(serivce);
    }
}
