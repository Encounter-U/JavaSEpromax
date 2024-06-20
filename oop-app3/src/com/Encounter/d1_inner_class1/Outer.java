package com.Encounter.d1_inner_class1;

/**
 * @author Encounter
 * @date 2024/6/19 17:39
 */
public class Outer
    {
        private static String a;
        private int age = 66;

        public void test2()
            {
                System.out.println(age);
                System.out.println(a);
            }

        //成员内部类
        public class Inner
            {
                public static String schoolName;//JDK16开始才支持定义
                private String name;
                private int age=77;

                public void test()
                    {
                        System.out.println("inner");
                        System.out.println(age);
                        System.out.println(a);

                        int age = 88;
                        System.out.println(age);
                        System.out.println(this.age);
                        System.out.println(Outer.this.age);
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
    }
