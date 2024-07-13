package com.Encounter.d0_demo.print;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Encounter
 * @date 2024/6/24 16:42
 */

/**
 * 编写一个程序，创建一个ArrayList集合，完成以下功能
 * ①向其中添加一些字符串元素
 * ②使用迭代器遍历集合并输出其中所有元素
 * ③使用lambda表达式遍历集合并输出其中所有元素
 */
public class Test1
    {
        public static void main(String[] args)
            {
                ArrayList<String> s = new ArrayList<>();
                s.add("路明非");
                s.add("楚子航");
                s.add("夏弥");
                s.add("上杉绘梨衣");

                //迭代器
                Iterator<String> it = s.iterator();
                while (it.hasNext())
                    {
                        System.out.println(it.next());
                    }

                //Lambda表达式
                s.forEach(System.out::println);
            }
    }
