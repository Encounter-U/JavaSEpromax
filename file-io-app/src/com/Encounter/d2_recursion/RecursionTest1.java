package com.Encounter.d2_recursion;

/**
 * @author Encounter
 * @date 2024/7/1 13:30
 */

/**
 * 认识递归的形式
 */
public class RecursionTest1
    {
        public static void main(String[] args)
            {
                //test1();
                test2();
            }

        //直接方法递归
        public static void test1()
            {
                System.out.println("test1");
                test1();//直接方法递归
            }

        //间接方法递归
        public static void test2()
            {
                System.out.println("test2");
                test3();
            }

        public static void test3()
            {
                test2();//间接递归
            }
    }
