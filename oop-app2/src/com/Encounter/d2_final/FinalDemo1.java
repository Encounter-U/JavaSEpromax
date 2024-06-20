package com.Encounter.d2_final;

/**
 * @author Encounter
 * @date 2024/6/18 18:55
 */

/**
 * 掌握final关键字的基本作用
 */
public class FinalDemo1
    {
        public static void main(String[] args)
            {
                //变量有几种？  局部变量  成员变量（类变量，实例变量）
                final double a = 3.14;
                //                a=5;//第二次赋值

                E e = new E();
//                e.name = "楚子航";
//                E.schoolName="哥伦比亚大学";

                //注意事项
                final int a2=10;
//                a2=23;

                final int[] arr={10,20,30};
                //arr=null;//引用型变量储存的地址值无法更改
                arr[1]=222;//数组内容可以改变
                System.out.println(arr[1]);
            }

        public static void pay(final double a)
            {
                //a=0.9;//第二次赋值
            }
    }

class E
    {
        final static String schoolName="卡塞尔学院";
        final String name = "路明非";//必须要初始化
    }


//final的作用：修饰类，类就不能被继承了
//final class A{}
//class B extends A{}

class C
    {
        //final修饰方法，方法不能被重写了
        public final void test()
            {

            }
    }

class D extends C
    {
    /*@Override
    public void test()
        {
            super.test();
        }*/
    }