package com.xs.www.dao;

import com.xs.www.bean.XsAdmin;
import com.xs.www.bean.XsAdminExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XsAdminMapper {
	public long countByExample(XsAdminExample example);

	public  int deleteByExample(XsAdminExample example);

	public int insert(XsAdmin record);

	public int insertSelective(XsAdmin record);

    public List<XsAdmin> selectByExample(XsAdminExample example);

    public int updateByExampleSelective(@Param("record") XsAdmin record, @Param("example") XsAdminExample example);

    public int updateByExample(@Param("record") XsAdmin record, @Param("example") XsAdminExample example);
}