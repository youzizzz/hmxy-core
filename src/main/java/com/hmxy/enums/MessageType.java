package com.hmxy.enums;

/**
 * 消息类型枚举 code等同message_type
 * @author tangyouzhi
 * @date 2018年11月12日10:09:34
 */
public enum MessageType {

    userShare('0',"用户补全"),
    suggestions('1',"投诉建议"),
    friendLink('2',"友情链接申请");

    char code;
    String description;

    MessageType(char code, String description) {
        this.code = code;
        this.description=description;
    }

    public char getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }
}
