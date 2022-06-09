package com.hzh.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 企业微信 应用消息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeChatMessageInfo extends MessageInfo{

    /**
     * 下发企业微信消息的类型
     */
    private String sendType;

    /**
     * 短信发送内容
     */
    private String content;


    /**
     * 图片媒体文件id
     */
    private String mediaId;


}
