package com.Encounter.d8_extends_application;

/**
 * @author Encounter
 * @date 2024/6/17 21:37
 */

/**
 * 搞清楚继承的好处
 */
public class Test
    {
        public static void main(String[] args)
            {
                Teacher t = new Teacher();
                t.setName("路明非");
                t.setSkill("龙化");
                System.out.println(t.getName());
                System.out.println(t.getSkill());
                t.printInfo();
            }
    }
