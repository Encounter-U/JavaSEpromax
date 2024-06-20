package com.Encounter.d6_singleInstance;

/**
 * @author Encounter
 * @date 2024/6/17 21:00
 */

/**
 * 掌握单例设计模式的写法
 */
public class Test1
    {
        public static void main(String[] args)
            {
                A a1 = A.getObject();
                A a2 = A.getObject();
                System.out.println(a1);
                System.out.println(a2);
            }
    }
