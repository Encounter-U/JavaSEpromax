package com.Encounter.d3_inner_class3;

/**
 * @author Encounter
 * @date 2024/6/19 18:20
 */

/**+
 * 认识匿名内部类，并掌握其作用
 */
public class Test
    {
        public static void main(String[] args)
            {
                /*Animal a=new Cat();
                a.cry();*/

                //1.把这个匿名内部类编译为一个子类，然后会立即创建一个子类对象进来
                Animal a = new Animal()
                    {
                        @Override
                        public void cry()
                            {
                                System.out.println("喵喵喵");
                            }
                    };
                a.cry();
            }
    }
/*class Cat extends Animal{
    @Override
    public void cry()
        {
            System.out.println("喵喵喵");
        }
}*/

abstract class Animal{
    public abstract void cry();
}