package com.Encounter.d0_demo.ZhangJiePingCe2.calculator;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/23 13:49
 */

/**
 * 设计一个程序模拟计算机计算两个整数乘积的过程
 * ①通过键盘录入让用户输入两个整数，如果用户输入的不是整数，则提示用户重新输入
 * ②)计算两个数的乘积，并将结果打印在控制台
 * (已知:如果我们使用nextInt()方法让用户输入整数,但用户实际输入的不是整教的时候,会发生异常,而对于一个键盘输入对象来说,一旦发生异常,即
 * 使使用try{}catch{}(语句进行了处理,这个键盘输入对象也无法继续工作了,解决的办法就是重写创建新的键盘输入对象即可;)
 */
public class Test
    {
        public static void main(String[] args)
            {
                while (true)
                    {
                        try
                            {
                                Scanner sc=new Scanner(System.in);
                                System.out.print("输入第一个整数：");
                                int first = sc.nextInt();
                                while (true)
                                    {
                                        try
                                            {
                                                Scanner sc2=new Scanner(System.in);
                                                System.out.print("输入第二个整数：");
                                                int second = sc2.nextInt();
                                                System.out.println(first+"*"+second+"="+(first * second));
                                                return;
                                            }
                                        catch (Exception e)
                                            {
                                                System.out.println("第二个整数输入有误，请重新输入！");
                                            }
                                    }
                            }
                        catch (Exception e)
                            {
                                System.out.println("第一个整数输入有误，重新输入！");
                            }
                    }

            }
    }
