package com.Encounter.demo.afterClassExercises.Test3;

/**
 * @author Encounter
 * @date 2024/6/19 15:48
 */

public class Impl
    {
        /*
            请在main方法中通过多态创建对象，随后使用对象，使得程序符合最终运行结果
         */
        public static void main(String[] args)
            {
                Fu zi = new Zi();
                System.out.println(zi.num);
                zi.method();
                ((Zi) zi).show();
            }
    }

class Fu
    {
        int num = 10;

        public void method()
            {
                System.out.println("父类的method方法");
            }
    }

class Zi extends Fu
    {
        int num = 20;

        public void method()
            {
                System.out.println("子类的method方法");
            }

        public void show()
            {
                System.out.println("子类的show方法");
            }
    }