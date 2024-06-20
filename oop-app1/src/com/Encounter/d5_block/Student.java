package com.Encounter.d5_block;

/**
 * @author Encounter
 * @date 2024/6/17 20:45
 */
public class Student
    {
        static int num=80;
        static String schoolName;
        //静态代码块
        static {
            System.out.println("静态代码块执行了");
            schoolName="卡塞尔学院";
        }

        //实例代码块
        {
            System.out.println("实例代码块执行了");
        }
        public Student()
            {
                System.out.println("无参构造器执行了");
            }
        public Student(String name)
            {
                System.out.println("有参构造器执行了");
            }
    }
