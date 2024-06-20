package com.Encounter.demo.hotel;

/**
 * @author Encounter
 * @date 2024/6/19 17:06
 */
public class Waiter extends Employee implements Service
    {
        @Override
        public void vip()
            {
                System.out.println("嘘寒问暖");
            }

        public Waiter()
            {
            }

        public Waiter(String name, int id)
            {
                super(name, id);
            }
    }
