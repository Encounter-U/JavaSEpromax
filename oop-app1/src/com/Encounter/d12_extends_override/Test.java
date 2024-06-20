package com.Encounter.d12_extends_override;

/**
 * @author Encounter
 * @date 2024/6/18 12:04
 */

import java.util.ArrayList;

/**
 * 认识方法重写，掌握方法重写的常见应用场景
 */
public class Test
    {
        public static void main(String[] args)
            {
                B b = new B();
                b.print1();
                b.print2();

                System.out.println("-------------");
                Student s=new Student("路明非",22);
                System.out.println(s);//自动调用toString方法

                ArrayList<Student> students=new ArrayList<>();
                students.add(new Student("路明非",22));
                students.add(new Student("楚子航",23));
                System.out.println(students);
            }
    }
