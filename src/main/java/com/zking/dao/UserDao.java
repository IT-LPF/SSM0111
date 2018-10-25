package com.zking.dao;

import com.zking.pojo.User;

import java.util.List;

/**
 * 用户接口
 */
public interface UserDao {

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);


    /**
     * 获得所有用户
     * @return
     */
    public List<User> getAllUser();

}
