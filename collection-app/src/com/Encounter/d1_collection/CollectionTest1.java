package com.Encounter.d1_collection;

/**
 * @author Encounter
 * @date 2024/6/23 16:07
 */

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 认识Collection体系的特点
 */
public class CollectionTest1
    {
        public static void main(String[] args)
            {
                //简单确认一下Collection集合的特点
                ArrayList<String> list=new ArrayList<>();//有序，可重复，有索引
                list.add("java1");
                list.add("java2");
                list.add("java1");
                list.add("java1");
                System.out.println(list);

                HashSet<String> set=new HashSet<>();//无序，不重复，无索引
                set.add("java1");
                set.add("java2");
                set.add("java1");
                set.add("java2");
                set.add("java3");
                System.out.println(set);
            }
    }
