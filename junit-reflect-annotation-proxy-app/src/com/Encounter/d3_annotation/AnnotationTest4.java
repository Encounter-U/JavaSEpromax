package com.Encounter.d3_annotation;

import java.lang.reflect.Method;

/**
 * @author Encounter
 * @date 2024/07/19 18:21<br/>
 * 目标：模拟Junit框架的设计
 */
public class AnnotationTest4
    {
        /**
         * 启动程序！！！
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception
            {
                AnnotationTest4 annotationTest4 = new AnnotationTest4();
                //1.得到Class对象
                Class c= AnnotationTest4.class;
                
                //2.提取该类中的全部成员方法
                Method[] methods = c.getDeclaredMethods();
                
                //3.遍历该数组中的每个方法，看方法上的是否存在@MyTest注解
                //存在，触发该方法执行
                for (Method method : methods)
                    {
                        if (method.isAnnotationPresent(MyTest.class))
                            //说明当前方法上是存在@MyTest，触发当前方法执行
                            method.invoke(annotationTest4);
                    }
            }
        
        //@MyTest
        public void test1()
            {
                System.out.println("======test1======");
            }
        
        @MyTest
        public void test2()
            {
                System.out.println("======test2======");
            }
        
        //@MyTest
        public void test3()
            {
                System.out.println("======test3======");
            }
        
        @MyTest
        public void test4()
            {
                System.out.println("======test4======");
            }
    }
