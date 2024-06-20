package com.Encounter.d2_static_method;

/**
 * @author Encounter
 * @date 2024/6/17 19:03
 */
public class Student
    {
        double score;

        //类方法
        public static void print()
            {
                System.out.println("Hello");
                System.out.println("Hello");
                System.out.println("Hello");
            }

        //实例方法（对象的方法）
        public void printPass()
            {
                System.out.println("成绩：" + (score >= 60 ? "及格" : "不及格"));
            }
    }
