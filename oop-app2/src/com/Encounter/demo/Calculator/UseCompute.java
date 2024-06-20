package com.Encounter.demo.Calculator;

/**
 * @author Encounter
 * @date 2024/6/19 16:26
 */
public class UseCompute
    {
        Compute c1 = new Add();//加法
        Compute c2 = new Subtract();//减法
        Compute c3 = new Multiplication();//乘法
        Compute c4 = new Division();//除法

        public void useCom(Compute com, int one, int two)
            {
                if (com.equals(c1))
                    {
                        System.out.println("n+m is " + c1.compute(one, two));
                    }
                else if (com.equals(c2))
                    {
                        System.out.println("n-m is " + c2.compute(one, two));
                    }
                else if (com.equals(c3))
                    {
                        System.out.println("n*m is " + c3.compute(one, two));
                    }
                else if (com.equals(c4))
                    {
                        System.out.println("n/m is " + c4.compute(one, two));
                    }
                else
                    System.out.println("输入有误");
            }
    }
