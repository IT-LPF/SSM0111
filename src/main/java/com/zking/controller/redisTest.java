package com.zking.controller;

import com.alibaba.fastjson.JSON;
import com.zking.pojo.User;
import com.zking.redis.RedisCache;
import com.zking.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 缓存测试类
 * @Author: lpf
 * @Date 2018/10/24/024  10:48
 **/
@Controller
public class redisTest {

    @Resource
    private RedisCache redisCache;

    @Resource
    private UserService userService;

    @RequestMapping("getAllUser.do")
    public String redisTest(Map map){

        List<User> userList = null;

        //1先从redis从获得数据
           //1.1先配置redis中的key
           String key= "com.zking.dao.UserDao.getAllUser";
           //1.2 根据key去缓存拿数据
           String data = redisCache.getDataFromRedis(key);
           //1.3 判断拿取的数据是否为null,如果为null，说明redis中没有缓存该数据

        if(data==null){
            //redis没有该缓存数据，
            //调用dao方法，查询数据库
            userList = userService.getAllUser();
            System.out.println("缓存中没有数据："+userList);
            //将集合转成json格式
            String jsonAllUser = JSON.toJSONString(userList);
            //将数据存入redis
            redisCache.setDataToRedis(key,jsonAllUser);
        }else{
            //缓存中有数据
            //将查询出来的缓存数据转成对象集合
            userList = JSON.parseArray(data, User.class);
            System.out.println("缓存中数据："+userList);
        }
        map.put("userList",userList);
        return "success.jsp";
    }





}
