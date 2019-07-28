package com.xs.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.xs.www.bean.XsAdmin;
import com.xs.www.common.Wrapper;
import com.xs.www.service.IXsAdminService;

@RestController
@RequestMapping(value="/login")
public class XsLoginController {
	
	@Autowired
	private IXsAdminService xsAdminService;
	
	@PostMapping(value="/login")
	public  Wrapper<XsAdmin,XsAdmin> login(@RequestBody String str){
		JSONObject reagobj = JSONObject.parseObject(str);
		String name = reagobj.getString("name");
		String password = reagobj.getString("password");
		String systemId = reagobj.getString("systemId");
		short sysId = Short.parseShort(systemId);
		//安全校验
		Wrapper<XsAdmin,XsAdmin> wrapper=xsAdminService.login(name, password, sysId);
		return wrapper;
	}
}
