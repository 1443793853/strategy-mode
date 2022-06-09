package com.hzh.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 消息类型枚举
 */
@Getter
@AllArgsConstructor
public enum MessageType {


    PUSH("通知栏"),
    SMS("短信"),
    EMAIL( "邮件"),
    WECHAT( "微信"),
    DING_DING_ROBOT( "钉钉机器人"),
    DING_DING_WORK_NOTICE("钉钉工作通知")
    ;

    /**
     * 描述
     */
    private String description;


}
