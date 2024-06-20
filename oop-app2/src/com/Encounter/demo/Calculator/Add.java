package com.Encounter.demo.Calculator;

/**
 * @author Encounter
 * @date 2024/6/19 16:22
 */
public class Add implements Compute
    {
        @Override
        public int compute(int n, int m)
            {
                return m + n;
            }
    }
