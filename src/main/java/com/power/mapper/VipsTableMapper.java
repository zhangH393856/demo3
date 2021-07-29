package com.power.mapper;

import com.power.pojo.VipsTable;
import com.power.pojo.VipsTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipsTableMapper {
    int countByExample(VipsTableExample example);

    int deleteByExample(VipsTableExample example);

    int deleteByPrimaryKey(Integer vipId);

    int insert(VipsTable record);

    int insertSelective(VipsTable record);

    List<VipsTable> selectByExample(VipsTableExample example);

    VipsTable selectByPrimaryKey(Integer vipId);

    int updateByExampleSelective(@Param("record") VipsTable record, @Param("example") VipsTableExample example);

    int updateByExample(@Param("record") VipsTable record, @Param("example") VipsTableExample example);

    int updateByPrimaryKeySelective(VipsTable record);

    int updateByPrimaryKey(VipsTable record);
}