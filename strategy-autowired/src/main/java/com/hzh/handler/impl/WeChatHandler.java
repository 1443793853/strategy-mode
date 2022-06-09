package com.hzh.handler.impl;

import com.hzh.enums.MessageType;
import com.hzh.handler.BizHandler;
import com.hzh.model.MessageInfo;
import com.hzh.model.WeChatMessageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
@Service
@Slf4j
public class WeChatHandler implements BizHandler {

    @Override
    public void execute(MessageInfo messageInfo) {
        WeChatMessageInfo weChatMessageInfo = (WeChatMessageInfo) messageInfo;
        // 发送微信
        log.info("发送微信消息:{}",weChatMessageInfo.getContent());
    }

    @Override
    public String getType() {
        return MessageType.WECHAT.name();
    }

}
