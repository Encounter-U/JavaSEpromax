package com.Encounter.d0_demo.object_objects;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/20 20:54
 */

/**
 * 编写一个测试类
 * ① 演示 Object 类中的 equals 方法、toString 方法
 * ② 演示 Person 类(属性:name,age)重写Object中的 equals 方法、toString 方法和 clone 方法，并在测试类中进行演示
 * ③ 演示 Objects 类中的 equals 方法、isNu 方法和 nonNul 方法的使用
 */
public class Test
    {
        public static void main(String[] args) throws CloneNotSupportedException
            {
                //任务1
                String s1 = "路明非";
                String s2 = "路明非";
                String s3 = "楚子航";
                int[] arr = new int[3];
                System.out.println(s1.equals(s2));
                System.out.println(s1.equals(s3));
                System.out.println(arr.toString());
                System.out.println("=================");

                //任务2
                Person p1 = new Person("路明非", 22);
                Person p2 = new Person("路明非", 22);
                System.out.println(p1.toString());
                System.out.println(p1.equals(p2));
                Person p3 = (Person) p1.clone();
                System.out.println(p3.toString());
                System.out.println(p3.equals(p1));
                System.out.println("=================");

                //任务3
                System.out.println(Objects.equals(s1, s2));
                String s4 = null;
                System.out.println(Objects.isNull(s4));
                System.out.println(Objects.nonNull(s4));
                System.out.println(Objects.equals(s1, s4));
            }
    }
