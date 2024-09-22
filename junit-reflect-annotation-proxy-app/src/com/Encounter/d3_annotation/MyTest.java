package com.Encounter.d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Encounter
 * @date 2024/07/19 18:21<br/>
 */
@Target(ElementType.METHOD)//让当前注解只能注解方法
@Retention(RetentionPolicy.RUNTIME)//让当前注解可以一直存活
public @interface MyTest
    {
    }
