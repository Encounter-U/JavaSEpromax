package com.Encounter.d3_exception;

/**
 * @author Encounter
 * @date 2024/6/23 10:37
 */

/**
 * 掌握自定义异常，以及异常的作用
 */
public class ExceptionTest2
    {
        public static void main(String[] args)
            {
                //需求：保存一个合法的年龄
                try
                    {
                        saveAge(200);
                        System.out.println("底层执行成功");
                    }
                catch (Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("底层出了bug");
                    }
                try
                    {
                        saveAge(23);
                        System.out.println("222底层执行成功");
                    }
                catch (AgeIllegalException e)
                    {
                        e.printStackTrace();
                        System.out.println("222底层出了bug");
                    }
            }

        public static void saveAge(int age) throws AgeIllegalException
            {
                if (age > 0 && age < 150)
                    System.out.println("保存成功");
                else
                    {
                        //System.out.println("年龄非法");
                        //用异常对象封装该问题
                        //throw 抛出去这个异常对象
                        //throws 用在方法上，抛出方法内部的异常
                        throw new AgeIllegalException("/age is illegal,your age is " + age);
                    }

            }

    }
