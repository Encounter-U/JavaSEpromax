package com.Encounter.d3_exception;

/**
 * @author Encounter
 * @date 2024/6/23 11:13
 */

import java.util.Scanner;

/**
 * 掌握异常的处理方式：捕获异常，尝试修复
 */
public class ExceptionTest4
    {
        public static void main(String[] args)
            {
                //需求：调用一个方法，让用户输入一个合适的价格返回为止
                //尝试修复
                while (true)
                    {
                        try
                            {
                                System.out.println(getMoney());
                                break;
                            }
                        catch (Exception e)
                            {
                                System.out.println("输入合法的数字");
                            }
                    }
            }

        public static double getMoney()
            {
                Scanner sc=new Scanner(System.in);
                while (true)
                    {
                        System.out.print("输入合适的价格：");
                        double money=sc.nextDouble();
                        if (money>=0)
                            return money;
                        else {
                            System.out.println("价格不合适");
                        }
                    }
            }

    }
