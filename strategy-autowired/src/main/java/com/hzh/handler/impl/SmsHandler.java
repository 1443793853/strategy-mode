package com.hzh.handler.impl;

import com.hzh.enums.MessageType;
import com.hzh.handler.BizHandler;
import com.hzh.model.MessageInfo;
import com.hzh.model.SmsMessageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
@Service
@Slf4j
public class SmsHandler implements BizHandler {

    @Override
    public void execute(MessageInfo messageInfo) {
        SmsMessageInfo smsMessageInfo = (SmsMessageInfo) messageInfo;
        // 发送短信
        log.info("发送短信消息:{}",smsMessageInfo.getContent());
    }

    @Override
    public String getType() {
        return MessageType.SMS.name();
    }

}
