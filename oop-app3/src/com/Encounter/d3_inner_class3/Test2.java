package com.Encounter.d3_inner_class3;

/**
 * @author Encounter
 * @date 2024/6/19 18:27
 */
public class Test2
    {
        public static void main(String[] args)
            {
                //掌握匿名内部类的使用场景
                go(new Swimming()
                    {
                        @Override
                        public void swim()
                            {
                                System.out.println("狗游泳");
                            }
                    });
            }

        //设计一个方法，可以接收swiming接口的一切实现类对象进来参加游泳比赛
        public static void go(Swimming s)
            {
                System.out.println("开始");
                s.swim();
            }
    }

//
interface Swimming
    {
        void swim();
    }
