package com.Encounter.demo.person;

/**
 * @author Encounter
 * @date 2024/6/18 16:18
 */
public class Teacher extends Person
    {
        @Override
        public String info()
            {
                return "我是老师："+super.info();
            }

        public Teacher(String name, int age, String address)
            {
                super(name, age, address);
            }

        public Teacher()
            {
            }
    }
