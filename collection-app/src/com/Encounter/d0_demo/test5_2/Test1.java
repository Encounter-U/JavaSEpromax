package com.Encounter.d0_demo.test5_2;

/**
 * @author Encounter
 * @date 2024/6/25 13:04
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 创建一个ArrayList集合，并使用以下方式完成遍历
 * ①向其中添加多个字符串元素
 * ②使用for循环遍历集合
 * ③使用迭代器遍历集合并且演示迭代器可以删除元素
 * ④使用foreach循环遍历
 * ⑤使用Lambda表达式遍历，并打印元素长度
 */
public class Test1
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
                System.out.println("=========================");

                //2.迭代器
                Iterator<String> it = list.iterator();
                it.next();
                it.remove();
                while (it.hasNext())
                    {
                        System.out.println(it.next());
                    }
                System.out.println("===========================");

                //3.增强for循环(foreach遍历)
                for (String string : list)
                    {
                        System.out.println(string);
                    }
                System.out.println("===========================");

                //4.JDK1.8开始之后的Lambda表达式
                list.forEach(string -> System.out.println(string+":"+string.length()));

            }
    }
