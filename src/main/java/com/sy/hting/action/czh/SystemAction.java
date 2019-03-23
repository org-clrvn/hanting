package com.sy.hting.action.czh;

import com.sy.hting.biz.czh.SystemBiz;
import com.sy.hting.pojo.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:系统配置Action
 * @className:SystemAction
 * @author: Clrvn
 * @date: 2019-03-23 9:28
 */
@Controller
@RequestMapping("/czh/system")
public class SystemAction {
	@Autowired
	private SystemBiz biz;
	
	@GetMapping("goto")
	public String gotoSystem(Model model) {
		model.addAttribute("list", biz.querySystem());
		return "xtpz";
	}
	
	@GetMapping("query")
	@ResponseBody
	public System goToSystemMgr() {
		return biz.querySystem();
	}
	
	@PutMapping("update")
	@ResponseBody
	public Map<String, Object> updateSystem(Model model, @RequestBody System system) {
		Map<String, Object> map = new HashMap<>();
		try {
			biz.updateSystem(system);
			map.put("code", "200");
			map.put("msg", "ok");
		} catch (Exception ex) {
			map.put("code", "500");
			map.put("msg", ex.getCause());
		}
		return map;
	}
}
