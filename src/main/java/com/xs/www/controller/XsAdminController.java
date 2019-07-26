package com.xs.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xs.www.bean.XsAdmin;
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
	
	@GetMapping(value = "/q")
	public String question(String question) {
		String answers="111";
		if(question.equals("name")) {
			answers="我叫吴禹璇，是一个老娘们";
		}
		return answers;
	}
}
