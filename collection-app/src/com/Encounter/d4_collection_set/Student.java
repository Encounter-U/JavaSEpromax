package com.Encounter.d4_collection_set;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/26 13:26
 */
public class Student implements Comparable<Student>
    {
        private String name;
        private int age;
        private double height;

        public Student(String name, int age, double height)
            {
                this.name = name;
                this.age = age;
                this.height = height;
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

        public double getHeight()
            {
                return height;
            }

        public void setHeight(double height)
            {
                this.height = height;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", height=" + height +
                        '}';
            }

        //只要两个对象内容一样就返回true
        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Student student = (Student) o;
                return age == student.age && Double.compare(height, student.height) == 0 && Objects.equals(name, student.name);
            }

        //只要两个对象内容一样，返回的哈希值就是一样的
        @Override
        public int hashCode()
            {
                return Objects.hash(name, age, height);
            }

        @Override
        public int compareTo(Student o)
            {
                //年龄升序，年龄重复的不存
                return this.age - o.age;
            }
    }
