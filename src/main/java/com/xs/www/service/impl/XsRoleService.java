package com.xs.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xs.www.bean.XsAdmin;
import com.xs.www.bean.XsAdminExample;
import com.xs.www.bean.XsRole;
import com.xs.www.bean.XsRoleExample;
import com.xs.www.dao.XsAdminMapper;
import com.xs.www.dao.XsRoleMapper;
import com.xs.www.service.IXsRoleService;

@Service
public class XsRoleService implements IXsRoleService {

	@Autowired
	private XsRoleMapper roleMapper;
	
	public List<XsRole> getList(){
		XsRoleExample example = new XsRoleExample();
		Page page = PageHelper.startPage(1, 1, true);
		List<XsRole> list=roleMapper.selectByExample(example);
		long total=page.getTotal();
		return list;
	}
	
}
