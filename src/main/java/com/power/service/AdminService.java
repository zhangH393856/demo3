package com.power.service;

import com.power.mapper.*;
import com.power.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: AdminService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 14:49 2021/7/21
 * @Version 1.0
 **/
@Service
public class AdminService {
    @Autowired
    EnergyTableMapper energyTableMapper;
    @Autowired
    GiftTableMapper giftTableMapper;
    @Autowired
    NoticeTableMapper noticeTableMapper;
    @Autowired
    UserTable1Mapper userTable1Mapper;
    @Autowired
    HouseTableMapper houseTableMapper;
    @Autowired
    FoodTableMapper foodTableMapper;

    /*
     * @author  zhangH
     * @Description  查询消费列表
     * @date 9:14 2021/7/23
     * @Param []
     * @return
     **/
    public List<EnergyTable> select() {
        return energyTableMapper.selectByExample(null);
    }

    /*
     * @author  zhangH
     * @Description  查询(已支付/未支付)列表
     * @date 9:14 2021/7/23
     * @Param [energyTable]
     * @return
     **/
    public List<EnergyTable> selectState(EnergyTable energyTable) {
        EnergyTableExample energyTableExample = new EnergyTableExample();
        if (energyTable.getEnergyUsername() != null) {
            energyTableExample.createCriteria().andEnergyStateEqualTo(energyTable.getEnergyState()).andEnergyUsernameEqualTo(energyTable.getEnergyUsername());
            return energyTableMapper.selectByExample(energyTableExample);
        } else {
            energyTableExample.createCriteria().andEnergyStateEqualTo(energyTable.getEnergyState());
            return energyTableMapper.selectByExample(energyTableExample);
        }

    }

    /*
     * @author  zhangH
     * @Description  根据id查询单个消费信息
     * @date 9:15 2021/7/23
     * @Param [energyTable]
     * @return
     **/
    public List<EnergyTable> selectId(EnergyTable energyTable) {
        EnergyTableExample energyTableExample = new EnergyTableExample();
        if (energyTable.getEnergyId() != null) {
            energyTableExample.createCriteria().andEnergyUsernameEqualTo(energyTable.getEnergyUsername());
            return energyTableMapper.selectByExample(energyTableExample);
        } else {
            return energyTableMapper.selectByExample(null);
        }

    }

    /*
     * @author  zhangH
     * @Description  添加用户账单
     * @date 10:23 2021/7/22
     * @Param
     * @return
     **/
    public int insertpower(EnergyTable energyTable) {
        energyTable.setEnergyTime(DateUtil.getDate(new Date()));
        energyTable.setEnergyState("未支付");
        energyTable.setEnergyRealmoney(energyTable.getEnergyPrice());
        return energyTableMapper.insertSelective(energyTable);
    }

    /*
     * @author  zhangH
     * @Description  修改未支付用户的账单
     * @date 10:23 2021/7/22
     * @Param
     * @return
     **/
    public int updatepower(EnergyTable energyTable) {
        energyTable.setEnergyTime(DateUtil.getDate(new Date()));
        energyTable.setEnergyState("未支付");
        energyTable.setEnergyRealmoney(energyTable.getEnergyPrice());
        return energyTableMapper.updateByPrimaryKeySelective(energyTable);
    }

    /*
     * @author  zhangH
     * @Description  删除未支付的订单
     * @date 7:23 2021/7/23
     * @Param []
     * @return
     **/
    public int deletepower(Integer id) {
        return energyTableMapper.deleteByPrimaryKey(id);
    }

    /*
     * @author  zhangH
     * @Description  充值活动查询
     * @date 15:33 2021/7/22
     * @Param
     * @return
     **/
    public GiftTable selectGift() {
        return giftTableMapper.selectByPrimaryKey(10001);
    }

    /*
     * @author  zhangH
     * @Description  充值活动修改
     * @date 15:33 2021/7/22
     * @Param
     * @return
     **/
    public int updateGifts(GiftTable giftTable) {
        giftTable.setGiftId(10001);
        return giftTableMapper.updateByPrimaryKeySelective(giftTable);
    }

    /*
     * @author  zhangH
     * @Description  公告查询
     * @date 15:33 2021/7/22
     * @Param
     * @return
     **/
    public List<NoticeTable> selectNotice() {
        return noticeTableMapper.selectByExample(null);
    }

    /*
     * @author  zhangH
     * @Description  查询未支付的指定用户账单
     * @date 7:03 2021/7/23
     * @Param
     * @return
     **/
    public EnergyTable selectopwer(Integer id) {
        return energyTableMapper.selectByPrimaryKey(id);
    }

    /*
     * @author  zhangH
     * @Description  根据id查询公告
     * @date 9:42 2021/7/23
     * @Param []
     * @return
     **/
    public NoticeTable selectnoticeId(Integer id) {
        return noticeTableMapper.selectByPrimaryKey(id);
    }

    /*
     * @author  zhangH
     * @Description  添加公告
     * @date 10:13 2021/7/23
     * @Param [noticeTable]
     * @return
     **/
    public int insertontice(NoticeTable noticeTable) {
        noticeTable.setNoticeTime(DateUtil.getDate(new Date()));
        return noticeTableMapper.insertSelective(noticeTable);

    }

    /*
     * @author  zhangH
     * @Description  修改公告
     * @date 9:42 2021/7/23
     * @Param []
     * @return
     **/
    public int updatenotice(NoticeTable noticeTable) {
        noticeTable.setNoticeTime(DateUtil.getDate(new Date()));
        return noticeTableMapper.updateByPrimaryKeySelective(noticeTable);
    }

    /*
     * @author  zhangH
     * @Description  删除公告
     * @date 9:42 2021/7/23
     * @Param []
     * @return
     **/
    public int deletenotice(Integer id) {
        return noticeTableMapper.deleteByPrimaryKey(id);
    }

    /*
     * @author  zhangH
     * @Description  计算总价
     * @date 9:17 2021/7/23
     * @Param
     * @return
     **/
    public int selectcountpay() {
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(null);
        int countpay = 0;
        for (int i = 0; i < userTable1s.size(); i++) {
            countpay += userTable1s.get(i).getUserCount();
        }
        return countpay;
    }

    /*
     * @author  zhangH
     * @Description  为用户分配房间
     * @date 9:01 2021/7/22
     * @Param [userTable1]
     * @return
     **/
    public int updateInformation(UserTable1 userTable1) {

        HouseTableExample houseTableExample = new HouseTableExample();
        houseTableExample.createCriteria().andUserNameEqualTo(userTable1.getUserName());
        List<HouseTable> houseTables = houseTableMapper.selectByExample(houseTableExample);

        if (houseTables.size() == 0) {
            HouseTable houseTable = new HouseTable();
            houseTable.setUserName(userTable1.getUserName());
            houseTable.setStaticName("入住中");
            houseTable.setRoomId(userTable1.getUserRoom());
            houseTable.setUnitId(userTable1.getUserUnit());
            houseTable.setUserIntime(DateUtil.getDate(new Date()));
            houseTableMapper.insertSelective(houseTable);
        } else {
            HouseTable houseTable = houseTables.get(0);
            houseTable.setUserName(userTable1.getUserName());
            houseTable.setStaticName("入住中");
            houseTable.setRoomId(userTable1.getUserRoom());
            houseTable.setUnitId(userTable1.getUserUnit());
            houseTable.setUserIntime(DateUtil.getDate(new Date()));
            houseTableMapper.updateByPrimaryKeySelective(houseTable);
        }
        userTable1.setUserState("入住中");
        userTable1.setUserUnit(userTable1.getUserUnit());
        userTable1.setUserRoom(userTable1.getUserRoom());
        userTable1.setUserIntime(DateUtil.getDate(new Date()));
        userTable1.setUserBalance(0);
        return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
    }

    /*
     * @author  zhangH
     * @Description  拒绝用户的住房申请
     * @date 14:35 2021/7/24
     * @Param
     * @return
     **/
    public int refuseuserapply(String name) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(name);
        List<UserTable1> userTable1List = userTable1Mapper.selectByExample(userTable1Example);
        UserTable1 userTable1 = userTable1List.get(0);
        userTable1.setUserState("拒绝");
        userTable1.setUserUnit(null);
        userTable1.setUserRoom(null);
        userTable1.setUserBuilding(null);
        return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
    }

    /*
     * @author  zhangH
     * @Description  用户信息删除
     * @date 9:01 2021/7/22
     * @Param [userTable1]
     * @return
     **/
    public int deleteInformation(Integer id) {

        return userTable1Mapper.deleteByPrimaryKey(id);
    }
    //添加餐品
    public int insertfood(FoodTable foodTable){
        return foodTableMapper.insertSelective(foodTable);
    }
}
