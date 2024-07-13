package com.Encounter.d3_collection_list;

/**
 * @author Encounter
 * @date 2024/6/25 12:52
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：掌握List系列集合的特点，以及其提供的特有方法<br/>
 * 1.创建一个ArrayList集合对象（有序、可重复、有索引）<br/>
 * 2.public void add(int index, E element):在某个索引位置插入元素<br/>
 * 3.public E remove(int index):根据索引删除元素，返回被删除元素<br/>
 * 4.public E get(int index):返回集合中指定位置的元素<br/>
 * 5.public E set(int index, E element):修改所引位置处的元素，修改成功后，会返回原来的数据
 */
public class ListTest1
    {
        public static void main(String[] args)
            {
                //1.创建一个ArrayList集合对象（有序、可重复、有索引）
                List<String> list = new ArrayList<>();//一行经典代码
                list.add("java1");
                list.add("路明非");
                list.add("楚子航");
                list.add("夏弥");
                System.out.println(list);

                //2.public void add(int index, E element):在某个索引位置插入元素
                list.add(2, "上杉绘梨衣");
                System.out.println(list);

                // 3.public E remove(int index):根据索引删除元素，返回被删除元素
                System.out.println(list.remove(0));
                System.out.println(list);

                // 4.public E get(int index):返回集合中指定位置的元素
                System.out.println(list.get(2));

                // 5.public E set(int index, E element):修改所引位置处的元素，修改成功后，会返回原来的数据
                System.out.println(list.set(3, "夏弥真好"));
                System.out.println(list);

            }
    }
