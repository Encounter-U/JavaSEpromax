package com.Encounter.demo.work;

/**
 * @author Encounter
 * @date 2024/6/18 14:11
 */
public class Employee
    {
        private String name;
        private String id;
        private double salary;

        public Employee(String name, String id, double salary)
            {
                this.name = name;
                this.id = id;
                this.salary = salary;
            }

        public Employee()
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

        public String getId()
            {
                return id;
            }

        public void setId(String id)
            {
                this.id = id;
            }

        public double getSalary()
            {
                return salary;
            }

        public void setSalary(double salary)
            {
                this.salary = salary;
            }

        public String work()
            {
                return name + "，工号为：" + id + "，工资为：" + salary;
            }
    }
