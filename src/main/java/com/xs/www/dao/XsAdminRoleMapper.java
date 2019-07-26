package com.xs.www.dao;

import com.xs.www.bean.XsAdminRole;
import com.xs.www.bean.XsAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsAdminRoleMapper {
    long countByExample(XsAdminRoleExample example);

    int deleteByExample(XsAdminRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XsAdminRole record);

    int insertSelective(XsAdminRole record);

    List<XsAdminRole> selectByExample(XsAdminRoleExample example);

    XsAdminRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XsAdminRole record, @Param("example") XsAdminRoleExample example);

    int updateByExample(@Param("record") XsAdminRole record, @Param("example") XsAdminRoleExample example);

    int updateByPrimaryKeySelective(XsAdminRole record);

    int updateByPrimaryKey(XsAdminRole record);
}