package com.power.mapper;

import com.power.pojo.OrderfoodTable;
import com.power.pojo.OrderfoodTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderfoodTableMapper {
    int countByExample(OrderfoodTableExample example);

    int deleteByExample(OrderfoodTableExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderfoodTable record);

    int insertSelective(OrderfoodTable record);

    List<OrderfoodTable> selectByExample(OrderfoodTableExample example);

    OrderfoodTable selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderfoodTable record, @Param("example") OrderfoodTableExample example);

    int updateByExample(@Param("record") OrderfoodTable record, @Param("example") OrderfoodTableExample example);

    int updateByPrimaryKeySelective(OrderfoodTable record);

    int updateByPrimaryKey(OrderfoodTable record);
}