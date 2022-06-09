package com.hzh.annotation;

import com.hzh.enums.MessageType;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @authar huangzhihong
 * @date 2022/6/7
 * @description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface HandlerAnnotation {

    MessageType type();

}
