package com.Encounter.d4_collection_set;

/**
 * @author Encounter
 * @date 2024/6/26 13:13
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：整体了解一下Set系列集合的特点
 */
public class SetTest1
    {
        public static void main(String[] args)
            {
                //1.创建一个Set集合的对象
                //创建一个HashSet的集合对象，一行经典代码   HashSet:无序不重复  无索引
                //Set<Integer> set=new HashSet<>();
                //有序 不重复 无索引
                //Set<Integer> set=new LinkedHashSet<>();
                //可排序 不重复 无索引（默认升序）
                Set<Integer> set=new TreeSet<>();
                set.add(1);
                set.add(2);
                set.add(1);
                set.add(3);
                set.add(5);
                set.add(10);
                set.add(9);
                set.add(8);
                set.add(7);
                System.out.println(set);

            }
    }
