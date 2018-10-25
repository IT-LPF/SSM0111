package com.zking.services.impl;

import com.zking.dao.CardDao;
import com.zking.pojo.Card;
import com.zking.services.CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: lpf
 * @Date 2018/10/22/022  12:01
 **/
@Service("cardService")
public class CardServiceImpl implements CardService {

    @Resource
    private CardDao cardDao;

    @Override
    public Card selectCardById(int c_id){
        return cardDao.selectCardById(c_id);
    }
}
