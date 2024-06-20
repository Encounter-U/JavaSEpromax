package com.Encounter.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/19 14:15
 */
public class StudentManager
    {
        private ArrayList<Student> students = new ArrayList<>();
        private StudentOperator studentOperatorImpl=new StudentOperatorImpl1();

        public StudentManager()
            {
            }

        public StudentManager(ArrayList<Student> students)
            {
                this.students = students;
            }

        public void printInfo()
            {
                studentOperatorImpl.printInfo(students);
            }

        public void printAveScore()
            {
                studentOperatorImpl.printAveScore(students);
            }

    }
