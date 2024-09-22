package com.Encounter.d3_annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/07/19 17:59<br/>
 * 目标：掌握注解的解析
 */
public class AnnotationTest3
    {
        @Test
        public void parseClass()
            {
                //1.先得到Class对象
                Class c = Demo.class;
                //2.解析类上的注解
                //判断类上是否包含了某个注解
                if (c.isAnnotationPresent(MyTest4.class))
                    {
                        MyTest4 myTest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
                        System.out.println(myTest4.value());
                        System.out.println(myTest4.aaa());
                        System.out.println(Arrays.toString(myTest4.bbb()));
                    }
            }
        
        @Test
        public void parseMethod() throws Exception
            {
                //1.先得到Class对象
                Class c = Demo.class;
                Method method = c.getDeclaredMethod("test1");
                //2.解析类上的注解
                //判断类上是否包含了某个注解
                if (method.isAnnotationPresent(MyTest4.class))
                    {
                        MyTest4 myTest4 = method.getDeclaredAnnotation(MyTest4.class);
                        System.out.println(myTest4.value());
                        System.out.println(myTest4.aaa());
                        System.out.println(Arrays.toString(myTest4.bbb()));
                    }
            }
    }
