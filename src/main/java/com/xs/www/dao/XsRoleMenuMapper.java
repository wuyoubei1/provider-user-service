package com.xs.www.dao;

import com.xs.www.bean.XsRoleMenu;
import com.xs.www.bean.XsRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsRoleMenuMapper {
    long countByExample(XsRoleMenuExample example);

    int deleteByExample(XsRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XsRoleMenu record);

    int insertSelective(XsRoleMenu record);

    List<XsRoleMenu> selectByExample(XsRoleMenuExample example);

    XsRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XsRoleMenu record, @Param("example") XsRoleMenuExample example);

    int updateByExample(@Param("record") XsRoleMenu record, @Param("example") XsRoleMenuExample example);

    int updateByPrimaryKeySelective(XsRoleMenu record);

    int updateByPrimaryKey(XsRoleMenu record);
}