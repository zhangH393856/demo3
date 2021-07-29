package com.power.mapper;

import com.power.pojo.GiftTable;
import com.power.pojo.GiftTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftTableMapper {
    int countByExample(GiftTableExample example);

    int deleteByExample(GiftTableExample example);

    int deleteByPrimaryKey(Integer giftId);

    int insert(GiftTable record);

    int insertSelective(GiftTable record);

    List<GiftTable> selectByExample(GiftTableExample example);

    GiftTable selectByPrimaryKey(Integer giftId);

    int updateByExampleSelective(@Param("record") GiftTable record, @Param("example") GiftTableExample example);

    int updateByExample(@Param("record") GiftTable record, @Param("example") GiftTableExample example);

    int updateByPrimaryKeySelective(GiftTable record);

    int updateByPrimaryKey(GiftTable record);
}