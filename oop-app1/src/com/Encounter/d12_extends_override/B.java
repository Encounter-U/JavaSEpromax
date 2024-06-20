package com.Encounter.d12_extends_override;

/**
 * @author Encounter
 * @date 2024/6/18 12:05
 */
public class B extends A
    {
        //方法重写
        @Override//安全，可读性好
        public void print1()
            {
                System.out.println("666");
            }

        @Override
        public void print2()
            {
                System.out.println("777");
            }
    }
