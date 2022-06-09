package com.hzh.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短信消息模型
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsMessageInfo extends MessageInfo{

    /**
     * 短信发送内容
     */
    private String content;

    /**
     * 短信发送链接
     */
    private String url;

}
