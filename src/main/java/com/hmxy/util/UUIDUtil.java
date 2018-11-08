package com.hmxy.util;

import java.util.UUID;

/**
 * @discripeion:
 * @author: liangj
 * @date: 2018/11/8 11:35
 */
public class UUIDUtil {

    public static String generateUUID(){
        return UUID.randomUUID().toString().substring(0,8);
    }
}
