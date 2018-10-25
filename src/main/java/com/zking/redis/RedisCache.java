package com.zking.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 缓存类
 * @Author: lpf
 * @Date 2018/10/24/024  10:32
 **/

public class RedisCache {

    //引用jedis池
    private JedisPool jedisPool;

    //通过get,set方法
    public JedisPool getJedisPool() {
        return jedisPool;
    }
    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }


    //设置数据到rdis
    public void setDataToRedis(String key ,String value){
        //先从jedis池中获得jedis
        Jedis jedis = jedisPool.getResource();
        jedis.set(key,value);
        //设置这个key的生命时间
        jedis.expire(key,100);
    }

    //获得redis中的数据
    public String  getDataFromRedis(String key){
        //先从jedis池中获得jedis
        Jedis jedis = jedisPool.getResource();
        return jedis.get(key);
    }



}
