package com.Encounter.d0_demo.Test4_1.test1;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/23 13:36
 */

/**
 * 在一个程序中有1,2，3三个选项交给用户选择，用户输入其他选项时会给出友好提示，请设计一个程序模拟该过程
 * 1.在测试类中，使用键盘录入让用户输入选项1,2，3，通过if语句判断分别给出提示:选项一;选项二;选项三;
 * 2.若用户输入其他内容时抛出运行时异常，信息为:输入有误
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入选项（1，2，3）：");
                int choice = sc.nextInt();
                if (choice == 1)
                    System.out.println("选项一");
                else if (choice == 2)
                    System.out.println("选项二");
                else if (choice == 3)
                    System.out.println("选项三");
                else
                    throw new RuntimeException("输入有误");
            }
    }
