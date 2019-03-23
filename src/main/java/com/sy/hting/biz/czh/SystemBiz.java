package com.sy.hting.biz.czh;

import com.sy.hting.dao.czh.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sy.hting.pojo.System;

/**
 * @description:系统biz
 * @className:SystemBiz
 * @author: Clrvn
 * @date: 2019-03-23 9:25
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS, readOnly = true)
public class SystemBiz {
	
	@Autowired
	private SystemMapper mapper;
	
	/**
	 * @description:查询默认的系统配置
	 * @date: 2019-03-23 9:36
	 */
	public System querySystem() {
		return mapper.selectByPrimaryKey(1);
	}
	
	/**
	 * @description:修改系统配置
	 * @date: 2019-03-23 9:42
	 */
	public int updateSystem(System system) {
		return mapper.updateByPrimaryKey(system);
	}
}
