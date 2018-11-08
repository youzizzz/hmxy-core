package com.hmxy.enums;

/**
 * 对象状态枚举 暂时两个,需要添加
 */
public enum  ObjectEnum {

    /**
     * 有效
     */
    effective('0',"有效"),

    /**
     * 失效
     */
    Invalid('1',"失效");


    private char status;
    private String description;

    ObjectEnum(char status,String description) {
        this.status = status;
        this.description=description;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
