package com.Encounter.d9_modifer;

/**
 * @author Encounter
 * @date 2024/6/17 21:47
 */

/**
 * 掌握不同权限修饰符的作用
 */
public class Demo
    {
        public static void main(String[] args)
            {
                Fu f = new Fu();
//                f.privateMethod();
                f.method();
                f.protectedMethod();
                f.publicMethod();

            }
    }
