package com.power.mapper;

import com.power.pojo.Administrators;
import com.power.pojo.AdministratorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministratorsMapper {
    int countByExample(AdministratorsExample example);

    int deleteByExample(AdministratorsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Administrators record);

    int insertSelective(Administrators record);

    List<Administrators> selectByExample(AdministratorsExample example);

    Administrators selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Administrators record, @Param("example") AdministratorsExample example);

    int updateByExample(@Param("record") Administrators record, @Param("example") AdministratorsExample example);

    int updateByPrimaryKeySelective(Administrators record);

    int updateByPrimaryKey(Administrators record);
}