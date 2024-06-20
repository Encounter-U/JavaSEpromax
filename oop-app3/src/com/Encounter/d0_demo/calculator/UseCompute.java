package com.Encounter.d0_demo.calculator;

/**
 * @author Encounter
 * @date 2024/6/19 19:10
 */
public class UseCompute
    {
        int one;
        int two;

        public void useCom(Compute com, int one, int two)
            {
                this.one = one;
                this.two = two;
                com.compute(one,two);
            }
    }
