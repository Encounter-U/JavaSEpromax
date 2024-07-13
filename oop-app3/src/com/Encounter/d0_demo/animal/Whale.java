package com.Encounter.d0_demo.animal;

/**
 * @author Encounter
 * @date 2024/6/20 19:23
 */
public class Whale extends Animal
    {
        public Whale(String type, int age)
            {
                super(type, age);
            }

        public Whale()
            {
            }

        @Override
        public void eat()
            {
                System.out.println(getAge() + "大的" + getType() + "正在吃东西");
            }
    }
