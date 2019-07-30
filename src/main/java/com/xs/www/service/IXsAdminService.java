package com.xs.www.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.xs.www.bean.XsAdmin;
import com.xs.www.common.Wrapper;

public interface IXsAdminService {

	/**
	 * 获取管理员列表
	 * @return
	 */
	public Page<XsAdmin> getList(int pageNo,int pageSize);
	
	/**
	 * 登陆
	 * @param name
	 * @param password
	 * @param systemId 系统ID
	 * @return
	 */
	public Wrapper<XsAdmin,XsAdmin> login(String name,String password,short systemId);
}
