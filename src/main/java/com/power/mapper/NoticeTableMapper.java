package com.power.mapper;

import com.power.pojo.NoticeTable;
import com.power.pojo.NoticeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeTableMapper {
    int countByExample(NoticeTableExample example);

    int deleteByExample(NoticeTableExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(NoticeTable record);

    int insertSelective(NoticeTable record);

    List<NoticeTable> selectByExample(NoticeTableExample example);

    NoticeTable selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") NoticeTable record, @Param("example") NoticeTableExample example);

    int updateByExample(@Param("record") NoticeTable record, @Param("example") NoticeTableExample example);

    int updateByPrimaryKeySelective(NoticeTable record);

    int updateByPrimaryKey(NoticeTable record);
}