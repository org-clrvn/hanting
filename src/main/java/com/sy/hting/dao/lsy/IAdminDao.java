package com.sy.hting.dao.lsy;

import com.sy.hting.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface IAdminDao {

    Admin login(@Param("name") String name, @Param("password") String password);
}
