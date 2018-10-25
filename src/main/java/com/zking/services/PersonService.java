package com.zking.services;

import com.zking.pojo.Person;
import com.zking.pojo.User;

/**
 * 业务层的人接口
 */
public interface PersonService {

    /**
     * 根据人id获得对象
     * @param pid
     * @return
     */
    public Person selectPersonById(int pid);
}
