package com.hzh.handler;

import com.hzh.model.MessageInfo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
public abstract class AbstractBizHandler implements InitializingBean {

    @Autowired
    private BizHandlerContext bizHandlerContext;


    @Override
    public void afterPropertiesSet() throws Exception {
        bizHandlerContext.putBizHandler(getType(),this);
    }

    public abstract void execute(MessageInfo messageInfo);

    public abstract String getType();
}
