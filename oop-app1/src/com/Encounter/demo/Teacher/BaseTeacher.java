package com.Encounter.demo.Teacher;

/**
 * @author Encounter
 * @date 2024/6/18 14:01
 */
public class BaseTeacher extends Teacher
    {
        public BaseTeacher()
            {
            }

        public BaseTeacher(String name, int age)
            {
                super(name, age);
            }

        @Override
        public void teach()
            {
                super.teach();
                System.out.println("基础班老师讲JavaSE");
            }
    }
