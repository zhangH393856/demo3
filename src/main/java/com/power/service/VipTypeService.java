package com.power.service;

import com.power.mapper.ViptypeTableMapper;
import com.power.pojo.ViptypeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: VipTypeService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 11:33 2021/8/24
 * @Version 1.0
 **/
@Service
public class VipTypeService {
    @Autowired
    ViptypeTableMapper viptypeTableMapper;
    /*
     * @author  zhangH
     * @Description  会员卡优惠查询
     * @date 15:33 2021/7/22
     * @Param
     * @return
     **/
    public ViptypeTable selectVip() {
        return viptypeTableMapper.selectByPrimaryKey(10001);
    }

    /*
     * @author  zhangH
     * @Description  会员卡优惠修改
     * @date 15:33 2021/7/22
     * @Param
     * @return
     **/
    public int updateVip(ViptypeTable viptypeTable) {
        viptypeTable.setViptypeId(10001);
        return viptypeTableMapper.updateByPrimaryKeySelective(viptypeTable);
    }
    //会员卡价格
    public List<Double> selectVipMoney(String vipCardName){
        ViptypeTable viptypeTable = viptypeTableMapper.selectByPrimaryKey(10001);
        List<Double> vipCardmoney=new ArrayList<>();
        if ("黄金卡".equals(vipCardName)){
            vipCardmoney.add(Double.valueOf(viptypeTable.getViptype1Price()));
        }
        else if ("铂金卡".equals(vipCardName)){
            vipCardmoney.add(Double.valueOf(viptypeTable.getViptype2Price()));
        }
        else if ("钻石卡".equals(vipCardName)){
            vipCardmoney.add(Double.valueOf(viptypeTable.getViptype3Price()));
        }
        else if ("黑金尊享".equals(vipCardName)){
            vipCardmoney.add(Double.valueOf(viptypeTable.getViptype4Price()));
        }
        return vipCardmoney;
    }

}
