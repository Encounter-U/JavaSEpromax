package com.Encounter.demo.Calculator;

/**
 * @author Encounter
 * @date 2024/6/19 16:33
 */

/**
 * 利用接口做参数，写个计算器，能完成加减乘除运算。
 * ①定义一个接口Compute含有一个方法int computer(int n, int m)。
 * ②设计四个类分别实现此接口，完成加减乘除运算。
 * ③设计一个类UseCompute，类中含有方法:public void useCom(Compute com,int one,int two)，此方法能够用传递过来的对象调用compu
 * ter方法完成运算，并输出运算的结果。
 * solftdevliavaJavajdk
 * n+m is 10
 * n-m is 6
 * n*m is 16
 * n/m is 4
 * ④设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算
 */
public class Test
    {
        public static void main(String[] args)
            {
                UseCompute uc=new UseCompute();
                uc.useCom(uc.c1,1,2);
            }
    }
