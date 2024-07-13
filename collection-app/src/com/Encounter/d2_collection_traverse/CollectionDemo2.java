package com.Encounter.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Encounter
 * @date 2024/6/24 14:13
 */

/**
 * 目标：Collection集合的遍历方式二：增强for遍历
 */
public class CollectionDemo2
    {
        public static void main(String[] args)
            {
                Collection<String> c = new ArrayList<>();
                c.add("路明非");
                c.add("楚子航");
                c.add("夏弥");
                c.add("上杉绘梨衣");
                System.out.println(c);

                //使用增强for遍历集合或数组
                for (String ele : c)
                    System.out.println(ele);

                String[] name={"路明非","楚子航","夏弥","上杉绘梨衣"};
                for (String ele:name)
                    System.out.println(ele);
            }
    }
