package com.Encounter.demo.person;

/**
 * @author Encounter
 * @date 2024/6/18 16:15
 */
public class Student extends Person
    {
        public Student(String name, int age, String address)
            {
                super(name, age, address);
            }

        public Student()
            {
            }

        @Override
        public String info()
            {
                return "我是学生：" + super.info();
            }
    }
