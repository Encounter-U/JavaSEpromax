package com.Encounter.d0_demo.test5_5.examOS;

import java.util.Objects;

/**
 * @author Encounter
 * @date 2024/6/28 20:54
 */
public class Student
    {
        private String name;

        public Student()
            {
            }

        public Student(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        @Override
        public String toString()
            {
                return "Student{" +
                        "name='" + name + '\'' +
                        '}';
            }

        @Override
        public boolean equals(Object o)
            {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Student student = (Student) o;
                return Objects.equals(name, student.name);
            }

        @Override
        public int hashCode()
            {
                return Objects.hash(name);
            }
    }
