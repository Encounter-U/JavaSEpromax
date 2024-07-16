package com.Encounter.d0_demo.unitTest.test2;

/**
 * @author Encounter
 * @date 2024/7/13 20:55<p/>
 * 质数是指是指一个大于1的自然数，除了1和它自身外，不能被其它自然数整除，被广泛应用于RSA加密算法中，要求创建一个测试类，完成如下任
 * 务:
 * ①写一个递归方法，可以输出0-n之间的所有质数，
 * ②在主方法中调用该方法，输出0-100之间的质数
 */
public class Test
    {
        public static void main(String[] args)
            {
                recursion(100);
            }

        public static void recursion(int n)
            {
                if (n == 0 || n == 1)
                    return;
                boolean flag=true;
                for (int i = 2; i <= n / 2; i++)
                    {
                        if (n % i == 0)
                            {
                                flag = false;
                                break;
                            }
                    }
                if (flag)
                    {
                        System.out.println(n);
                    }
                //递归调用
                recursion(n - 1);
            }
    }
