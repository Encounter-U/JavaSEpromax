package com.Encounter.d0_demo.animal;

/**
 * @author Encounter
 * @date 2024/6/20 19:25
 */
public class Dog extends Animal
    {
        public Dog(String type, int age)
            {
                super(type, age);
            }

        public Dog()
            {
            }

        @Override
        public void eat()
            {
                System.out.println(getAge()+"大的"+getType()+"正在吃东西");
            }
    }
