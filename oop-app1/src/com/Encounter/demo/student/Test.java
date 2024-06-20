package com.Encounter.demo.student;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 20:01
 */

/**
 * 学生具有姓名、年龄、生日等属性(这些学生均为15岁)，有学习的能力
 * 要求:
 * ①定义一个学生类，描述班级学生的班级、姓名、年龄、生日这些属性(私有)
 * ②)定义一个可以通过类名来调用学生学习的方法
 * ③编写测试类通过类名调用学习方法(输出格式如下)
 * 好好学习，天天向上
 * ④创建两个学生对象张三和李四，在控制台输出学员的信息(输出格式如下)
 * 张三，15岁，生日:9月12日
 * 李四，15岁，生日:9月15日
 */
public class Test
    {
        public static void main(String[] args)
            {
                Util.print();
                ArrayList<Student> students=new ArrayList<>();
                students.add(new Student("一班","张三",15,"9月12日"));
                students.add(new Student("一班","李四",15,"9月15日"));
                Manager m=new Manager(students);
                m.show();
            }
    }
