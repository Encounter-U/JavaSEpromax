package com.Encounter.d1_parameter;

/**
 * @author Encounter
 * @date 2024/6/26 18:06
 */

import java.util.Arrays;

/**
 * 认识可变参数，掌握其作用
 */
public class ParamTest
    {
        public static void main(String[] args)
            {
                //特点
                test();//不传数据
                test(10);//传一个
                test(10,20,30);//传多个
                test(new int[]{10,20,30});//传个数组
            }


        //注意事项1：一个形参列表中只能有一个可变参数
        //注意事项2：可变参数必须放在形参列表的最后面
        //public static void test(int age,int...nums)
        public static void test(int...nums)
            {
                //可变参数在方法内部本质就是一个数组
                System.out.println(nums.length);
                System.out.println(Arrays.toString(nums));
                System.out.println("============================");
            }
    }
