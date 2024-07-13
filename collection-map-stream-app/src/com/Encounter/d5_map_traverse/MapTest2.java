package com.Encounter.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Encounter
 * @date 2024/6/28 15:02
 */

/**
 * Map集合的第二种遍历方式：键值对
 */
public class MapTest2
    {
        public static void main(String[] args)
            {
                //准备一个Map集合
                Map<String, Double> map = new HashMap<>();
                map.put("路明非", 178.0);
                map.put("楚子航", 182.0);
                map.put("夏弥", 169.8);
                map.put("上杉绘梨衣", 165.7);

                //调用Map集合提供entrySet方法，把Map集合转换成键值对类型的Set集合
                Set<Map.Entry<String, Double>> entries = map.entrySet();
                for (Map.Entry<String, Double> entry : entries)
                    {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        System.out.println(key + "=" + value);
                    }

            }
    }
