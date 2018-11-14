package com.hmxy.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志帮助类
 * @author tangyouzhi
 */
public class LogUtil {

    /**
     * 获得一个日志
     * @param classzz
     * @return
     */
    public static Logger getLogger(Class classzz){
        return LoggerFactory.getLogger(classzz);
    }
}
