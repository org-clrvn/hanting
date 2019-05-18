package com.sy.hting.dao.lzy;

import com.sy.hting.pojo.*;
import com.sy.hting.vo.lzy.AppSertypeVo;
import com.sy.hting.vo.lzy.EvaUserSerVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 21:56
 */
public interface ISjzxIndexDao {

    /**
     * 加载查询商家中心列表信息--商家信息
     * @param userID
     * @return
     */
    public User loadUserByUserID(@Param("userID") int userID);

    /**
     * 加载查询商家中心--我提交的鉴定
     * @param userID
     * @return
     */
    List<AppSertypeVo> loadAppraisalapplyList(@Param("userID")int userID);

    /**
     * 提交鉴定
     * @param appraisalapply
     * @return
     */
    int updateAppraisalapplyByApplyID(@Param("appraisalapply")Appraisalapply appraisalapply);

    /**
     * 根据用户编号查询托管信息
     * @param userID
     * @return
     */
    List<Trusteeship> loadTrusteeship(@Param("userID")int userID);

    /**
     * 根据用户编号查询评价信息
     * @param userID
     * @return
     */
    List<EvaUserSerVo> loadEvaUserSerVoList(@Param("userID")int userID);

}
