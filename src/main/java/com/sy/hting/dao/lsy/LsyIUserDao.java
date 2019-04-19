package com.sy.hting.dao.lsy;

import com.sy.hting.vo.gsh.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LsyIUserDao {
    List<UserVo> queryUser(@Param("userName") String userNickName);

    List<UserVo> queryShop(@Param("userName") String userName, @Param("shopName") String shopName, @Param("merchantType") String merchantType);
}
