package com.zking.pojo;

/**
 * 人类
 * @Author: lpf
 * @Date 2018/10/11/011  9:16
 **/

public class Person {
    private Integer id;//人类id
    private String name;//姓名
    private String sex;//性别
    private Integer age;//年龄
    //一对一关系设置：一个人对应一个身份证
    private Card card;//身份证号码


    public Person() {
    }

    public Person(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String sex, Integer age, Card card) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.card = card;
    }

    public Person(Integer id, String name, String sex, Integer age, Card card) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.card = card;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", card=" + card +
                '}';
    }

}
