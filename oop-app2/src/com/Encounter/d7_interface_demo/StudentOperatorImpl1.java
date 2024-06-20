package com.Encounter.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/19 14:27
 */
public class StudentOperatorImpl1 implements StudentOperator
    {
        @Override
        public void printInfo(ArrayList<Student> students)
            {
                System.out.println("全班详情如下：");
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student = students.get(i);
                        System.out.println("姓名：" + student.getName());
                        System.out.println("性别：" + student.getSex());
                        System.out.println("成绩：" + student.getScore());
                        System.out.println("==========================");
                    }
            }

        @Override
        public void printAveScore(ArrayList<Student> students)
            {
                int sum = 0;
                for (int i = 0; i < students.size(); i++)
                    {
                        sum += students.get(i).getScore();
                    }
                System.out.println("全班的平均成绩为：" + sum / students.size());
            }
    }
