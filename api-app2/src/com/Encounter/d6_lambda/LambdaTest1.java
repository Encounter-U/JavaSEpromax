package com.Encounter.d6_lambda;

/**
 * @author Encounter
 * @date 2024/6/22 10:57
 */
/**
 * 认识Lambda表达式
 */
public class LambdaTest1
    {
        public static void main(String[] args)
            {
                /*Animal a = new Animal()
                    {
                        @Override
                        public void run()
                            {
                                System.out.println("跑起来");
                            }
                    };
                a.run();*/
              /*  Swimming a = new Swimming()
                    {
                        @Override
                        public void swim()
                            {
                                System.out.println("游泳");
                            }
                    };*/

                //Lambda表达式只能简化函数式接口的匿名内部类：有且仅有一个抽象方法的接口   或有@FunctionalInterface注解
                //错误示范
                //Animal a = () -> System.out.println("跑起来");
                //正确用法
                Swimming a = () -> System.out.println("游泳");
                a.swim();

            }
    }

interface Swimming
    {
        void swim();
    }

abstract class Animal
    {
        public abstract void run();
    }
