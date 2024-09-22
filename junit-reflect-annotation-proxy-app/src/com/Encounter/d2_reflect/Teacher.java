package com.Encounter.d2_reflect;

/**
 * @author Encounter
 * @date 2024/07/19 17:02<br/>
 */
public class Teacher
    {
        private String name;
        private double salary;
        
        public Teacher()
            {
            }
        
        public Teacher(String name, double salary)
            {
                this.name = name;
                this.salary = salary;
            }
        
        public String getName()
            {
                return name;
            }
        
        public void setName(String name)
            {
                this.name = name;
            }
        
        public double getSalary()
            {
                return salary;
            }
        
        public void setSalary(double salary)
            {
                this.salary = salary;
            }
    }
