package com.Encounter.d0_demo.calculator.未使用;

import com.Encounter.d0_demo.calculator.Compute;

/**
 * @author Encounter
 * @date 2024/6/19 19:35
 */
public class Division implements Compute
    {
        private int m;
        private int n;
        private int res;

        @Override
        public int compute(int n, int m)
            {
                this.m = m;
                this.n = n;
                this.res = n / m;
                System.out.println("n/m=" + res);
                return res;
            }
    }
