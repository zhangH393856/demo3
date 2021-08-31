package com.power.service;

import com.power.mapper.*;
import com.power.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 14:49 2021/7/21
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    UserTable1Mapper userTable1Mapper;
    @Autowired
    EnergyTableMapper energyTableMapper;
    @Autowired
    RechargeTableMapper rechargeTableMapper;
    @Autowired
    GiftTableMapper giftTableMapper;
    @Autowired
    HouseTableMapper houseTableMapper;
    @Autowired
    VipsTableMapper vipsTableMapper;
    @Autowired
    ViptypeTableMapper viptypeTableMapper;

    int i = 1;

    public List<UserTable1> login(UserTable1 userTable1) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserName()).andUserPwdEqualTo(userTable1.getUserPwd());
        return userTable1Mapper.selectByExample(userTable1Example);
    }

    //查询用户信息
    public List<UserTable1> select() {
        return userTable1Mapper.selectByExample(null);
    }

    //根据姓名模糊查询
    public List<UserTable1> selectName(UserTable1 userTable1) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameLike("%" + userTable1.getUserName() + "%");
        return userTable1Mapper.selectByExample(userTable1Example);
    }

    //根据指定姓名查询
    public UserTable1 selectNames(String name) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(name);
        return userTable1Mapper.selectByExample(userTable1Example).get(0);
    }

    //待入住用户
    public List<UserTable1> selectState() {
        UserTable1 userTable1 = new UserTable1();
        userTable1.setUserState("待入住");
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserStateEqualTo(userTable1.getUserState());
        return userTable1Mapper.selectByExample(userTable1Example);
    }

    public List<UserTable1> selectBuilding(UserTable1 userTable1) {
        UserTable1Example userTable1Example = new UserTable1Example();
        if (userTable1.getUserBuilding() != null) {
            userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserBuilding());
            return userTable1Mapper.selectByExample(userTable1Example);
        } else {
            return userTable1Mapper.selectByExample(null);
        }
    }

    /*
     * @author  zhangH
     * @Description  用户注册时查询用户是否已存在
     * @date 8:57 2021/7/22
     * @Param []
     * @return
     **/
    public int selectregister(UserTable1 userTable1) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserName());
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        if (userTable1s.size() > 0) {
            return 0;
        } else {
            return 1;
        }

    }

    /*
     * @author  zhangH
     * @Description  用户注册
     * @date 9:01 2021/7/22
     * @Param [userTable1]
     * @return
     **/
    public int register(UserTable1 userTable1) {
        return userTable1Mapper.insertSelective(userTable1);
    }


    /*
     * @author  zhangH
     * @Description  用户个人信息修改
     * @date 11:43 2021/7/22
     * @Param
     * @return
     **/
    public int updateInformations(UserTable1 userTable1) {
        return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
    }

    /*
     * @author  zhangH
     * @Description  用户查询个人消费详单
     * @date 11:43 2021/7/22
     * @Param
     * @return
     **/
    public List<EnergyTable> userselectInfo(EnergyTable energyTable) {
        EnergyTableExample energyTableExample = new EnergyTableExample();
        if (energyTable.getEnergyState() == null) {
            energyTableExample.createCriteria().andEnergyIdEqualTo(energyTable.getEnergyId());
            return energyTableMapper.selectByExample(energyTableExample);
        } else {
            energyTableExample.createCriteria().andEnergyIdEqualTo(energyTable.getEnergyId()).andEnergyStateEqualTo(energyTable.getEnergyState());
            return energyTableMapper.selectByExample(energyTableExample);
        }

    }

    /*
     * @author  zhangH
     * @Description  用户充值
     * @date 17:17 2021/7/22
     * @Param
     * @return
     **/
    public int updatemoney(UserTable1 userTable1, Integer userBalance) {

        UserTable1Example userTable1Example = new UserTable1Example();
        //获取用户信息
        userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserName());
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        //获取活动信息
        GiftTable giftTable = giftTableMapper.selectByPrimaryKey(10001);
        if (userTable1.getUserBalance() >= 200 && userTable1.getUserBalance() < 500) {
            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance() + giftTable.getGift200());
        } else if (userTable1.getUserBalance() >= 500 && userTable1.getUserBalance() < 800) {
            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance() + giftTable.getGift500());

        } else if (userTable1.getUserBalance() >= 800 && userTable1.getUserBalance() < 1000) {
            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance() + giftTable.getGift800());
        } else if (userTable1.getUserBalance() >= 1000 && userTable1.getUserBalance() < 1500) {

            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance() + giftTable.getGift1000());

        } else if (userTable1.getUserBalance() >= 1500 && userTable1.getUserBalance() < 2000) {
            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance() + giftTable.getGift1500());
        } else if (userTable1.getUserBalance() >= 2000) {
            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance() + giftTable.getGift2000());

        } else {
            userTable1.setUserBalance(userTable1.getUserBalance() + userTable1s.get(0).getUserBalance());

        }
        userTable1.setUserCount(userBalance + userTable1s.get(0).getUserCount());
        return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
    }

    /*
     * @author  zhangH
     * @Description  缴费记录
     * @date 18:51 2021/7/22
     * @Param
     * @return
     **/
    public int indertRecharge(String userName, Integer userBalance) {
        RechargeTable rechargeTable = new RechargeTable();
        rechargeTable.setRechargeUsername(userName);
        rechargeTable.setRechargeCount(userBalance);
        rechargeTable.setRechargeTime(DateUtil.getDate(new Date()));
        return rechargeTableMapper.insertSelective(rechargeTable);
    }

    /*
     * @author  zhangH
     * @Description  缴费记录查询
     * @date 19:05 2021/7/22
     * @Param
     * @return
     **/
    public List<RechargeTable> selectRecharge(RechargeTable rechargeTable) {
        RechargeTableExample rechargeTableExample = new RechargeTableExample();
        rechargeTableExample.createCriteria().andRechargeUsernameEqualTo(rechargeTable.getRechargeUsername());
        return rechargeTableMapper.selectByExample(rechargeTableExample);
    }

    /*
     * @author  zhangH
     * @Description  删除缴费记录
     * @date 19:05 2021/7/22
     * @Param
     * @return
     **/
    public int deleteRecharge(RechargeTable rechargeTable) {

        return rechargeTableMapper.deleteByPrimaryKey(rechargeTable.getId());
    }

    /*
     * @author  zhangH
     * @Description  缴费
     * @date 22:23 2021/7/22
     * @Param
     * @return
     **/
    public int updatepay(EnergyTable energyTable, Integer paymoney, UserTable1 userTable1) {
        EnergyTableExample energyTableExample = new EnergyTableExample();
        energyTableExample.createCriteria().andEnergyIdEqualTo(energyTable.getEnergyId());
        UserTable1Example userTable1Example = new UserTable1Example();
        //获取该用户的余额
        userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserName());
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        VipsTableExample vipsTableExample = new VipsTableExample();
        ViptypeTable viptypeTable = viptypeTableMapper.selectByPrimaryKey(10001);
        if (userTable1s.get(0).getUserBalance() >= paymoney) {
            int paymonay=10;
            vipsTableExample.createCriteria().andVipUsernameEqualTo(userTable1.getUserName());
            List<VipsTable> vipsTables = vipsTableMapper.selectByExample(vipsTableExample);
            if (vipsTables.size() > 0&&vipsTables.get(0).getVipState()!=null) {
                VipsTable vipsTable = vipsTables.get(0);
                if (vipsTable.getVipState()==1){
                    paymonay=viptypeTable.getDiscount1();
                }else  if (vipsTable.getVipState()==1){
                    paymonay=viptypeTable.getDiscount2();
                }
                else  if (vipsTable.getVipState()==3){
                    paymonay=viptypeTable.getDiscount3();
                }
                else  if (vipsTable.getVipState()==4){
                    paymonay=viptypeTable.getDiscount4();
                }
            }
            //扣费
            userTable1.setUserBalance(userTable1s.get(0).getUserBalance() - paymoney*paymonay/10);
            userTable1.setUserId(userTable1s.get(0).getUserId());
            energyTable.setEnergyState("已支付");
            userTable1Mapper.updateByPrimaryKeySelective(userTable1);
            return energyTableMapper.updateByPrimaryKeySelective(energyTable);
        } else {
            return 0;
        }
    }

    public int updatepay1(Double paymoney, UserTable1 userTable1) {
        UserTable1Example userTable1Example = new UserTable1Example();
        //获取该用户的余额
        userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserName());
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        VipsTableExample vipsTableExample = new VipsTableExample();
        ViptypeTable viptypeTable = viptypeTableMapper.selectByPrimaryKey(10001);
        if (userTable1s.get(0).getUserBalance() >= paymoney) {
            Integer paymonay=10;
            vipsTableExample.createCriteria().andVipUsernameEqualTo(userTable1.getUserName());
            List<VipsTable> vipsTables = vipsTableMapper.selectByExample(vipsTableExample);
            if (vipsTables.size() > 0&&vipsTables.get(0).getVipState()!=null) {
                VipsTable vipsTable = vipsTables.get(0);
                if (vipsTable.getVipState()==1){
                    paymonay=viptypeTable.getDiscount1();
                }else  if (vipsTable.getVipState()==2){
                    paymonay=viptypeTable.getDiscount2();
                }
                else  if (vipsTable.getVipState()==3){
                    paymonay=viptypeTable.getDiscount3();
                }
                else  if (vipsTable.getVipState()==4){
                    paymonay=viptypeTable.getDiscount4();
                }
            }
            //扣费
            userTable1.setUserBalance((int) (userTable1s.get(0).getUserBalance() - paymoney*paymonay/10));
            userTable1.setUserId(userTable1s.get(0).getUserId());
            return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
        } else {
            return 0;
        }
    }
    public int updatepays(Double paymoney, UserTable1 userTable1) {
        UserTable1Example userTable1Example = new UserTable1Example();
        //获取该用户的余额
        userTable1Example.createCriteria().andUserNameEqualTo(userTable1.getUserName());
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        if (userTable1s.get(0).getUserBalance() >= paymoney) {
            //扣费
            userTable1.setUserBalance((int) (userTable1s.get(0).getUserBalance() - paymoney));
            userTable1.setUserId(userTable1s.get(0).getUserId());
            return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
        } else {
            return 0;
        }
    }
    //会员扣费
    public Double updatepaymoney(String name, Integer paymoney) {
        UserTable1Example userTable1Example = new UserTable1Example();
        //获取该用户的余额
        userTable1Example.createCriteria().andUserNameEqualTo(name);
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        VipsTableExample vipsTableExample = new VipsTableExample();
        ViptypeTable viptypeTable = viptypeTableMapper.selectByPrimaryKey(10001);
        double number=0;
        if (userTable1s.get(0).getUserBalance() >= paymoney) {
            double paymonay = 10;

            vipsTableExample.createCriteria().andVipUsernameEqualTo(name);
            List<VipsTable> vipsTables = vipsTableMapper.selectByExample(vipsTableExample);

            if (vipsTables.size() > 0&&vipsTables.get(0).getVipState()!=null) {
                VipsTable vipsTable = vipsTables.get(0);
                if (vipsTable.getVipState() == 1) {
                    paymonay = viptypeTable.getDiscount1();
                } else if (vipsTable.getVipState() == 2) {
                    paymonay = viptypeTable.getDiscount2();
                } else if (vipsTable.getVipState() == 3) {
                    paymonay = viptypeTable.getDiscount3();
                } else if (vipsTable.getVipState() == 4) {
                    paymonay = viptypeTable.getDiscount4();
                }
            }else {
                paymonay=10;
            }
           number= paymoney*paymonay/10;

        }
        return number;
    }

    /*
     * @author  zhangH
     * @Description  缴费查询
     * @date 22:23 2021/7/22
     * @Param
     * @return
     **/
    public EnergyTable selectpay(EnergyTable energyTable) {
        return energyTableMapper.selectByPrimaryKey(energyTable.getEnergyId());
    }

    /*
     * @author  zhangH
     * @Description  申请入住
     * @date 13:46 2021/7/24
     * @Param
     * @return
     **/
    public int applyhouse(String name) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(name);
        List<UserTable1> userTable1List = userTable1Mapper.selectByExample(userTable1Example);
        UserTable1 userTable1 = userTable1List.get(0);
        if ("入住中".equals(userTable1.getUserState())) {
            return 0;
        } else {
            userTable1.setUserState("待入住");
            return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
        }


    }

    /*
     * @author  zhangH
     * @Description  退房
     * @date 13:46 2021/7/24
     * @Param
     * @return
     **/
    public int leavehouse(String name) {
        UserTable1Example userTable1Example = new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(name);
        List<UserTable1> userTable1List = userTable1Mapper.selectByExample(userTable1Example);
        HouseTableExample houseTableExample = new HouseTableExample();
        houseTableExample.createCriteria().andUserNameEqualTo(name);
        List<HouseTable> houseTables = houseTableMapper.selectByExample(houseTableExample);
        if (houseTables.size()>0){
            HouseTable houseTable = houseTables.get(0);
            UserTable1 userTable1 = userTable1List.get(0);
            if (!"已退房".equals(houseTable.getStaticName())) {
                userTable1.setUserState("已退房");
                userTable1.setUserUnit(" ");
                userTable1.setUserRoom(" ");
                userTable1.setUserBuilding(" ");
                userTable1.setUserOuttime(DateUtil.getDate(new Date()));
                houseTable.setUserOuttime(DateUtil.getDate(new Date()));
//            Integer intime=houseTable.getUserIntime().getTime();
//            Integer outtime=houseTable.getUserOuttime().getTime();
                houseTable.setStaticName("已退房");
                houseTableMapper.updateByPrimaryKeySelective(houseTable);
                return userTable1Mapper.updateByPrimaryKeySelective(userTable1);
        }
            else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
