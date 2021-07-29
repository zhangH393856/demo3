package com.power.mapper;

import com.power.pojo.ViptypeTable;
import com.power.pojo.ViptypeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViptypeTableMapper {
    int countByExample(ViptypeTableExample example);

    int deleteByExample(ViptypeTableExample example);

    int deleteByPrimaryKey(Integer viptypeId);

    int insert(ViptypeTable record);

    int insertSelective(ViptypeTable record);

    List<ViptypeTable> selectByExample(ViptypeTableExample example);

    ViptypeTable selectByPrimaryKey(Integer viptypeId);

    int updateByExampleSelective(@Param("record") ViptypeTable record, @Param("example") ViptypeTableExample example);

    int updateByExample(@Param("record") ViptypeTable record, @Param("example") ViptypeTableExample example);

    int updateByPrimaryKeySelective(ViptypeTable record);

    int updateByPrimaryKey(ViptypeTable record);
}