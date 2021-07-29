package com.power.controller;

import com.power.pojo.*;
import com.power.service.AdminService;
import com.power.service.FoodService;
import com.power.service.UserService;
import com.power.service.VipTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: lenovo
 * @Date: 14:48 2021/7/21
 * @Version 1.0
 **/
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;
    @Autowired
    FoodService foodService;
    @Autowired
    VipTypeService vipTypeService;

    //查询个人信息
    @RequestMapping("userselectInfo")
    public String userselectInfo(EnergyTable energyTable, Model model) {
        List<EnergyTable> energyTables = userService.userselectInfo(energyTable);
        if ("已支付".equals(energyTable.getEnergyState())) {
            model.addAttribute("list", energyTables);
            return "payment";
        } else if ("未支付".equals(energyTable.getEnergyState())) {
            model.addAttribute("list", energyTables);
            return "nopayment";
        } else {
            model.addAttribute("list", energyTables);
            return "paymentlist";
        }
    }

    //用户充值提示页面
    @RequestMapping("updatemoney")
    public String updatemoney(UserTable1 userTable1, String userName, Integer userBalance) {
        userService.updatemoney(userTable1, userBalance);
        userService.indertRecharge(userName, userBalance);
        return "success";
    }

    //用户充值
    @RequestMapping("openupdatemoney")
    public String openupdatemoney(UserTable1 userTable1, Model model, Integer money) {
        List<UserTable1> userTable1s = userService.selectName(userTable1);

        model.addAttribute("list", userTable1s);
        if (money == null) {
            return "updatemoney1";
        } else {
            model.addAttribute("money", money);
            return "money";
        }

    }

    //查询帐户余额
    @RequestMapping("Blance")
    public String Blance(UserTable1 userTable1, Model model) {
        List<UserTable1> userTable1s = userService.selectName(userTable1);
        model.addAttribute("list", userTable1s);
        return "Blance";
    }

    //缴费记录
    @RequestMapping("selectRecharge")
    public String selectRecharge(RechargeTable rechargeTable, Model model) {
        List<RechargeTable> rechargeTables = userService.selectRecharge(rechargeTable);
        model.addAttribute("list", rechargeTables);
        return "selectRecharge";
    }

    //删除缴费记录
    @RequestMapping("deleteRecharge")
    public String deleteRecharge(RechargeTable rechargeTable, Model model) {
        List<RechargeTable> rechargeTables = userService.selectRecharge(rechargeTable);
        model.addAttribute("list", rechargeTables);
        userService.deleteRecharge(rechargeTable);
        return "selectRecharge";
    }

    //缴费查询
    @RequestMapping("selectpay")
    public String selectpays(EnergyTable energyTable, Model model) {
        EnergyTable selectpay = userService.selectpay(energyTable);
        model.addAttribute("list", selectpay);
        return "pay";
    }

    @RequestMapping("openuser1")
//用户页面
    public String openUser(Model model) {
        List<NoticeTable> noticeTables = adminService.selectNotice();
        GiftTable giftTable1 = adminService.selectGift();
        model.addAttribute("action", giftTable1);
        model.addAttribute("noticelist", noticeTables);
        return "user";
    }

    //缴费
    @RequestMapping("updatepay")
    public String updatepay(EnergyTable energyTable, Model model, Integer paymoney, UserTable1 userTable1) {
        int updatepay = userService.updatepay(energyTable, paymoney, userTable1);
        if (updatepay > 0) {
            return "redirect:/openuser1";
        } else {
            model.addAttribute("msg", "帐户余额不足，请充值后再缴费");
            return "payinfo";
        }
    }
//会员扣费
@RequestMapping("updatepayvip")
public String updatepayvip(EnergyTable energyTable, Model model, Integer paymoney, UserTable1 userTable1) {
    int updatepay = userService.updatepay(energyTable, paymoney, userTable1);
    if (updatepay > 0) {
        return "redirect:/openuser1";
    } else {
        model.addAttribute("msg", "帐户余额不足，请充值后再缴费");
        return "payinfo";
    }
}
    //申请入住
    @RequestMapping("applyhouse")
    public String applyhouse(String name, Model model) {
        UserTable1 userTable1 = new UserTable1();
        userTable1.setUserName(name);
        int applyhouse = userService.applyhouse(name);
        if (applyhouse == 0) {
            List<UserTable1> userTable1s = userService.selectName(userTable1);
            model.addAttribute("msg", "已经在" + userTable1s.get(0).getUserIntime() + "为您准备好房间，您的房间在" + userTable1s.get(0).getUserBuilding() + "," + userTable1s.get(0).getUserUnit() + "," + userTable1s.get(0).getUserRoom() + "。");
            return "payinfo";
        } else {
            model.addAttribute("msg", "申请成功，请等待管理员审核");
            return "payinfo";
        }
    }

    //退房
    @RequestMapping("leavehouse")
    public String leavehouse(String name, Model model) {
        int leavehouse = userService.leavehouse(name);
        if (leavehouse == 0) {
            model.addAttribute("msg", "您还没有办理住房,请返回主页办理");
            return "payinfo";
        } else {
            model.addAttribute("msg", "退房成功,祝您身体健康，工作顺利，欢迎下次光临");
            return "payinfo";
        }

    }
    @RequestMapping("insertOrderFood")
    @ResponseBody
    //点餐（增加份数）
    public Model insertOrderFood(HttpSession session,OrderfoodTable orderfoodTable,Model model){
        foodService.insertOrderFood((String) session.getAttribute("name"),orderfoodTable);
      return   model.addAttribute("msg","1");
    }
    @RequestMapping("deleteOrderFood")
    @ResponseBody
    //取消点餐（减少份数）
    public Model deleteOrderFood(HttpSession session,OrderfoodTable orderfoodTable,Model model){
        foodService.deleteOrderFood((String) session.getAttribute("name"),orderfoodTable);
        return   model.addAttribute("msg","1");
    }
    @RequestMapping("openselectvip")
    public String selectvip(){
        return "selectvip";
    }
    //查询早餐购物车
    @RequestMapping("openselectfood1")
    public String openselectfood1(HttpSession session,Model model){
        List<OrderfoodTable> name = foodService.selectOrder((String) session.getAttribute("name"));
        Double countcost= foodService.countAll((String) session.getAttribute("name"));
        model.addAttribute("orderlist",name);
        model.addAttribute("countcost",countcost);
        return "selectfood1";
    }
    //结算
    @RequestMapping("openfoodpay")
    public String openfoodpay(HttpSession session,Model model){
        Double countcost= foodService.countAll((String) session.getAttribute("name"));
        model.addAttribute("countcost",countcost);
        return "foodpay";
    }
    //结算
    @RequestMapping("updatepay1")
    public String updatepay1( Model model, Double paymoney, UserTable1 userTable1,HttpSession session) {
        userTable1.setUserName((String) session.getAttribute("name"));
        int updatepay = userService.updatepay1(paymoney, userTable1);
        if (updatepay > 0) {
            foodService.foodstate((String) session.getAttribute("name"));
            return "redirect:/openuser1";
        } else {
            model.addAttribute("msg", "帐户余额不足，请充值后再缴费");
            return "payinfo";
        }
    }
//已上餐
    @RequestMapping("yesfood")
    public String  yesfood(String name,Model model){
        List<OrderfoodTable> orderfoodTables = foodService.selectOrder1(name);
        model.addAttribute("foodlist",orderfoodTables);
        return "selectfood2";
    }
    //未上餐
    @RequestMapping("nofood")
    public String  nofood(String name,Model model){
        List<OrderfoodTable> orderfoodTables = foodService.selectOrders(name);
        model.addAttribute("foodlist",orderfoodTables);
        return "selectfood2";
    }
    //会员缴费
    @RequestMapping("updatevip")
    public String updatevip( Model model, Double paymoney, UserTable1 userTable1,HttpSession session) {
        userTable1.setUserName((String) session.getAttribute("name"));
        int updatepay = userService.updatepay1(paymoney, userTable1);
        if (updatepay > 0) {
            foodService.foodstate((String) session.getAttribute("name"));
            return "redirect:/openuser1";
        } else {
            model.addAttribute("msg", "帐户余额不足，请充值后再缴费");
            return "payinfo";
        }
    }
    //会员缴费单
    @RequestMapping("selectCardMoney")
    public String   selectCardMoney(String name,Model model){
        List<Double> doubles = vipTypeService.selectVipMoney(name);
        model.addAttribute("countcost",doubles.get(0).doubleValue());
        return "foodpay";
    }
}
