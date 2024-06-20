package com.Encounter.demo.student1;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 20:17
 */

/**
 * 定义一个尊享无忧的学生类(Student)
 * ①学生类的成员属性分别是姓名(name)，年龄(age)，语文成绩(yuwen)，
 * 数学成绩(shuxue)，班级(banji)(所有的学生都是尊亨无
 * 忧班级)
 * ②定义学习的方法(study)
 * ③创一个测试类，并完成如下内容:
 * 创建两个学生对象张三和李四，通过成员方法(study)将学生信息打印到控制台上。(格式如下)
 * 张三，18岁，语文成绩:98，数学成绩:90，班级:尊享无忧
 * 好好学习，天天向上
 * 张三，19岁，语文成绩:98，数学成绩:90，班级:尊享无忧
 * 好好学习，天天向上
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student.setGrand("尊享无忧");
                ArrayList<Student> students=new ArrayList<>();
                students.add(new Student("张三",18,98,90));
                students.add(new Student("李四",19,98,90));
                Util u=new Util(students);
                u.show();
            }
    }
