package com.Encounter.d12_integer;

/**
 * @author Encounter
 * @date 2024/6/20 20:32
 */

import java.util.ArrayList;

/**
 * 掌握包装类的使用
 */
public class Test
    {
        public static void main(String[] args)
            {
                //已过时，不建议使用
                //Integer a1=new Integer(12);

                System.out.println(Integer.valueOf(12));

                //自动装箱：自动把基本类型的数据转换为对象
                Integer a = 12;

                //自动拆箱
                int a2 = a;

                //泛型和集合不支持基本数据类型，只能支持使用引用数据类型
                //ArrayList<int> list=new ArrayList<int>();
                ArrayList<Integer> list = new ArrayList<>();
                list.add(12);
                list.add(13);
                int i = list.get(0);//自动拆箱
                System.out.println(i);

                System.out.println("======================");

                Integer d = 23;
                String rs1 = Integer.toString(d);
                System.out.println(rs1 + 1);

                String rs2 = d + "";
                System.out.println(rs2 + 1);

                //2.把字符串类型的数值转换成对应的基本类型（只能是字符串数值，数字）小数不能转整数
                String ageStr = "29";
                //int age = Integer.parseInt(ageStr);
                int age = Integer.valueOf(ageStr);
                System.out.println(age + 1);

                String score="99.5";
                //double scores=Double.parseDouble(score);
                double scores=Double.valueOf(score);
                System.out.println(scores+1);
            }
    }
