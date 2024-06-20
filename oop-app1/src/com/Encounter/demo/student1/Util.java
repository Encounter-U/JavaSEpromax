package com.Encounter.demo.student1;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 19:54
 */
public class Util
    {
        private ArrayList<Student> students;

        public Util(ArrayList<Student> students)
            {
                this.students = students;
            }

        public static void print()
            {
                System.out.println("好好学习，天天向上");
            }

        public void show()
            {
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student = students.get(i);
                        System.out.println(student.getName()+"，"+student.getAge()+"岁，语文成绩："+student.getChineseScore()+"，数学成绩："+student.getMathScore()+"，班级："+Student.getGrand());
                        print();
                    }
            }

    }
