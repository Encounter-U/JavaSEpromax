package com.Encounter.d0_demo.hotel;

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
                System.out.println(getName()+"加菜");
            }

        public void ordinaryService()
            {
                System.out.println("厨师做饭");
                vip();
            }
    }
