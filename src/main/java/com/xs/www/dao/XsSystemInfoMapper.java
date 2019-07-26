package com.xs.www.dao;

import com.xs.www.bean.XsSystemInfo;
import com.xs.www.bean.XsSystemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsSystemInfoMapper {
    long countByExample(XsSystemInfoExample example);

    int deleteByExample(XsSystemInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XsSystemInfo record);

    int insertSelective(XsSystemInfo record);

    List<XsSystemInfo> selectByExample(XsSystemInfoExample example);

    XsSystemInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XsSystemInfo record, @Param("example") XsSystemInfoExample example);

    int updateByExample(@Param("record") XsSystemInfo record, @Param("example") XsSystemInfoExample example);

    int updateByPrimaryKeySelective(XsSystemInfo record);

    int updateByPrimaryKey(XsSystemInfo record);
}