package com.hzh.handler;

import com.hzh.annotation.HandlerAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
@Component
public class BizHandlerContext  implements BeanPostProcessor {

    private final Map<String, BizHandler> bizHandlerMap = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        HandlerAnnotation annotation = AnnotationUtils.findAnnotation(bean.getClass(), HandlerAnnotation.class);
        if (ClassUtils.isAssignableValue(BizHandler.class,bean) && annotation != null) {
            bizHandlerMap.put(annotation.type().name(), (BizHandler)bean);
        }
        return bean;
    }

    public BizHandler getBizHanler(String type) {
        BizHandler bizHandler = this.bizHandlerMap.get(type);
        if (bizHandler == null) {
            throw new RuntimeException("not.found.BizHandler");
        }
        return bizHandler;
    }



}
