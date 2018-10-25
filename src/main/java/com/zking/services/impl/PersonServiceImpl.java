package com.zking.services.impl;

import com.zking.dao.PersonDao;
import com.zking.dao.UserDao;
import com.zking.pojo.Person;
import com.zking.pojo.User;
import com.zking.services.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: lpf
 * @Date 2018/10/22/022  10:26
 **/
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonDao personDao;

    @Override
    public Person selectPersonById(int pid){


        return personDao.selectPersonById(pid);
    }


}
