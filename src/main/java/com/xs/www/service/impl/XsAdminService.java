package com.xs.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xs.www.dao.XsAdminMapper;
import com.xs.www.bean.XsAdmin;
import com.xs.www.bean.XsAdminExample;
import com.xs.www.service.IXsAdminService;

@Service
public class XsAdminService implements IXsAdminService{
	
	@Autowired
	private XsAdminMapper xsAdminMapper;
	
	public List<XsAdmin> getList(){
		XsAdminExample example = new XsAdminExample();
		xsAdminMapper.countByExample(example);
		List<XsAdmin> list=xsAdminMapper.selectByExample(example);
		return list;
	}

}
