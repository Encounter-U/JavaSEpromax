package com.Encounter.d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Encounter
 * @date 2024/07/19 17:51<br/>
 */

//当前被修饰的注解只能用在类，方法上
@Target({ElementType.TYPE,ElementType.METHOD})
//控制下面的注解一直保留到运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest3
    {
    }
