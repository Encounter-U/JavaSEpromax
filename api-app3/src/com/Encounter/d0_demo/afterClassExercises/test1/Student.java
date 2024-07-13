package com.Encounter.d0_demo.afterClassExercises.test1;

/**
 * @author Encounter
 * @date 2024/6/22 16:29
 */
public class Student
    {
        private String name;
        private Integer age;

        public Student(String name, Integer age)
            {
                this.name = name;
                this.age = age;
            }

        public Student()
            {
            }

        public static int compareByAge(Student s1, Student s2)
            {
                return s1.age.compareTo(s2.age);
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public Integer getAge()
            {
                return age;
            }

        public void setAge(Integer age)
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
