package com.xs.www.dao;

import com.xs.www.bean.XsRole;
import com.xs.www.bean.XsRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface XsRoleMapper {
	public long countByExample(XsRoleExample example);

	public int deleteByExample(XsRoleExample example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(XsRole record);

	public int insertSelective(XsRole record);

	public List<XsRole> selectByExample(XsRoleExample example);

	public XsRole selectByPrimaryKey(Integer id);

	public  int updateByExampleSelective(@Param("record") XsRole record, @Param("example") XsRoleExample example);

	public  int updateByExample(@Param("record") XsRole record, @Param("example") XsRoleExample example);

	public int updateByPrimaryKeySelective(XsRole record);

	public int updateByPrimaryKey(XsRole record);
}