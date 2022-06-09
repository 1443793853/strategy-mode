package com.hzh.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
@Component
public class BizHandlerContext{

    private final Map<String, BizHandler> bizHandlerMap = new HashMap<>();

    @Autowired(required = false)
    public void putBizHandler(List<BizHandler> bizHandlerList) {
        for (BizHandler bizHandler : bizHandlerList) {
            String type = bizHandler.getType();
            if (StringUtils.isEmpty(type)) {
                throw new IllegalArgumentException("BizHandler name must not be empty");
            }
            bizHandlerMap.put(type, bizHandler);
        }
    }


    public BizHandler getBizHanler(String type) {
        BizHandler bizHandler = this.bizHandlerMap.get(type);
        if (bizHandler == null) {
            throw new RuntimeException("not.found.BizHandler");
        }
        return bizHandler;
    }



}
