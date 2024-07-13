package com.Encounter.d1_collection;

/**
 * @author Encounter
 * @date 2024/6/24 13:54
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * CollectionAPI<br/>
 * 1.public boolean add(E e):添加元素，添加成功返回true<br/>
 * 2.public void clean():清空集合的元素<br/>
 * 3.public boolean isEmpty():判断集合是否为空，为空则返回true<br/>
 * 4.public int size():获取集合的大小<br/>
 * 5.public boolean contains(Object obj):判断集合中是否包含某个元素<br/>
 * 6.public boolean remove(E e):删除某个元素：如果有多个重复元素默认删除前面的第一个<br/>
 * 7.public Object[] toArray():把集合转换为数组
 */
public class CollectionTest2API
    {
        public static void main(String[] args)
            {
                Collection<String> c = new ArrayList<>();//多态写法
                //1.public boolean add(E e):添加元素，添加成功返回true
                c.add("java1");
                c.add("java2");
                c.add("java2");
                c.add("java1");
                c.add("java3");
                System.out.println(c);

                //2.public void clean():清空集合的元素
                //c.clear();
                System.out.println(c);

                //3.public boolean isEmpty():判断集合是否为空，为空则返回true
                System.out.println(c.isEmpty());

                //4.public int size():获取集合的大小
                System.out.println(c.size());

                //5.public boolean contains(Object obj):判断集合中是否包含某个元素
                System.out.println(c.contains("java1"));
                System.out.println(c.contains("Java1"));

                //6.public boolean remove(E e):删除某个元素：如果有多个重复元素默认删除前面的第一个
                c.remove("java1");
                System.out.println(c);

                //7.public Object[] toArray():把集合转换为数组
                Object[] array = c.toArray();
                System.out.println(Arrays.toString(array));

                String[] array1 = c.toArray(new String[c.size()]);
                System.out.println(Arrays.toString(array1));

                System.out.println("================================");

                //把一个集合中的数据导入到另一个集合中去
                Collection<String> c1=new ArrayList<>();
                c1.add("java1");
                c1.add("java2");
                Collection<String> c2=new ArrayList<>();
                c2.add("java3");
                c2.add("java4");
                c1.addAll(c2);//把c2里的数据全部导入到c1
                System.out.println(c1);
                System.out.println(c2);
            }
    }
