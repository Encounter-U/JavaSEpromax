package com.Encounter.d2_static_method;

/**
 * @author Encounter
 * @date 2024/6/17 19:04
 */

/**
 * 掌握有无static修饰方法的用法
 */
public class Test
    {
        public static void main(String[] args)
            {
                //1.类方法的用法
                //类名.类方法（推荐）
                Student.print();

                //对象.类方法（不推荐）
                Student s = new Student();
                s.print();

                //2.实例方法的用法
                //对象.实例方法
                s.printPass();
                //Student.printPass();//报错
            }
    }
