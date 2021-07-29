package com.power.mapper;

import com.power.pojo.FoodTable;
import com.power.pojo.FoodTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodTableMapper {
    int countByExample(FoodTableExample example);

    int deleteByExample(FoodTableExample example);

    int deleteByPrimaryKey(Integer foodId);

    int insert(FoodTable record);

    int insertSelective(FoodTable record);

    List<FoodTable> selectByExample(FoodTableExample example);

    FoodTable selectByPrimaryKey(Integer foodId);

    int updateByExampleSelective(@Param("record") FoodTable record, @Param("example") FoodTableExample example);

    int updateByExample(@Param("record") FoodTable record, @Param("example") FoodTableExample example);

    int updateByPrimaryKeySelective(FoodTable record);

    int updateByPrimaryKey(FoodTable record);
}