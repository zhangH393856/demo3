package com.power.mapper;

import com.power.pojo.UnitTable;
import com.power.pojo.UnitTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitTableMapper {
    int countByExample(UnitTableExample example);

    int deleteByExample(UnitTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UnitTable record);

    int insertSelective(UnitTable record);

    List<UnitTable> selectByExample(UnitTableExample example);

    UnitTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UnitTable record, @Param("example") UnitTableExample example);

    int updateByExample(@Param("record") UnitTable record, @Param("example") UnitTableExample example);

    int updateByPrimaryKeySelective(UnitTable record);

    int updateByPrimaryKey(UnitTable record);
}