package com.Encounter.d13_extends_visit;

/**
 * @author Encounter
 * @date 2024/6/18 12:24
 */
public class Z extends F
    {
        String name = "子类名称";

        public void showName()
            {
                String name = "局部名称";
                System.out.println(name);
                System.out.println(this.name);
                System.out.println(super.name);//父类
            }

        @Override
        public void print1()
            {
                System.out.println("子类的print1方法执行了");
            }

        public void showMethod()
            {
                print1();//子类的print1方法
                super.print1();//父类
            }
    }
