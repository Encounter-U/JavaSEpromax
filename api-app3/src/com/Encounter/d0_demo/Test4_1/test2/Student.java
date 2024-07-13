package com.Encounter.d0_demo.Test4_1.test2;

/**
 * @author Encounter
 * @date 2024/6/23 13:42
 */
public class Student
    {
        private String name;
        private int age;

        public Student(String name, int age)
            {
                if (age > 18 && age < 25)
                    this.name = name;
                else
                    throw new RuntimeException("年龄有误");
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
                if (age > 18 && age < 25)
                    this.name = name;
                else
                    throw new RuntimeException("年龄有误");
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
