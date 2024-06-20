package com.Encounter.demo.animal;

/**
 * @author Encounter
 * @date 2024/6/18 17:38
 */
public class Dog extends Animal
    {
        @Override
        public void eat()
            {
                super.eat();
            }

        public Dog()
            {
            }

        public Dog(int age)
            {
                super("柴犬", age);
            }
    }
