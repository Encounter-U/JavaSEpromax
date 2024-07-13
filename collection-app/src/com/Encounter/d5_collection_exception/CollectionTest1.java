package com.Encounter.d5_collection_exception;

/**
 * @author Encounter
 * @date 2024/6/26 17:41
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 目标：理解集合的并发修改异常问题并解决
 */
public class CollectionTest1
    {
        public static void main(String[] args)
            {
                List<String> list = new ArrayList<>();
                list.add("路明非");
                list.add("昂热非");
                list.add("楚子航");
                list.add("夏弥");
                list.add("凯撒非");
                list.add("陈墨瞳非");
                list.add("零");
                list.add("上杉绘梨衣");
                System.out.println(list);

                //需求：找出集合中全部带“非”的并删除
                /*Iterator<String> it = list.iterator();
                while (it.hasNext())
                    {
                        String name = it.next();
                        if (name.contains("非"))
                            list.remove(name);//并发修改异常
                    }*/

                //使用for循环
                /*for (int i = 0; i < list.size(); i++)
                    {
                        String name = list.get(i);
                        if (name.contains("非"))
                            {
                                list.remove(name);
                                i--;
                            }
                    }*/

                //需求：找出集合中全部带“非”的并删除
                Iterator<String> it = list.iterator();
                while (it.hasNext())
                    {
                        String name = it.next();
                        if (name.contains("非"))
                            {
                                //list.remove(name);//并发修改异常
                                it.remove();//删除迭代器当前遍历到的数据，每删除一个数据后，相当于在底层做了i--
                            }
                    }

                //使用增强for循环遍历集合并删除数据，无法解决bug，这就是迭代器的简化写法，因为拿不到迭代器对象，所以无法解决
                /*for (String name : list)
                    {
                        if (name.contains("非"))
                            list.remove(name);
                    }*/

                /*list.forEach(name ->
                    {//看源码这就是在用增强for循环
                        if (name.contains("非"))
                            list.remove(name);
                    });*/

                System.out.println(list);
            }
    }
