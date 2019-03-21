package com.sy.hting.dao.cy;


import com.sy.hting.pojo.Servicetype;
import org.apache.ibatis.annotations.Param;

public interface IServiceCheckDao {

    /*修改服务审核*/
    void updateServiceCheck(@Param("st") Servicetype st);
}
