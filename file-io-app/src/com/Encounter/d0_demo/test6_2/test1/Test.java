package com.Encounter.d0_demo.test6_2.test1;

/**
 * @author Encounter
 * @date 2024/7/1 16:38
 */

/**
 * 面试官要求我们写一个测试类，实现如下下功能
 * ①定义一个递归方法，该方法可以实现计算0-n之间所有奇数的和
 * ②在主方法中调用该方法，并将0-100之间所有奇数的和打印在控制台
 */
public class Test
    {
        public static void main(String[] args)
            {
                System.out.println("0到100之间的奇数之和为：" + sum(100));
            }

        public static int sum(int num)
            {
                if (num <= 2)
                    return 1;
                if (num % 2 != 0)
                    return sum(num - 2) + num;
                else
                    {
                        num = num - 1;
                        return sum(num - 2) + num;
                    }
            }
    }
