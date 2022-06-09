package com.hzh;

import com.hzh.enums.MessageType;
import com.hzh.handler.BizHandler;
import com.hzh.handler.BizHandlerContext;
import com.hzh.model.SmsMessageInfo;
import com.hzh.model.WeChatMessageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyModeApplicationTests {

    @Autowired
    BizHandlerContext bizHandlerContext;

    @Test
    void contextLoads() {
        BizHandler bizHanler = bizHandlerContext.getBizHanler(MessageType.SMS.name());
        SmsMessageInfo smsContentModel = new SmsMessageInfo();
        smsContentModel.setContent("【XXX】验证码：313122，您正在进行登录操作，若非本人操作，请勿泄露");
        bizHanler.execute(smsContentModel);

        BizHandler bizHanler2 = bizHandlerContext.getBizHanler(MessageType.WECHAT.name());
        WeChatMessageInfo weChatContentModel = new WeChatMessageInfo();
        weChatContentModel.setContent("这是一条微信消息");
        bizHanler2.execute(weChatContentModel);
    }

}
