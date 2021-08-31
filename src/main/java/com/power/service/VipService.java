package com.power.service;

import com.power.mapper.UserTable1Mapper;
import com.power.mapper.VipsTableMapper;
import com.power.mapper.ViptypeTableMapper;
import com.power.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: VipService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 8:48 2021/8/24
 * @Version 1.0
 **/
@Service
public class VipService {
    @Autowired
    VipsTableMapper vipsTableMapper;
    @Autowired
    UserTable1Mapper userTable1Mapper;
    @Autowired
    ViptypeTableMapper viptypeTableMapper;

    //查询会员用户
    public List<VipsTable> selectVips() {
        return vipsTableMapper.selectByExample(null);
    }
   //根据姓名查询会员用户
   public List<VipsTable> selectVipsname(String name) {
        VipsTableExample vipsTableExample=new VipsTableExample();
        vipsTableExample.createCriteria().andVipUsernameEqualTo(name);
       return vipsTableMapper.selectByExample(vipsTableExample);
   }
    //添加会员用户
    public int insertVipUser(String name,Integer money) {

        VipsTable vipsTable;
        UserTable1Example userTable1Example=new UserTable1Example();
        userTable1Example.createCriteria().andUserNameEqualTo(name);
        List<UserTable1> userTable1s = userTable1Mapper.selectByExample(userTable1Example);
        ViptypeTable viptypeTable = viptypeTableMapper.selectByPrimaryKey(10001);
        VipsTableExample vipsTableExample=new VipsTableExample();
        vipsTableExample.createCriteria().andVipUsernameEqualTo(name);
        List<VipsTable> vipsTables = vipsTableMapper.selectByExample(vipsTableExample);
        if (vipsTables.size()>0){
           vipsTable=vipsTables.get(0);
            if (money.equals(viptypeTable.getViptype1Price())){
                vipsTable.setVipState(1);
            }else if (money.equals(viptypeTable.getViptype2Price())){
                vipsTable.setVipState(2);
            }else if (money.equals(viptypeTable.getViptype3Price())){
                vipsTable.setVipState(3);
            }
            else if (money.equals(viptypeTable.getViptype4Price())){
                vipsTable.setVipState(4);
            }else{
                vipsTable.setVipState(null);
            }
            UserTable1 userTable1=userTable1s.get(0);
            vipsTable.setVipUsername(userTable1.getUserName());
            vipsTable.setVipPhone(userTable1.getUserPhone());
            vipsTable.setVipStarttimestring(DateUtil.getDate(new Date()));
            vipsTable.setVipStarttime(new Date());
            vipsTableMapper.updateByPrimaryKey(vipsTable);
        }
        else{
            vipsTable=new VipsTable();
            if (money.equals(viptypeTable.getViptype1Price())){
                vipsTable.setVipState(1);
            }else if (money.equals(viptypeTable.getViptype2Price())){
                vipsTable.setVipState(2);
            }else if (money.equals(viptypeTable.getViptype3Price())){
                vipsTable.setVipState(3);
            }
            else if (money.equals(viptypeTable.getViptype4Price())){
                vipsTable.setVipState(4);
            }else{
                vipsTable.setVipState(null);
            }
            UserTable1 userTable1=userTable1s.get(0);
            vipsTable.setVipUsername(userTable1.getUserName());
            vipsTable.setVipPhone(userTable1.getUserPhone());
            vipsTable.setVipStarttimestring(DateUtil.getDate(new Date()));
            vipsTable.setVipStarttime(new Date());
            vipsTableMapper.updateByPrimaryKey(vipsTable);
            vipsTableMapper.insertSelective(vipsTable);
        }
        return 1;
    }

}
