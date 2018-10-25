package com.zking.dao;

import com.zking.pojo.Card;
import com.zking.pojo.User;
import org.springframework.stereotype.Service;

/**
 * 身份证接口
 */
public interface CardDao {

    /**
     * 根据id获得card对象
     * @param c_id
     * @return
     */
    public Card selectCardById(int c_id);

}
