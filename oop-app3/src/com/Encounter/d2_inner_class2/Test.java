package com.Encounter.d2_inner_class2;

/**
 * @author Encounter
 * @date 2024/6/19 18:11
 */


/**
 * 静态内部类
 */
public class Test
    {
        public static void main(String[] args)
            {
                Outer.Inner in=new Outer.Inner();
                in.setName("路明非");
                in.test();
                System.out.println(in.getName());
            }
    }
