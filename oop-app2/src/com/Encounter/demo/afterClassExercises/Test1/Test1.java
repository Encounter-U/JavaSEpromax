package com.Encounter.demo.afterClassExercises.Test1;

interface Inter
    {
        int num = 10;

        void method();
    }

/**
 * @author Encounter
 * @date 2024/6/19 15:35
 */

/**
 * 请对下列代码进行补充，打印出接口中的变量num,随后调用method方法，要求程序与最终运行结果吻合
 * (注意:打印num变量，不允许创建对象调用)
 */
public class Test1
    {
        public static void main(String[] args)
            {
                System.out.println(Inter.num);
                Inter i = new A();
                i.method();
            }
    }

class A implements Inter
    {

        @Override
        public void method()
            {

            }
    }