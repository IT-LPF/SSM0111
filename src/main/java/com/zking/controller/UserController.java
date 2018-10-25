package com.zking.controller;

import com.zking.pojo.User;
import com.zking.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: lpf
 * @Date 2018/10/22/022  10:33
 **/
@Controller
public class UserController {

    @Resource
    private UserService userService;//spring容器实例化userService的实现类，并且注入到该对象

    @RequestMapping(value = "addUser.do")
    public String addUser(User user){
        System.out.println(user);
        int result =0;
        for(int i=0;i<10000;i++){
            result = userService.addUser(user);
        }
        if(result>0){
            return "success.jsp";
        }
       return "error.jsp";
    }

    @RequestMapping(value = "getListUser.do")
    public String getAllUser(Map map){
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);
        map.put("userList",allUser);
        return "success2.jsp";
    }


}
