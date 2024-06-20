package com.Encounter.demo.animal;

/**
 * @author Encounter
 * @date 2024/6/18 17:33
 */
public class Animal
    {
        private String type;
        private int age;

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

        public void eat()
            {
                System.out.println(age + "岁大的" + type + "正在吃东西");
            }
    }
