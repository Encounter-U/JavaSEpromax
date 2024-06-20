package com.Encounter.demo.hotel;

/**
 * @author Encounter
 * @date 2024/6/19 17:05
 */
public class Cooker extends Employee implements Service
    {
        public Cooker(String name, int id)
            {
                super(name, id);
            }

        public Cooker()
            {
            }

        @Override
        public void vip()
            {
                System.out.println("加菜");
            }
    }
