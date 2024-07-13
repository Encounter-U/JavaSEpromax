package com.Encounter.d0_demo.hotel;

/**
 * @author Encounter
 * @date 2024/6/19 17:02
 */
public abstract class Employee
    {
        private String name;
        private int id;

        public Employee(String name, int id)
            {
                this.name = name;
                this.id = id;
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

        public int getId()
            {
                return id;
            }

        public void setId(int id)
            {
                this.id = id;
            }
    }
