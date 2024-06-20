package com.Encounter.d2_inner_class2;

/**
 * @author Encounter
 * @date 2024/6/19 18:11
 */
public class Outer
    {
        private int age;
        public static String schoolName;
        public static class Inner
            {
                public static int a;
                private String name;

                public void test()
                    {
                        System.out.println(schoolName);
//                        System.out.println(age);
                    }

                public String getName()
                    {
                        return name;
                    }

                public void setName(String name)
                    {
                        this.name = name;
                    }
            }
        public static void test2()
            {
//                System.out.println(age);
                System.out.println(schoolName);
            }
    }
