package com.power.mapper;

import com.power.pojo.UserTable1;
import com.power.pojo.UserTable1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTable1Mapper {
    int countByExample(UserTable1Example example);

    int deleteByExample(UserTable1Example example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserTable1 record);

    int insertSelective(UserTable1 record);

    List<UserTable1> selectByExample(UserTable1Example example);

    UserTable1 selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserTable1 record, @Param("example") UserTable1Example example);

    int updateByExample(@Param("record") UserTable1 record, @Param("example") UserTable1Example example);

    int updateByPrimaryKeySelective(UserTable1 record);

    int updateByPrimaryKey(UserTable1 record);
}