package com.xs.www.dao;

import com.xs.www.bean.XsAdmin;
import com.xs.www.bean.XsAdminExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface XsAdminMapper {
    long countByExample(XsAdminExample example);

    int deleteByExample(XsAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XsAdmin record);

    int insertSelective(XsAdmin record);

    List<XsAdmin> selectByExample(XsAdminExample example);

    XsAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XsAdmin record, @Param("example") XsAdminExample example);

    int updateByExample(@Param("record") XsAdmin record, @Param("example") XsAdminExample example);

    int updateByPrimaryKeySelective(XsAdmin record);

    int updateByPrimaryKey(XsAdmin record);
}