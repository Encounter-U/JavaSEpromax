package com.Encounter.demo.Teacher;

/**
 * @author Encounter
 * @date 2024/6/18 14:02
 */
public class WorkTeacher extends Teacher
    {
        public WorkTeacher(String name, int age)
            {
                super(name, age);
            }

        public WorkTeacher()
            {
            }

        @Override
        public void teach()
            {
                super.teach();
                System.out.println("就业班老师讲JavaEE");
            }
    }
