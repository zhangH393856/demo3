package com.power.service;

import com.power.mapper.VipsTableMapper;
import com.power.mapper.ViptypeTableMapper;
import com.power.pojo.VipsTable;
import com.power.pojo.ViptypeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    //查询会员用户
    public List<VipsTable> selectVips(){
        return vipsTableMapper.selectByExample(null);
    }

}
