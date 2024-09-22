package com.Encounter.d2_reflect;

/**
 * @author Encounter
 * @date 2024/07/19 14:25<br/>
 */
public class Cat
    {
        public final static String COUNTRY = "China";
        public int a;
        private String name;
        private int age;
        
        private Cat(String name, int age)
            {
                System.out.println("有参构造器执行了");
                this.name = name;
                this.age = age;
            }
        
        public Cat()
            {
                System.out.println("无参构造器执行了");
            }
        
        public String getName()
            {
                return name;
            }
        
        public void setName(String name)
            {
                this.name = name;
            }
        
        public int getAge()
            {
                return age;
            }
        
        public void setAge(int age)
            {
                this.age = age;
            }
        
        private void run()
            {
                System.out.println("Dragon can fly!!!");
            }
        
        public void eat()
            {
                System.out.println("The mourning of the World Tree");
            }
        
        private void eat(String name)
            {
                System.out.println("Dragon want to eat " + name);
            }
    }
