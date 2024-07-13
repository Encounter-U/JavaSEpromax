package com.Encounter.d0_demo.test5_4.educationalSystem;

import java.util.HashSet;

/**
 * @author Encounter
 * @date 2024/6/26 20:45
 */
public class Student
    {
        private HashSet<String> lessons;
        private String name;

        public Student(HashSet<String> lessons, String name)
            {
                this.lessons = lessons;
                this.name = name;
            }

        public Student()
            {
            }

        public HashSet<String> getLessons()
            {
                return lessons;
            }

        public void setLessons(HashSet<String> lessons)
            {
                this.lessons = lessons;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }
    }
