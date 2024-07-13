package com.Encounter.d0_demo.animal;

/**
 * @author Encounter
 * @date 2024/6/20 19:22
 */
public abstract class Animal
    {
        String type;
        int age;

        public Animal(String type, int age)
            {
                this.type = type;
                this.age = age;
            }

        public Animal()
            {
            }

        public String getType()
            {
                return type;
            }

        public void setType(String type)
            {
                this.type = type;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        public abstract void eat();
    }
