package com.example.interview.annotation;

import java.lang.annotation.*;

/**
 * @author xiaolei
 * @Title: ApiDescription
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/1323:33
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiDescription {
    String value() default "";
}
