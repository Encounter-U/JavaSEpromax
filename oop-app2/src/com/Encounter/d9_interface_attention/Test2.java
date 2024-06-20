package com.Encounter.d9_interface_attention;

/**
 * @author Encounter
 * @date 2024/6/19 15:15
 */

/**
 * 了解接口的几点注意事项<br/>
 * 1.一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承<br/>
 * 2.一个类实现多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承<br/>
 * 3.一个类继承了父类，又同时实现了接口，父类和接口中有同名的默认方法，实现类会优先使用父类的<br/>
 * 4.一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Zi zi = new Zi();
                zi.run();
            }
    }

//1.
interface I
    {
        void test1();
    }

interface J
    {
        String test1();
    }

/*interface K extends I,J
    {
    }*/

interface IT
    {
        default void run()
            {
                System.out.println("接口");
            }
    }

//2.
/*
class E implements I,J{

}*/
//3.
class Fu
    {
        public void run()
            {
                System.out.println("父类");
            }
    }

class Zi extends Fu implements IT
    {
    }

//4.
interface IT1
    {
        default void test()
            {
                System.out.println("test1");
            }
    }

interface IT2
    {
        default void test()
            {
                System.out.println("test2");
            }
    }

class N implements IT1, IT2
    {
        @Override
        public void test()
            {
                IT1.super.test();
            }
    }