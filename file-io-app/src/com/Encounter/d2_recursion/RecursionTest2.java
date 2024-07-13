package com.Encounter.d2_recursion;

/**
 * @author Encounter
 * @date 2024/7/1 13:38
 */

/**
 * 掌握递归的应用，执行流程和算法思想
 */
public class RecursionTest2
    {
        public static void main(String[] args)
            {
                System.out.println(factorial(5));
                System.out.println(sum(5));
            }

        public static int factorial(int num)
            {
                //终结点
                if (num == 1)
                    return 1;
                else
                    return num * factorial(num - 1);
            }

        public static int sum(int num)
            {
                if (num == 1)
                    return 1;
                else
                    return num + sum(num - 1);
            }
    }
