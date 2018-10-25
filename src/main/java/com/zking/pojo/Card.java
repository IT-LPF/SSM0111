package com.zking.pojo;

/**
 * @Author: lpf
 * @Date 2018/10/12/012  11:53
 **/

public class Card {
    private Integer c_id;
    private String code;

    public Card() {
    }

    public Card(String code) {
        this.code = code;
    }

    public Card(Integer c_id, String code) {
        this.c_id = c_id;
        this.code = code;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Card{" +
                "c_id=" + c_id +
                ", code='" + code + '\'' +
                '}';
    }
}
