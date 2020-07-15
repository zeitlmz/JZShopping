package com.jzshopping.mvc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author lmz
 */
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface NotNull {
    boolean value() default false;
}
