package com.Encounter.d5_arrays;

/**
 * @author Encounter
 * @date 2024/6/22 10:01
 */
public class Student implements Comparable<Student>
    {
        private String name;
        private double height;
        private int age;

        public Student(String name, double height, int age)
            {
                this.name = name;
                this.height = height;
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

        public double getHeight()
            {
                return height;
            }

        public void setHeight(double height)
            {
                this.height = height;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        //制定比较规则
        @Override
        public int compareTo(Student o)
            {
                //约定：左大于右，返回正整数
                //右大于左，返回负整数
                //相等，返回0
                if (this.age > o.age)
                    return 1;
                else if (this.age < o.age)
                    return -1;
                else
                    return 0;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", height=" + height +
                        ", age=" + age +
                        '}';
            }
    }
