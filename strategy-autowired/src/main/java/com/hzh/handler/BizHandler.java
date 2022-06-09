package com.hzh.handler;

import com.hzh.model.MessageInfo;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
public interface BizHandler {

    void execute(MessageInfo messageInfo);

    String getType();
}
