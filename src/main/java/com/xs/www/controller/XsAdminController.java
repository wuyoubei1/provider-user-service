package com.xs.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.xs.www.bean.XsAdmin;
import com.xs.www.common.Wrapper;
import com.xs.www.service.IXsAdminService;


@RestController
@RequestMapping(value="/admin")
public class XsAdminController {
	
	@Autowired
	private IXsAdminService xsAdminService;

	@PostMapping(value="/getAdminList")
	public Page<XsAdmin> getAdminList(int pageNo,int pageSize) {
		Page<XsAdmin> page=xsAdminService.getList(pageNo,pageSize);
		return page;
	}
	
	@GetMapping(value="/list")
	public Page<XsAdmin> list(int pageNo,@RequestBody int pageSize) {
		Page<XsAdmin> page=xsAdminService.getList(pageNo,pageSize);
		page.setTotal(page.getTotal());
		return page;
	}
	
	@GetMapping(value="actuator/info")
	public String actuatorInfo(){
		Page<XsAdmin> page=xsAdminService.getList(1,1);
		System.out.println("========="+page.getResult().get(0));
		return "ok";
	}
	

}
