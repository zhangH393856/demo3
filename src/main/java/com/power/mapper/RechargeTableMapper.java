package com.power.mapper;

import com.power.pojo.RechargeTable;
import com.power.pojo.RechargeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeTableMapper {
    int countByExample(RechargeTableExample example);

    int deleteByExample(RechargeTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RechargeTable record);

    int insertSelective(RechargeTable record);

    List<RechargeTable> selectByExample(RechargeTableExample example);

    RechargeTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RechargeTable record, @Param("example") RechargeTableExample example);

    int updateByExample(@Param("record") RechargeTable record, @Param("example") RechargeTableExample example);

    int updateByPrimaryKeySelective(RechargeTable record);

    int updateByPrimaryKey(RechargeTable record);
}