package com.zking.services;

import com.zking.pojo.User;

import java.util.List;

/**
 * 业务层的用户接口
 */
public interface UserService {

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
