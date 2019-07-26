package com.xs.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.xs.www.bean.XsAdmin;
import com.xs.www.common.Wrapper;
import com.xs.www.service.IXsAdminService;


@RestController
public class XsAdminController {
	
	@Autowired
	private IXsAdminService xsAdminService;

	@PostMapping(value="/getAdminList")
	public List<XsAdmin> getAdminList() {
		List<XsAdmin> list=xsAdminService.getList();
		return list;
	}
	
	@GetMapping(value="/list")
	public List<XsAdmin> list() {
		List<XsAdmin> list=xsAdminService.getList();
		return list;
	}
	
	@GetMapping(value="actuator/info")
	public String actuatorInfo(){
		List<XsAdmin> list=xsAdminService.getList();
		System.out.println("========="+list);
		return "ok";
	}
	
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
