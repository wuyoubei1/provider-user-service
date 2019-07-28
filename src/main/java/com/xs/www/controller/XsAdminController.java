package com.xs.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.xs.www.bean.XsAdmin;
import com.xs.www.common.Wrapper;
import com.xs.www.service.IXsAdminService;


@RestController
@RequestMapping(value="/admin")
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
	

}
