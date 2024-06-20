package com.Encounter.d1_polymorphism;

/**
 * @author Encounter
 * @date 2024/6/18 18:27
 */
public class Teacher extends People
    {
        String name= "老师";
        @Override
        public void run()
            {
                System.out.println("老师跑得慢");
            }

        public void teach()
            {
                System.out.println("老师教Java");
            }
    }
