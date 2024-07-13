package com.Encounter.demo.hotel;

/**
 * @author Encounter
 * @date 2024/6/19 17:06
 */
public class Waiter extends Employee implements Service
    {
        public Waiter()
            {
            }

        public Waiter(String name, int id)
            {
                super(name, id);
            }

        @Override
        public void vip()
            {
                System.out.println(getName()+"嘘寒问暖");
            }

        public void ordinaryService()
            {
                System.out.println("服务员上菜");
                vip();
            }
    }
