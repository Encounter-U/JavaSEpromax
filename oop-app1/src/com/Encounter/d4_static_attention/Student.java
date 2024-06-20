package com.Encounter.d4_static_attention;

/**
 * @author Encounter
 * @date 2024/6/17 19:27
 */
public class Student
    {
        static String schoolName;
        double score;

        //1.类方法中可以直接访问类的成员，不可以直接访问实例成员
        public static void printHelloWorld()
            {
                //同一个类中，访问类成员，可以省略类名不写
                schoolName = "路明非";
                printHello();

                //                System.out.println(score);//报错
                //                printPass();//报错

//                System.out.println(this);//报错
            }

        //类方法
        private static void printHello()
            {

            }

        //2.实例方法中既可以直接访问类成员，也可以直接访问实例成员
        //实例方法
        //3.实例方法中可以出现this关键字，类方法中不可以出现this关键字
        public void printPass()
            {
                schoolName = "路明非";
                printHello();

                System.out.println(score);

                print();

                System.out.println(this);
            }

        //实例方法
        public void print()
            {}
    }
