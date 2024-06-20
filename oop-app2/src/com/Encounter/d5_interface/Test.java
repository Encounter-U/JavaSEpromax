package com.Encounter.d5_interface;

/**
 * @author Encounter
 * @date 2024/6/19 12:18
 */

import javax.security.sasl.SaslClient;

/**
 * 认识接口
 */
public class Test implements A
    {
        public static void main(String[] args)
            {
                System.out.println(SCHOOL_NAME);

                //不能创建对象
//                A a=new A();
            }

        @Override
        public void test()
            {
                System.out.println("实现了test");
            }
    }
