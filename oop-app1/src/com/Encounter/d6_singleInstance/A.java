package com.Encounter.d6_singleInstance;

/**
 * @author Encounter
 * @date 2024/6/17 21:00
 */
public class A
    {
        //2.定义一个变量记住类的一个对象
        private static A a=new A();

        //1.私有类的构造器
        private A()
            {
            }

        //3.定义一个类方法返回类的对象
        public static A getObject()
            {
                return a;
            }
    }
