package com.Encounter.d3_abstract;

/**
 * @author Encounter
 * @date 2024/6/18 19:21
 */
public abstract class A
    {
        private String name;
        static String schoolName;

        public A()
            {
            }

        //抽象方法，必须有abstract修饰，只有方法签名，没有方法体
        public abstract void test();

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }
    }
