package com.Encounter.d1_polymorphism;

/**
 * @author Encounter
 * @date 2024/6/18 18:26
 */

/**
 * 认识多态
 */
public class Test
    {
        public static void main(String[] args)
            {
                People p1=new Teacher();//对象多态
                p1.run();//行为多态
                System.out.println(p1.name);//成员变量没有多态

                People p2=new Student();
                p2.run();
                System.out.println(p2.name);
            }
    }
