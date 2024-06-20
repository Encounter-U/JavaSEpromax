package com.Encounter.d13_extends_visit;

/**
 * @author Encounter
 * @date 2024/6/18 12:24
 */

/**
 * 掌握子类中访问其他成员的特点：就近原则
 */
public class Test
    {
        public static void main(String[] args)
            {
                Z z = new Z();
                z.showName();
                z.showMethod();
            }
    }
