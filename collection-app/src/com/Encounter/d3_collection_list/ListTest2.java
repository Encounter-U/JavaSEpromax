package com.Encounter.d3_collection_list;

/**
 * @author Encounter
 * @date 2024/6/25 13:04
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * list遍历方式
 * 1.for循环
 * 2.迭代器
 * 3.foreach
 * 4.JDK1.8开始之后的Lambda表达式
 */
public class ListTest2
    {
        public static void main(String[] args)
            {
                List<String> list = new ArrayList<>();
                list.add("路明非");
                list.add("楚子航");
                list.add("夏弥");

                //1.for循环
                for (int i = 0; i < list.size(); i++)
                    {
                        System.out.println(list.get(i));
                    }

                //2.迭代器
                Iterator<String> it = list.iterator();
                while (it.hasNext())
                    {
                        System.out.println(it.next());
                    }
                //3.增强for循环(foreach遍历)
                for (String string : list)
                    {
                        System.out.println(string);
                    }

                //4.JDK1.8开始之后的Lambda表达式
                list.forEach(System.out::println);

            }
    }
