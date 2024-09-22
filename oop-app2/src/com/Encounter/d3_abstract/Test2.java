package com.Encounter.d3_abstract;

/**
 * @author Encounter
 * @date 2024/6/18 19:35
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Cat c=new Cat();
                c.behavior();
                Dog d=new Dog();
                d.behavior();
                Animal a=new Cat();
                a.setName("猫");
                a.behavior();
            }
    }
