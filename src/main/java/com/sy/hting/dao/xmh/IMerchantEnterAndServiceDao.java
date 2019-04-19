package com.sy.hting.dao.xmh;

import com.sy.hting.pojo.*;
import com.sy.hting.vo.xmh.AdvertisementVO;
import com.sy.hting.vo.xmh.HomePostVO;
import com.sy.hting.vo.xmh.SerRecommendVO;
import com.sy.hting.vo.xmh.*;
import com.sy.hting.vo.xmh.ServicesVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @describe
 * @company 晟源科技有限公司
 * @create 2019-03-21 13:57
 */
public interface IMerchantEnterAndServiceDao {
    /**
     * 查询服务类别
     * @param stpid 服务类别父级编号，为空则代表查询最高级服务类别
     * @return
     */
    public List<Servicetype> queryServiceType(@Param("stpid") Integer stpid, @Param("selectNum") Integer selectNum);
    /**
     * 查询服务语言
     * @return
     */
    public List<Languagetype> queryLanguagetype();
    /**
     * 查询专业
     * @return
     */
    public List<Majortype> queryMajortype();
    /**
     * 查询中韩行政地区地址信息
     * @param pid 地址编号
     * @return
     */
    public List<Sharea> querySharea(@Param("pid") Integer pid, @Param("flag") boolean flag);
    /**
     * 查询商家入驻需缴纳保证金金额
     * @return
     */
    public float queryBond();
    /**
     * 商家入驻
     * @return
     */
    public int merchantMove(@Param("obj") User user, @Param("bond") float bond);
    /**
     * 新增金币流向记录
     * @param userID 用户编号
     * @param acquisitionMode 流向类别
     * @param recordDescribe 记录描述
     * @param recordInAndOut 收入支出
     * @param auditStatus 记录状态
     * @return
     */
    public int saveGoldNotes(@Param("userID") Integer userID, @Param("acquisitionMode") Integer acquisitionMode, @Param("recordDescribe") String recordDescribe, @Param("recordInAndOut") float recordInAndOut, @Param("auditStatus") Integer auditStatus);
    /**
     * 查询首页社区服务最新帖子
     * @return
     */
    public List<HomePostVO> queryHomePostVO();
    /**
     * 查询首页社区服务美妆天地板块帖子
     * @return
     */
    public List<Post> queryHomePostByMakeup();
    /**
     * 查询排版编号
     * @return
     */
    public Integer queryGraphyid(@Param("str") String str);
    /**
     * 首页社区服务广告位查询
     * @param flag
     * @return
     */
    public List<AdvertisementVO> queryHomeAdvertising(@Param("flag") Integer flag, @Param("graphyid") Integer graphyid);
    /**
     * 首页社区服务星级服务推荐商家
     * @param stid
     * @return
     */
    public List<SerRecommendVO> querySerRecommendVO(@Param("stid") Integer stid);
    /**
     * 根据服务列表
     * @return
     */
    public List<ServicesVO> queryServices();
}
