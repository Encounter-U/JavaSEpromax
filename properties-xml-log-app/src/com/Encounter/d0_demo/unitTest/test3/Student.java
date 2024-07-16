package com.Encounter.d0_demo.unitTest.test3;

/**
 * @author Encounter
 * @date 2024/7/13 21:13<p/>
 */
public class Student
    {
        private String name;
        private int age;

        public Student(String name, int age)
            {
                this.name = name;
                this.age = age;
            }

        public Student()
            {
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
    }
