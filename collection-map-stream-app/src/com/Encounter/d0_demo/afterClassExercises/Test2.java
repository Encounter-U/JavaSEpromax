package com.Encounter.d0_demo.afterClassExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/28 20:28
 */

/**
 * 2.往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Map<String, Integer> map = new HashMap<>();
                map.put("路明非", 22);
                map.put("楚子航", 23);
                map.put("夏弥", 25);
                map.put("上杉绘梨衣", 18);
                map.put("零", 22);
                Set<Map.Entry<String, Integer>> entries = map.entrySet();
                for (Map.Entry<String, Integer> entry : entries)
                    {
                        System.out.println(entry.getKey() + "=" + entry.getValue());
                    }
                Set<String> keySet = map.keySet();
                for (String s : keySet)
                    {
                        System.out.println(s + "=" + map.get(s));
                    }
            }
    }
