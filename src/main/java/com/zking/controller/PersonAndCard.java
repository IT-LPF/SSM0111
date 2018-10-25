package com.zking.controller;

import com.zking.pojo.Person;
import com.zking.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author: lpf
 * @Date 2018/10/22/022  11:51
 **/
@Controller
public class PersonAndCard {

    @Resource
    private PersonService personService;


    @RequestMapping(value = "/selectPersonById.do")
    public ModelAndView selectPersonById(ModelAndView mv){
        //System.out.println("result获得的id:"+id);
        Person person = personService.selectPersonById(2);
        mv.addObject(person);
        mv.setViewName("success.jsp");
        return mv;
    }
}
