package com.zking.services.impl;

import com.zking.dao.UserDao;
import com.zking.pojo.User;
import com.zking.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: lpf
 * @Date 2018/10/22/022  10:26
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userdao;//userdao接口

    @Override
    public int addUser(User user){
        return  userdao.addUser(user);
    }



    /**
     * 获得所有用户
     * @return
     */
    public List<User> getAllUser(){
        return userdao.getAllUser();
    }

}
