package com.Encounter.d5_generics;

/**
 * @author Encounter
 * @date 2024/6/20 13:39
 */

import java.util.ArrayList;

/**
 * 认识泛型
 */
public class Test1
    {
        public static void main(String[] args)
            {
                ArrayList list=new ArrayList<>();
                list.add("java1");
                list.add("java2");
                list.add("java3");
                list.add(new Cat());

                for (int i = 0; i < list.size(); i++)
                    {
                        System.out.println(list.get(i));
                    }

                System.out.println("=======================");

                ArrayList<String> l1=new ArrayList<>();
                l1.add("java");
//                l1.add(new Cat());
                for (int i = 0; i < l1.size(); i++)
                    {
                        System.out.println(l1.get(i));
                    }
            }
    }


class Cat{}
