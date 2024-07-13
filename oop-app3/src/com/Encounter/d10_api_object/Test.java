package com.Encounter.d10_api_object;

/**
 * @author Encounter
 * @date 2024/6/20 19:41
 */

/**
 * 掌握Object类提供的常用方法
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student s1 = new Student("路明非", 22);
                //System.out.println(s1.toString());
                System.out.println(s1);

                Student s2 = new Student("路明非", 22);
                System.out.println(s1.equals(s2));//false

            }
    }
