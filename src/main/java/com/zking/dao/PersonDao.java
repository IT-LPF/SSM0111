package com.zking.dao;

import com.zking.pojo.Person;
import com.zking.pojo.User;

public interface PersonDao {


    /**
     * 根据人id获得对象
     * @param pid
     * @return
     */
    public Person selectPersonById(int pid);



}
