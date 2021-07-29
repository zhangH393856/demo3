package com.power.mapper;

import com.power.pojo.EnergyTable;
import com.power.pojo.EnergyTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnergyTableMapper {
    int countByExample(EnergyTableExample example);

    int deleteByExample(EnergyTableExample example);

    int deleteByPrimaryKey(Integer energyId);

    int insert(EnergyTable record);

    int insertSelective(EnergyTable record);

    List<EnergyTable> selectByExample(EnergyTableExample example);

    EnergyTable selectByPrimaryKey(Integer energyId);

    int updateByExampleSelective(@Param("record") EnergyTable record, @Param("example") EnergyTableExample example);

    int updateByExample(@Param("record") EnergyTable record, @Param("example") EnergyTableExample example);

    int updateByPrimaryKeySelective(EnergyTable record);

    int updateByPrimaryKey(EnergyTable record);
}