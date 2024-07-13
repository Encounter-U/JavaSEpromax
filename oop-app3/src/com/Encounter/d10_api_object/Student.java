package com.Encounter.d10_api_object;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/20 19:41
 */
public class Student
    {
        private String name;
        private int age;

        public Student()
            {
            }

        public Student(String name, int age)
            {
                this.name = name;
                this.age = age;
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

        //比较两个对象内容
        //比较者：s2==this
        //被比较者：s1==o
        @Override
        public boolean equals(Object o)
            {
                //判断二者地址是否一样
                if (this == o)
                    return true;
                //判断o为null直接返回false或者比较者与被比较者类型不同，返回false
                if (o == null || getClass() != o.getClass())
                    return false;
                //o不是null且为学生类型对象，开始比较内容
                Student student = (Student) o;
                return age == student.age && Objects.equals(name, student.name);
            }

    }
