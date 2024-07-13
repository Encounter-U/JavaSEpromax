package com.Encounter.d5_map_traverse;

/**
 * @author Encounter
 * @date 2024/6/28 14:45
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 掌握Map集合的遍历方式1：键找值
 */
public class MapTest1
    {
        public static void main(String[] args)
            {
                //准备一个Map集合
                Map<String, Double> map = new HashMap<>();
                map.put("路明非", 178.0);
                map.put("楚子航", 182.0);
                map.put("夏弥", 169.8);
                map.put("上杉绘梨衣", 165.7);
                //1.获取map集合的全部键
                Set<String> keys = map.keySet();
                //遍历全部的键，根据键获取其对应的值
                for (String s : keys)
                    {
                        //根据键获取对应的值
                        System.out.println(s + "=" + map.get(s));
                    }
            }
    }
