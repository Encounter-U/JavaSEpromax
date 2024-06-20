package com.Encounter.d1_inner_class1;

/**
 * @author Encounter
 * @date 2024/6/19 17:38
 */

/**
 * 了解成员内部类及其特点
 */
public class Test
    {
        public static void main(String[] args)
            {
                Outer.Inner in = new Outer().new Inner();
                in.test();
            }
    }
