package com.Encounter.d3_abstract;

/**
 * @author Encounter
 * @date 2024/6/18 19:22
 */

/**
 * 认识抽象类，掌握抽象类的基本应用
 */
public class Test
    {
        public static void main(String[] args)
            {
                //抽象类不允许创建对象
//                A a=new A();
                B b=new B();
                b.setName("B");
                b.test();
            }
    }
