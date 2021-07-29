package com.power.controller;

import com.power.pojo.*;
import com.power.service.AdminService;
import com.power.service.RoomService;
import com.power.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: AdminController
 * @Description: TODO
 * @Author: lenovo
 * @Date: 14:48 2021/7/21
 * @Version 1.0
 **/
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    UserService userService;
    @Autowired
    RoomService roomService;

    @RequestMapping("login")
    //登录
    public void index1(HttpSession session, Model model,UserTable1 userTable1) {
//        List<NoticeTable> noticeTables = adminService.selectNotice();
//        Object name = session.getAttribute("name");
//         if ("admin".equals(name)) {
//            model.addAttribute("noticelist", noticeTables);
//            List<UserTable1> select = userService.selectState();
//            model.addAttribute("list", select);
//            return "index";
//        } else if ("boss".equals(name)) {
//            model.addAttribute("noticelist", noticeTables);
//            int selectcountpay = adminService.selectcountpay();
//            model.addAttribute("countpay", selectcountpay);
//            return "boss";
//        } else {
//            model.addAttribute("noticelist", noticeTables);
//            return "user";
//        }
        session.setAttribute("name",userTable1.getUserName());
    }


    //打开用户页面
    @RequestMapping("openuser")
    public String openUser(Model model) {
        List<NoticeTable> noticeTables = adminService.selectNotice();
        GiftTable giftTable1 = adminService.selectGift();
        model.addAttribute("action", giftTable1);
        model.addAttribute("noticelist", noticeTables);
        return "user";
    }

    //登录验证身份（管理员/用户/boss）
    @RequestMapping("loginuser")
    public String index(UserTable1 userTable1, Model model, HttpSession session) {
        session.setAttribute("name",userTable1.getUserName());
        String  name = (String) session.getAttribute("name");
        userTable1.setUserName(name);
        List<UserTable1> userlogin = userService.login(userTable1);
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(userTable1.getUserName()) && "admin".equals(userTable1.getUserPwd())) {
            model.addAttribute("noticelist", noticeTables);
            session.setAttribute("name", userTable1.getUserName());
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else if ("boss".equals(userTable1.getUserName()) && "boss".equals(userTable1.getUserPwd())) {
            session.setAttribute("name", userTable1.getUserName());
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            return "boss";
        } else if (userlogin.size() > 0) {
            session.setAttribute("name", userTable1.getUserName());
            GiftTable giftTable1 = adminService.selectGift();
            model.addAttribute("action", giftTable1);
            model.addAttribute("noticelist", noticeTables);
            return "user";
        } else {
            model.addAttribute("msg", "用户名或密码输入错误，请重新登录");
            return "login";
        }
    }

    //用户注册
    @RequestMapping("register")
    public String register(UserTable1 userTable1, Model model) {
        int selectregister = userService.selectregister(userTable1);
        if ("admin".equals(userTable1.getUserName())&&  "boss".equals(userTable1.getUserName())) {
            if (selectregister > 0) {
                userService.register(userTable1);
                return "login";
            } else {
                model.addAttribute("list", "该用户名已被使用请重新注册！！");
                return "register";
            }
        } else {
            model.addAttribute("list", "该用户名已被使用请重新注册！！");
            return "register";
        }
    }

    //打开注册页面
    @RequestMapping("openregister")
    public String open() {
        return "register";
    }

    //用户信息列表
    @RequestMapping("selectUser")
    public String select(Model model) {
        List<UserTable1> select = userService.select();
        model.addAttribute("list", select);
        return "table";
    }

    //根据用户名查询用户信息
    @RequestMapping("selectName")
    public String selectName(UserTable1 userTable1, Model model) {
        List<UserTable1> select = userService.selectName(userTable1);
        model.addAttribute("list", select);
        return "table";
    }

    //根据用户住房状态查询用户信息
    @RequestMapping("selectBuilding")
    public String selectBuilding(UserTable1 userTable1, Model model) {
        List<UserTable1> select = userService.selectBuilding(userTable1);
        model.addAttribute("list", select);
        return "table";
    }

    //退出登录
    @RequestMapping("move")
    public String move(HttpSession session) {
        session.removeAttribute("name");
        return "login";
    }

    //查询用户消费列表
    @RequestMapping("selectEnergy")
    public String selectEnery(Model model) {
        List<EnergyTable> select = adminService.select();
        model.addAttribute("list", select);
        return "paymentlist";
    }

    //根据支付状态查询用户消费列表
    @RequestMapping("selectEnergyState")
    public String selectEnergyState(EnergyTable energyTable, Model model) {
        List<EnergyTable> select = adminService.selectState(energyTable);
        if ("已支付".equals(energyTable.getEnergyState())) {
            model.addAttribute("list", select);
            return "payment";
        } else {
            model.addAttribute("list", select);
            return "nopayment";
        }
    }

    //根据用户id查询单个消费信息
    @RequestMapping("selectEnergyId")
    public String selectEnergyId(EnergyTable energyTable, Model model) {
        List<EnergyTable> select = adminService.selectId(energyTable);
        model.addAttribute("list", select);
        return "paymentlist";

    }

    //跳转用户住房分配页面
    @RequestMapping("userInformation")
    public String Information(UserTable1 userTable1, Model model) {
        List<UserTable1> userTable1s = userService.selectName(userTable1);
        model.addAttribute("list", userTable1s);
        List<UnitTable> unitList = roomService.selectUnit();
        model.addAttribute("unitList", unitList);
        List<RoomTable> roomList = roomService.selectRoom();
        model.addAttribute("roomList", roomList);
        return "updateuserinformation";
    }

    //同意用户住房申请
    @RequestMapping("updateInformation")
    public String updateInformation(UserTable1 userTable1, Model model, HttpSession session) {
        adminService.updateInformation(userTable1);
        Object name = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(name)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            List<UserTable1> select = userService.select();
            model.addAttribute("list", select);
            return "boss";
        }
    }

    //主页
    @RequestMapping("open")
    public String open(UserTable1 userTable1, Model model, HttpSession session) {
        Object name = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(name)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            List<UserTable1> select = userService.select();
            model.addAttribute("list", select);
            return "boss";
        }
    }

    //删除用户
    @RequestMapping("deleteInformation")
    public String deleteInformation(Integer id, Model model, HttpSession session) {
        adminService.deleteInformation(id);
        Object name = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(name)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.select();
            model.addAttribute("list", select);
            return "table";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            List<UserTable1> select = userService.select();
            model.addAttribute("list", select);
            return "table";
        }
    }

    //打开用户消费设置页面
    @RequestMapping("openuserpower")
    public String openuserpower(EnergyTable energyTable) {
        return "userprower";
    }

    //添加账单
    @RequestMapping("userpower")
    public String userpower(EnergyTable energyTable, Model model) {
        UserTable1 userTable1 = new UserTable1();
        userTable1.setUserName(energyTable.getEnergyUsername());
        int selectregister = userService.selectregister(userTable1);
        if (selectregister == 0) {
            adminService.insertpower(energyTable);
            return "redirect:/selectEnergyId";
        } else {
            model.addAttribute("msg", "不存在该用户，请核查信息后再操作");
            return "userprower";
        }

    }

    //修改账单
    @RequestMapping("userpowers")
    public String userpowers(EnergyTable energyTable) {
        adminService.updatepower(energyTable);
        return "redirect:/selectEnergyId";
    }

    //删除未支付账单
    @RequestMapping("deletepower")
    public String userpower(Integer id) {
        adminService.deletepower(id);
        return "redirect:/selectEnergyId";
    }

    //删除已支付账单
    @RequestMapping("deletepowers")
    public String userpowers(Integer id) {
        adminService.deletepower(id);
        return "redirect:/selectEnergyId";
    }

    //根据用户姓名模糊查询
    @RequestMapping("openupdateInformation")
    public String openupdateInformation(UserTable1 userTable1, Model model) {
        List<UserTable1> userTable1s = userService.selectName(userTable1);
        model.addAttribute("lists", userTable1s);
        return "updateInformation";
    }

    //用户修改个人信息
    @RequestMapping("updateInformations")
    public String updateInformation(UserTable1 userTable1, HttpSession session) {
        userService.updateInformations(userTable1);
        session.removeAttribute("name");
        return "login";
    }

    //优惠活动查询
    @RequestMapping("selectaction")
    public String selectaction(Model model) {
        GiftTable giftTable1 = adminService.selectGift();
        model.addAttribute("action", giftTable1);
        return "action";
    }

    //优惠活动
    @RequestMapping("adminaction")
    public String adminaction(Model model) {
        GiftTable giftTable1 = adminService.selectGift();
        model.addAttribute("action", giftTable1);
        return "adminaction";
    }

    //活动设置（boss）
    @RequestMapping("updateaction")
    public String updateaction(GiftTable giftTable, Model model) {
        adminService.updateGifts(giftTable);
        return "redirect:/open";
    }

    //未支付的用户账单
    @RequestMapping("openupdatepower")
    public String selectuserpower(Integer id, Model model) {
        EnergyTable selectopwer = adminService.selectopwer(id);
        model.addAttribute("list", selectopwer);
        return "updateuserpower";
    }

    //查询公告(id)
    @RequestMapping("selectnoticeId")
    public String selectnoticeId(Integer id, Model model) {
        NoticeTable noticeTable = adminService.selectnoticeId(id);
        model.addAttribute("list", noticeTable);
        return "updatenotice";
    }

    //打开添加公告页面
    @RequestMapping("openinsertnotice")
    public String openinsertnotice() {
        return "insertnotice";
    }

    //添加公告
    @RequestMapping("insertnotice")
    public String insertnotice(NoticeTable noticeTable, Model model, HttpSession session) {
        adminService.insertontice(noticeTable);
        Object name = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(name)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            return "boss";
        }
    }

    //修改公告
    @RequestMapping("updatenotice")
    public String updatenotice(NoticeTable noticeTable, Model model, HttpSession session) {
        adminService.updatenotice(noticeTable);
        Object name = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(name)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            return "boss";
        }
    }

    //删除公告
    @RequestMapping("deletenotice")
    public String deletenotice(Integer id, Model model, HttpSession session) {
        adminService.deletenotice(id);
        Object name = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(name)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            return "boss";
        }
    }

    //拒绝用户申请
    @RequestMapping("refuseuserapply")
    public String refuseuserapply(String name, Model model, HttpSession session) {
        adminService.refuseuserapply(name);
        Object names = session.getAttribute("name");
        List<NoticeTable> noticeTables = adminService.selectNotice();
        if ("admin".equals(names)) {
            model.addAttribute("noticelist", noticeTables);
            List<UserTable1> select = userService.selectState();
            model.addAttribute("list", select);
            return "index";
        } else {
            model.addAttribute("noticelist", noticeTables);
            int selectcountpay = adminService.selectcountpay();
            model.addAttribute("countpay", selectcountpay);
            return "boss";
        }
    }

    //单元楼信息
    @RequestMapping("selectunit")
    public String selectunit(Model model) {
        List<UnitTable> unitTableList = roomService.selectUnit();
        model.addAttribute("list", unitTableList);
        return "unittable";
    }

    //房间信息
    @RequestMapping("selectroom")
    public String selectroom(Model model) {
        List<RoomTable> roomTableList = roomService.selectRoom();
        model.addAttribute("list", roomTableList);
        return "roomtable";
    }

    //打开单元信息操作页面
    @RequestMapping("openunitoperation")
    public String openunitoperation(UnitTable unitTable, Model model) {

        UnitTable unitTableList = roomService.selectUnitId(unitTable.getId());
        model.addAttribute("list", unitTableList);
        return "unitoperation";
    }

    //打开单元信息操作页面
    @RequestMapping("openunitoperation1")
    public String openunitoperation1(UnitTable unitTable, Model model) {

        return "insertunit";
    }

    //单元信息修改
    @RequestMapping("unitupdate")
    public String unitoperation(UnitTable unitTable) {
        roomService.unitupdate(unitTable);
        return "redirect:/selectunit";
    }

    //单元信息添加
    @RequestMapping("unitinsert")
    public String unitinsert(UnitTable unitTable) {
        roomService.unitinsert(unitTable);
        return "redirect:/selectunit";
    }

    //单元删除
    @RequestMapping("deleteunit")
    public String deleteunit(Integer id) {
        roomService.deleteunit(id);
        return "redirect:/selectunit";
    }

    //打开房间信息操作页面
    @RequestMapping("openroomoperation")
    public String openroomoperation(RoomTable roomTable, Model model) {
        RoomTable roomTableList = roomService.selectRoomId(roomTable.getId());
        model.addAttribute("list", roomTableList);
        return "roomoperation";
    }

    //打开房间信息操作页面
    @RequestMapping("openroomoperation1")
    public String openroomoperation1(RoomTable roomTable, Model model) {

        return "insertroom";
    }

    //房间信息修改
    @RequestMapping("roomupdate")
    public String roomoperation(RoomTable roomTable) {
        roomService.roomoupdate(roomTable);
        return "redirect:/selectroom";
    }

    //房间信息添加
    @RequestMapping("roominsert")
    public String roominsert(RoomTable roomTable) {
        roomService.roominsert(roomTable);
        return "redirect:/selectroom";
    }

    //房间删除
    @RequestMapping("deleteroom")
    public String deleteroom(Integer id) {
        roomService.deleteroom(id);
        return "redirect:/selectroom";
    }

    //查看用户住房信息
    @RequestMapping("selectHouse")
    public String selectHouse(Model model) {
        List<HouseTable> houseTables = roomService.selectHouse();
        model.addAttribute("list", houseTables);
        return "selecthouse";
    }
}
