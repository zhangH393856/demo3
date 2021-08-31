package com.power.service;

import com.power.mapper.FoodTableMapper;
import com.power.mapper.OrderfoodTableMapper;
import com.power.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: FoodService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 11:45 2021/8/23
 * @Version 1.0
 **/
@Service
public class FoodService {
    @Autowired
    FoodTableMapper foodTableMapper;
    @Autowired
    OrderfoodTableMapper orderfoodTableMapper;

    //查询
    public List<FoodTable> selectFood() {
        return foodTableMapper.selectByExample(null);
    }

    //添加餐品
    public int insertFood(FoodTable foodTable) {
        return foodTableMapper.insertSelective(foodTable);
    }

    //修改餐品
    public int updateFood(FoodTable foodTable) {
        return foodTableMapper.updateByPrimaryKeySelective(foodTable);
    }

    //删除餐品
    public int deleteFood(Integer id) {
        return foodTableMapper.deleteByPrimaryKey(id);
    }

    //预定餐品
    public int insertOrderFood(String name, OrderfoodTable orderfoodTable) {
        OrderfoodTableExample orderfoodTableExample = new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name).andOrderFoodnameEqualTo(orderfoodTable.getOrderFoodname()).andOrderStateEqualTo(0).andOrderAdminstateEqualTo(0);
        List<OrderfoodTable> orderfoodTables = orderfoodTableMapper.selectByExample(orderfoodTableExample);
        if (orderfoodTables.size() > 0) {
          OrderfoodTable orderfoodTable1 = orderfoodTables.get(0);
            orderfoodTable1.setOrderStarttime(DateUtil.getDate(new Date()));
           orderfoodTable1.setOrderFoodcount(orderfoodTable.getOrderFoodcount());
            orderfoodTable1.setOrderFoodprice(orderfoodTable.getOrderFoodcount() * orderfoodTable.getOrderOneprice());
            return orderfoodTableMapper.updateByPrimaryKey(orderfoodTable1);
        } else {
            orderfoodTable.setOrderUsername(name);
            orderfoodTable.setOrderStarttime(DateUtil.getDate(new Date()));
            orderfoodTable.setOrderFoodprice(orderfoodTable.getOrderFoodcount() * orderfoodTable.getOrderOneprice());
            return orderfoodTableMapper.insertSelective(orderfoodTable);
        }

    }

    //取消预订
    public int deleteOrderFood(String name, OrderfoodTable orderfoodTable) {
        OrderfoodTableExample orderfoodTableExample = new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name).andOrderFoodnameEqualTo(orderfoodTable.getOrderFoodname()).andOrderStateEqualTo(0).andOrderAdminstateEqualTo(0);
        List<OrderfoodTable> orderfoodTables = orderfoodTableMapper.selectByExample(orderfoodTableExample);

        if (orderfoodTables.size() > 0) {
          OrderfoodTable  orderfoodTable1 = orderfoodTables.get(0);
            if (orderfoodTable.getOrderFoodcount() > 0) {

                orderfoodTable1.setOrderFoodcount(orderfoodTable.getOrderFoodcount());
                orderfoodTable1.setOrderFoodprice(orderfoodTable.getOrderFoodcount() * orderfoodTable.getOrderOneprice());
                return orderfoodTableMapper.updateByPrimaryKey(orderfoodTable1);
            } else {
                orderfoodTable.setOrderUsername(name);
                return orderfoodTableMapper.deleteByExample(orderfoodTableExample);
            }
        } else {
            return -1;
        }


    }
    //计算早餐购物车总价
    public Double countAll(String name){
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name).andOrderStateEqualTo(0);
        Double number=0.0;
        List<OrderfoodTable> orderfoodTables = orderfoodTableMapper.selectByExample(orderfoodTableExample);
        for (OrderfoodTable orderfoodTable:orderfoodTables) {
          number+= orderfoodTable.getOrderFoodprice();
        }
    return number;
    }
    //查看个人早餐购物车
    public  List<OrderfoodTable> selectOrder(String name){
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name).andOrderStateEqualTo(0);
        return orderfoodTableMapper.selectByExample(orderfoodTableExample);
    }
    public int foodstate(String name){
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name);
        List<OrderfoodTable> orderfoodTables = orderfoodTableMapper.selectByExample(orderfoodTableExample);
        if (orderfoodTables.size()>0){
            for (OrderfoodTable orderfoodTable:orderfoodTables) {
                orderfoodTable.setOrderState(1);
                orderfoodTableMapper.updateByPrimaryKey(orderfoodTable);
            }
        }
      return 1;
    }
    //查询订餐用户
    public List<String> selectorders(){
        List<String> names=new ArrayList<>();
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        //先查询出已支付未上餐的用户
        orderfoodTableExample.createCriteria().andOrderStateEqualTo(1).andOrderAdminstateEqualTo(0);
        List<OrderfoodTable> orderfoodTables = orderfoodTableMapper.selectByExample(orderfoodTableExample);
        for (OrderfoodTable orderfoodTable:orderfoodTables) {
            names.add(orderfoodTable.getOrderUsername());
        }
       return removeDuplicate_1((ArrayList) names);
    }
    //查看未上餐的个人早餐购物车
    public  List<OrderfoodTable> selectOrders(String name){
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name).andOrderStateEqualTo(1).andOrderAdminstateEqualTo(0);
        return orderfoodTableMapper.selectByExample(orderfoodTableExample);
    }
    //已上餐
    public  List<OrderfoodTable> selectOrder1(String name){
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderUsernameEqualTo(name).andOrderStateEqualTo(1).andOrderAdminstateEqualTo(1);
        return orderfoodTableMapper.selectByExample(orderfoodTableExample);
    }
    //上餐
    public int updateadminstate(OrderfoodTable orderfoodTable){
        OrderfoodTableExample orderfoodTableExample=new OrderfoodTableExample();
        orderfoodTableExample.createCriteria().andOrderIdEqualTo(orderfoodTable.getOrderId());
        List<OrderfoodTable> orderfoodTables = orderfoodTableMapper.selectByExample(orderfoodTableExample);
        OrderfoodTable orderfoodTable1=orderfoodTables.get(0);
        orderfoodTable1.setOrderAdminstate(1);
        orderfoodTable1.setOrderEndtime(DateUtil.getDate(new Date()));
       return orderfoodTableMapper.updateByPrimaryKey(orderfoodTable1);

    }

    //去重
    public static ArrayList removeDuplicate_1(ArrayList list){
        for(int i =0;i<list.size()-1;i++){
            for(int j=list.size()-1;j>i;j--){
                if(list.get(i).equals(list.get(j)))
                    list.remove(j);
            }
        }
        return list;
    }
}
