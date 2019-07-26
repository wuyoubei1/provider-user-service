package com.xs.www.service;

import java.util.List;

import com.xs.www.bean.XsAdmin;

public interface IXsAdminService {

	/**
	 * 获取管理员列表
	 * @return
	 */
	public List<XsAdmin> getList();
}
