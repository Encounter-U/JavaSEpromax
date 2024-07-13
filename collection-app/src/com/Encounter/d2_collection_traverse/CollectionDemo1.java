package com.Encounter.d2_collection_traverse;

/**
 * @author Encounter
 * @date 2024/6/24 14:13
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 目标：Collection集合的遍历方式一：使用迭代器遍历
 */
public class CollectionDemo1
    {
        public static void main(String[] args)
            {
                Collection<String> c=new ArrayList<>();
                c.add("路明非");
                c.add("楚子航");
                c.add("夏弥");
                c.add("上杉绘梨衣");
                System.out.println(c);

                //使用迭代器遍历集合
                //1.从集合对象中获取迭代器对象
                Iterator<String> it=c.iterator();
                /*System.out.println(it.next());
                System.out.println(it.next());
                System.out.println(it.next());
                System.out.println(it.next());*/
                //System.out.println(it.next());//出现异常

                //2.使用循环结合迭代器遍历集合
                while (it.hasNext())
                    {
                        String ele=it.next();
                        System.out.println(ele);
                    }
            }
    }
