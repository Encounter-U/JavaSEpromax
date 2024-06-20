package com.Encounter.demo.Calculator;

/**
 * @author Encounter
 * @date 2024/6/19 16:24
 */
public class Division implements Compute
    {
        @Override
        public int compute(int n, int m)
            {
                int num;
                if (m == 0)
                    {
                        System.out.println("除数不能为0！");
                        return -1;
                    }
                num = n / m;
                return num;
            }
    }
