package com.xs.www.dao;

import com.xs.www.bean.XsMenu;
import com.xs.www.bean.XsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsMenuMapper {
	public long countByExample(XsMenuExample example);

	public int deleteByExample(XsMenuExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(XsMenu record);

	public int insertSelective(XsMenu record);

	public List<XsMenu> selectByExample(XsMenuExample example);

	public XsMenu selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") XsMenu record, @Param("example") XsMenuExample example);

	public int updateByExample(@Param("record") XsMenu record, @Param("example") XsMenuExample example);

	public int updateByPrimaryKeySelective(XsMenu record);

	public int updateByPrimaryKey(XsMenu record);
}