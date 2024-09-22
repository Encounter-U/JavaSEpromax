package com.Encounter.d3_annotation;

/**
 * @author Encounter
 * @date 2024/07/19 17:51<br/>
 * 目标：认识元注解，搞清楚元注解的作用
 */
@MyTest3
public class AnnotationTest2
    {
        //@MyTest3   //报错
        private String name;
        
        @MyTest3
        public void test(){}
    }
