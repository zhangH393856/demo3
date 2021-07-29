package com.power.util;

import com.power.mapper.OrderfoodTableMapper;
import com.power.pojo.OrderfoodTable;
import com.power.pojo.OrderfoodTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: lenovo
 * @Date: 19:20 2021/8/24
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        List<OrderfoodTable> orderfoodTables=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            OrderfoodTable orderfoodTable=new OrderfoodTable();
            orderfoodTable.setOrderUsername("张三");
            orderfoodTables.add(orderfoodTable);
        }
        for (int i = 0; i < 5; i++) {
            OrderfoodTable orderfoodTable=new OrderfoodTable();
            orderfoodTable.setOrderUsername("李四");
            orderfoodTables.add(orderfoodTable);
        }
        for (int i = 0; i < 10; i++) {
            OrderfoodTable orderfoodTable=new OrderfoodTable();
            orderfoodTable.setOrderUsername("王五");
            orderfoodTables.add(orderfoodTable);
        }


    }
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
