package com.power.mapper;

import com.power.pojo.HouseTable;
import com.power.pojo.HouseTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseTableMapper {
    int countByExample(HouseTableExample example);

    int deleteByExample(HouseTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseTable record);

    int insertSelective(HouseTable record);

    List<HouseTable> selectByExample(HouseTableExample example);

    HouseTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseTable record, @Param("example") HouseTableExample example);

    int updateByExample(@Param("record") HouseTable record, @Param("example") HouseTableExample example);

    int updateByPrimaryKeySelective(HouseTable record);

    int updateByPrimaryKey(HouseTable record);
}