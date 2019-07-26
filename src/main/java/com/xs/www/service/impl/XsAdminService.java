package com.xs.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xs.www.bean.XsAdmin;
import com.xs.www.bean.XsAdminExample;
import com.xs.www.bean.XsAdminExample.Criteria;
import com.xs.www.common.Concat;
import com.xs.www.common.Wrapper;
import com.xs.www.dao.XsAdminMapper;
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
	
	public Wrapper<XsAdmin,XsAdmin> login(String name,String password,short systemId){
		Wrapper<XsAdmin,XsAdmin> wrapper= new Wrapper<XsAdmin,XsAdmin>();
		XsAdminExample example = new XsAdminExample();
		Criteria criteria=example.createCriteria();
		criteria.andLoginNameEqualTo(name);
		criteria.andPasswordEqualTo(password);
		criteria.andSystemIdEqualTo(systemId);
		List<XsAdmin> list=xsAdminMapper.selectByExample(example);
		if(null!=list&&list.size()>0){
			wrapper.setInstance(list.get(0));
			wrapper.setCode(Concat.SUCCESS);
			wrapper.setMsg("登陆成功");
		}else{
			wrapper.setCode(Concat.ERROR);
			wrapper.setMsg("登陆失败");
		}
		return wrapper;
	}

}
