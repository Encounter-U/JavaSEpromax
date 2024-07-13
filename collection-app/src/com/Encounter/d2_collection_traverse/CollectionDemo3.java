package com.Encounter.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author Encounter
 * @date 2024/6/24 14:13
 */

/**
 * 目标：Collection集合的遍历方式三：JDK8开始新增的Lambda表达式
 */
public class CollectionDemo3
    {
        public static void main(String[] args)
            {
                Collection<String> c = new ArrayList<>();
                c.add("路明非");
                c.add("楚子航");
                c.add("夏弥");
                c.add("上杉绘梨衣");
                System.out.println(c);

                //default void forEach(Consumer<? super T> action): 结合Lambda表达式遍历集合
                /*c.forEach(new Consumer<String>()
                    {
                        @Override
                        public void accept(String string)
                            {
                                System.out.println(string);
                            }
                    });*/
                //c.forEach(( string)-> System.out.println(string));
                c.forEach(System.out::println);
            }
    }
