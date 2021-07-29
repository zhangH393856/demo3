package com.power.mapper;

import com.power.pojo.RoomTable;
import com.power.pojo.RoomTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomTableMapper {
    int countByExample(RoomTableExample example);

    int deleteByExample(RoomTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomTable record);

    int insertSelective(RoomTable record);

    List<RoomTable> selectByExample(RoomTableExample example);

    RoomTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomTable record, @Param("example") RoomTableExample example);

    int updateByExample(@Param("record") RoomTable record, @Param("example") RoomTableExample example);

    int updateByPrimaryKeySelective(RoomTable record);

    int updateByPrimaryKey(RoomTable record);
}