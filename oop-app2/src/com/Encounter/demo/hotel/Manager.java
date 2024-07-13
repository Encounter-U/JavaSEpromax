package com.Encounter.demo.hotel;

/**
 * @author Encounter
 * @date 2024/6/19 17:07
 */
public class Manager extends Employee
    {
        public Manager()
            {
            }

        public Manager(String name, int id)
            {
                super(name, id);
            }

        public void ordinaryService()
            {
                System.out.println("经理管理员工");
            }
    }
