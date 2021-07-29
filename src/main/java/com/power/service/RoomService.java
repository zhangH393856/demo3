package com.power.service;

import com.power.mapper.HouseTableMapper;
import com.power.mapper.RoomTableMapper;
import com.power.mapper.UnitTableMapper;
import com.power.pojo.HouseTable;
import com.power.pojo.RoomTable;
import com.power.pojo.UnitTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: RoomService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 12:26 2021/7/24
 * @Version 1.0
 **/
@Service
public class RoomService {
    @Autowired
    //房间Mapper
    RoomTableMapper roomTableMapper;
    //单元Mapper
    @Autowired
    UnitTableMapper unitTableMapper;
    //用户住房信息mapper
    @Autowired
    HouseTableMapper houseTableMapper;

    //查询所有房间
    public List<RoomTable> selectRoom() {
        return roomTableMapper.selectByExample(null);
    }

    //查询所有单元
    public List<UnitTable> selectUnit() {
        return unitTableMapper.selectByExample(null);
    }

    //根据id查单元
    public UnitTable selectUnitId(Integer id) {
        return unitTableMapper.selectByPrimaryKey(id);
    }

    //根据id查房间
    public RoomTable selectRoomId(Integer id) {
        return roomTableMapper.selectByPrimaryKey(id);
    }

    //查询用户住房信息
    public List<HouseTable> selectHouse() {
        return houseTableMapper.selectByExample(null);
    }

    //单元信息新增
    public int unitinsert(UnitTable unitTable) {
        return unitTableMapper.insertSelective(unitTable);
    }

    //单元信息修改
    public int unitupdate(UnitTable unitTable) {
        return unitTableMapper.updateByPrimaryKeySelective(unitTable);
    }

    //单元删除
    public int deleteunit(Integer id) {
        return unitTableMapper.deleteByPrimaryKey(id);
    }

    //房间信息修改
    public int roomoupdate(RoomTable roomTable) {
        return roomTableMapper.updateByPrimaryKeySelective(roomTable);
    }

    //房间信息新增
    public int roominsert(RoomTable roomTable) {
        return roomTableMapper.insertSelective(roomTable);
    }

    //房间删除
    public int deleteroom(Integer id) {
        return roomTableMapper.deleteByPrimaryKey(id);
    }
    //住房信息查看
    public List<HouseTable> selecthouse(){
        return  houseTableMapper.selectByExample(null);
    }
}
