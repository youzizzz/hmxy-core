package com.hmxy.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * redis操作类
 * @author  tangyouzhi
 */
@Component
public class RedisUtil {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 获取String类型值
     * @param key
     * @return
     */
    public Object get(String key){
       return redisTemplate.opsForValue().get(key);
    }

    /**
     * 往redis存值
     * @param key 键
     * @param value 值
     * @return
     */
    public String set(String key,String value){
        try{
            redisTemplate.opsForValue().set(key,value);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    /**
     * 往redis存值并设置过期时间
     * @param key 键
     * @param value 值
     * @param expTime 失效时间
     * @param timeUnit 单位
     * @return
     */
    public String set(String key, String value, Long expTime, TimeUnit timeUnit){
        try{
            redisTemplate.opsForValue().set(key,value,expTime,timeUnit);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    /**
     * 从缓存中删除key
     * @param key
     * @return
     */
    public String del(String key){
        Boolean result=redisTemplate.delete(key);
        return result?"删除成功":"删除失败";
    }

    /**
     *  获得一个集合
     * @param key
     * @param start
     * @param end
     * @return
     */
    public List<String> getList(String key,long start,long end){
       return redisTemplate.opsForList().range(key,start,end);
    }

}
