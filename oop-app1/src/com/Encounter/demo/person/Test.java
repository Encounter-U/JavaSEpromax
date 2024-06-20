package com.Encounter.demo.person;

/**
 * @author Encounter
 * @date 2024/6/18 17:29
 */

/**
 * 模拟简历信息
 * ①定义一个Person类，有姓名(name)、年龄(age)、住址(address)属性，定义一个方法info描述个人信息
 * ②)编写学生类继承Person，重写info方法，描述自己的学生身份和个人信息
 * ③编写老师类继承Person,重写info方法，
 * 描述自己的老师身份和个人信息
 * ④)定义一个测试类，创建学生和老师对象，并分别调用info方法，把信息输出到控制台
 * 我是老师:刘老师年龄:35住址:郑州
 * 我是学生:小李年龄:22住址:郑州
 */
public class Test
    {
        public static void main(String[] args)
            {
                Teacher t = new Teacher("刘老师", 35, "郑州");
                System.out.println(t.info());
                Student s = new Student("小李", 22, "郑州");
                System.out.println(s.info());
            }
    }
