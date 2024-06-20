package com.Encounter.d0_demo.calculator;

/**
 * @author Encounter
 * @date 2024/6/19 19:39
 */

/**
 * 利用接口做参数，写个计算器，能完成加减乘除运算:
 * ① 定义一个接日Compute含有一个方法int computer(int n, int m);
 * ②设计一个类UseCompute，类中含有方法:public void useCom(Compute com, int one, int two)
 * 此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果
 * ③ 设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算(使用匿名内部类)
 */
public class Test
    {
        public static void main(String[] args)
            {
                /*Compute c1 = new Add();
                Compute c2 = new Subtract();
                Compute c3 = new Multiply();
                Compute c4 = new Division();*/
                UseCompute uc = new UseCompute();
                uc.useCom((n, m) ->
                    {
                        System.out.println("m+n=" + (n + m));
                        return m + n;
                    }, 1, 2);
                uc.useCom((n, m) ->
                    {
                        System.out.println("m-n=" + (n-m));
                        return n - m;
                    }, 1, 2);
                uc.useCom((n, m) ->
                    {
                        System.out.println("m*n=" + (n*m));
                        return n * m;
                    }, 1, 2);
                uc.useCom((n, m) ->
                    {
                        System.out.println("m/n=" + (n/m));
                        return n / m;
                    }, 2, 1);
            }
    }
