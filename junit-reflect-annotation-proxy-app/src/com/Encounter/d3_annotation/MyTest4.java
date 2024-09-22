package com.Encounter.d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Encounter
 * @date 2024/07/19 18:00<br/>
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest4
    {
        String value();
        
        double aaa() default 100;
        
        String[] bbb();
    }
