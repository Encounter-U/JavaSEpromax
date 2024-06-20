package com.Encounter.d1_staticdemo;

/**
 * @author Encounter
 * @date 2024/6/17 18:57
 */
public class User
    {
        public static int number;
        public User()
            {
                //User.number++;
                //在同一个类中，访问自己类的类变量，才可以省略类名不写
                number++;
            }
    }
