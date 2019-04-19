package com.sy.hting.dao.lsy;

import com.sy.hting.vo.gsh.IntegralVo;
import com.sy.hting.vo.gsh.PutforwardrecordVo;
import com.sy.hting.vo.gsh.RecordVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRecordDao {
    List<RecordVo> queryAll(@Param("userName") String userName);

    List<RecordVo> queryRecharge(@Param("userName") String userName);

    List<IntegralVo> queryIntegral(@Param("userName") String userName);

    List<PutforwardrecordVo> querytixian();
}
