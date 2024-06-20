package com.Encounter.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/19 14:30
 */
public class StudentOperatorImpl2 implements StudentOperator
    {
        @Override
        public void printInfo(ArrayList<Student> students)
            {
                int count = 0;
                System.out.println("全班详情如下：");
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student = students.get(i);
                        System.out.println("姓名：" + student.getName());
                        System.out.println("性别：" + student.getSex());
                        System.out.println("成绩：" + student.getScore());
                        System.out.println("==========================");
                        if (student.getSex() == '男')
                            count++;
                    }
                System.out.println("男生总人数：" + count);
                System.out.println("女生总人数：" + (students.size() - count));
            }

        @Override
        public void printAveScore(ArrayList<Student> students)
            {
                int sum = 0;
                int max = students.get(0).getScore();
                int min = students.get(0).getScore();
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student = students.get(i);
                        sum += student.getScore();
                        if (student.getScore() > max)
                            max = student.getScore();
                        if (student.getScore() < min)
                            min = student.getScore();
                    }
                System.out.println("最高分为：" + max);
                System.out.println("最低分为：" + min);
                System.out.println("全班的平均成绩为：" + (sum - max - min) / (students.size() - 2));
            }
    }
