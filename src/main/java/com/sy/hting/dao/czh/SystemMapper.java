package com.sy.hting.dao.czh;

import java.util.List;

import com.sy.hting.pojo.SystemExample;
import org.apache.ibatis.annotations.Param;
import com.sy.hting.pojo.System;

public interface SystemMapper {
	
	int countByExample(SystemExample example);
	
	int deleteByExample(SystemExample example);
	
	int deleteByPrimaryKey(Integer sysid);
	
	int insert(System record);
	
	int insertSelective(System record);
	
	List<System> selectByExample(SystemExample example);
	
	System selectByPrimaryKey(Integer sysid);
	
	int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);
	
	int updateByExample(@Param("record") System record, @Param("example") SystemExample example);
	
	int updateByPrimaryKeySelective(System record);
	
	int updateByPrimaryKey(System record);
}