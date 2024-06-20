package com.Encounter.d1_staticdemo;

/**
 * @author Encounter
 * @date 2024/6/17 18:43
 */

/**
 * 掌握有误static修饰成员变量的用法，特点
 */
public class Test
    {
        public static void main(String[] args)
            {
                //1.类变量的用法
                //类名.类变量（推荐）
                Student.name="路明非";

                //对象.类变量（不推荐）
                Student s1=new Student();
                s1.name="楚子航";

                Student s2=new Student();
                s2.name="上杉绘梨衣";

                System.out.println(s1.name);
                System.out.println(Student.name);

                //2.实例变量的用法，属于每个对象的变量
                //对象.实例变量
                s1.age=22;
                s2.age=30;
                System.out.println(s1.age);

                //System.out.println(Student.age);//报错
            }
    }
