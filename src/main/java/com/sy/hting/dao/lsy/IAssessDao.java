package com.sy.hting.dao.lsy;

import com.sy.hting.vo.gsh.PingVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAssessDao {
    List<PingVo> queryAllAssess(@Param("userName") String userName, @Param("title") String title);
}
