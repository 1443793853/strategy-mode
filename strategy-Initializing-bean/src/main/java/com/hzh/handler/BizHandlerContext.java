package com.hzh.handler;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
@Component
public class BizHandlerContext{

    private final Map<String, AbstractBizHandler> bizHandlerMap = new HashMap<>();

    public void putBizHandler(String type, AbstractBizHandler handler) {
        bizHandlerMap.put(type, handler);
    }


    public AbstractBizHandler getBizHanler(String type) {
        AbstractBizHandler bizHandler = this.bizHandlerMap.get(type);
        if (bizHandler == null) {
            throw new RuntimeException("not.found.BizHandler");
        }
        return bizHandler;
    }



}
