package com.Encounter.d2_regex;

import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/22 18:48
 */
public class RegexTest3
    {
        public static void main(String[] args)
            {
                //checkPhone();
                //checkEmail();
                checkTime();
            }

        /**
         * 校验手机|座机号
         */
        public static void checkPhone()
            {
                while (true)
                    {
                        Scanner sc=new Scanner(System.in);
                        System.out.print("输入手机|座机号：");
                        String phone = sc.nextLine();

                        if (phone.matches("(1[3-9]\\d{9})||(0\\d{2,7}-?[1-9]\\d{4,19})"))
                            {
                                System.out.println("格式正确");
                                break;
                            }
                        else
                            {
                                System.out.println("格式有误");
                            }
                    }
            }

        //验证邮箱
        public static void checkEmail()
            {
                while (true)
                    {
                        Scanner sc=new Scanner(System.in);
                        System.out.print("输入邮箱号：");
                        String email = sc.nextLine();

                        if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}"))
                            {
                                System.out.println("格式正确");
                                break;
                            }
                        else
                            {
                                System.out.println("格式有误");
                            }
                    }
            }public static void checkTime()
            {
                while (true)
                    {
                        Scanner sc=new Scanner(System.in);
                        System.out.print("输入时间：");
                        String email = sc.nextLine();

                        if (email.matches("(([0-1]?[0-9])|(2[0-3])):([0-5][0-9])"))
                            {
                                System.out.println("格式正确");
                                break;
                            }
                        else
                            {
                                System.out.println("格式有误");
                            }
                    }
            }

    }
