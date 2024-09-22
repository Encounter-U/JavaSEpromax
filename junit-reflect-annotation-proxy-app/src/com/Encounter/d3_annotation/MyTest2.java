package com.Encounter.d3_annotation;

/**
 * @author Encounter
 * @date 2024/07/19 17:41<br/>
 */
public @interface MyTest2
    {
        String value();
        
        int age() default 22;
    }
