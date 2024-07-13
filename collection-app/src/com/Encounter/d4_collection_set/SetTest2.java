package com.Encounter.d4_collection_set;

/**
 * @author Encounter
 * @date 2024/6/26 13:13
 */

import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：了解一下哈希值
 * Java中的所有对象，都可以调用Object类提供的HashCode方法，返回该对象自己的哈希值
 *           public int hashCode()：返回对象的哈希值
 * 同一个对象多次调用返回的哈希值相同
 * 不同的对象，他们的哈希值一般不同，但也有可能会相同（哈希碰撞）
 */
public class SetTest2
    {
        public static void main(String[] args)
            {
                Student s1=new Student("路明非",22,178);
                Student s2=new Student("楚子航",23,180);
                System.out.println(s1.hashCode());
                System.out.println(s1.hashCode());
                System.out.println(s2.hashCode());
                System.out.println(s2.hashCode());

                String str1 = new String("abc");
                String str2 = new String("acD");
                System.out.println(str1.hashCode());
                System.out.println(str2.hashCode());
            }
    }
