package com.Encounter.demo.student;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/17 19:57
 */
public class Manager
    {
        private ArrayList<Student> students;

        public Manager(ArrayList<Student> students)
            {
                this.students = students;
            }

        public void show()
            {
                for (int i = 0; i < students.size(); i++)
                    {
                        Student student1 = students.get(i);
                        System.out.println(student1.getName()+"，"+student1.getAge()+"岁，生日："+student1.getBirthday());
                    }

            }
    }
