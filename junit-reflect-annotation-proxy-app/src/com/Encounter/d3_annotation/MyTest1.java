package com.Encounter.d3_annotation;

/**
 * @author Encounter
 * @date 2024/07/19 17:36<br/>
 */
public @interface MyTest1
    {
        String aaa();
        String[] bbb();
        boolean ccc() default true;
        
    }
