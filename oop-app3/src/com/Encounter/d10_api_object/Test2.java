package com.Encounter.d10_api_object;

/**
 * @author Encounter
 * @date 2024/6/20 20:00
 */

/**
 * 掌握Object类提供的对象克隆的方法
 * 1.protected Object clone():对象克隆
 */
public class Test2
    {
        public static void main(String[] args) throws CloneNotSupportedException
            {
                User u1 = new User(1, "LuMingFei", "dragon", new double[]{99.0, 10.0});
                //引用类型只拷贝地址值
                User u2 = (User) u1.clone();
                System.out.println(u1);
                System.out.println(u2);
            }
    }
