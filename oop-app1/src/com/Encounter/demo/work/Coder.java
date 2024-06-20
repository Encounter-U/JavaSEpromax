package com.Encounter.demo.work;

/**
 * @author Encounter
 * @date 2024/6/18 14:11
 */
public class Coder extends Employee
    {
        public Coder()
            {
            }

        public Coder(String name, String id, double salary)
            {
                super(name, id, salary);
            }

        @Override
        public String work()
            {
                return super.work() + "，的程序员正在敲代码";
            }
    }
