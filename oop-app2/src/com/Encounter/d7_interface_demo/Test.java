package com.Encounter.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/19 14:19
 */

/**
 * 需求
 * 请设计一个班级学生的信息管理模块:学生的数据有:姓名、性别、成绩
 * 功能1:要求打印出全班学生的信息;功能2:要求打印出全班学生的平均成绩。
 * 注意!以上功能的业务实现是有多套方案的，比如:
 * 第1套方案:能打印出班级全部学生的信息;能打印班级全部学生的平均分。
 * 第2套方案:能打印出班级全部学生的信息(包含男女人数);能打印班级全部学生的平均分(要求是去掉最高分、最低分)
 * 要求:系统可以支持灵活的切换这些实现方案。
 */
public class Test
    {
        public static void main(String[] args)
            {
                ArrayList<Student> students = new ArrayList<>();
                students.add(new Student("路明非", '男', 60));
                students.add(new Student("楚子航", '男', 120));
                students.add(new Student("陈墨瞳", '女', 100));
                students.add(new Student("零", '女', 120));
                students.add(new Student("上杉绘梨衣", '女', 0));
                StudentManager sm = new StudentManager(students);
                sm.printInfo();
                sm.printAveScore();
            }
    }
