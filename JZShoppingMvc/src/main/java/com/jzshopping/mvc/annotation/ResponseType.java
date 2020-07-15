package com.jzshopping.mvc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static com.jzshopping.mvc.annotation.impl.RespTypeEnum.JSON;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author lmz
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface ResponseType {
    String value() default JSON;
}
