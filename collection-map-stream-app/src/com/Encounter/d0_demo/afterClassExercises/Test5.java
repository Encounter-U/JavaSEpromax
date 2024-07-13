package com.Encounter.d0_demo.afterClassExercises;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/28 20:43
 */

/**
 * 5.有2个数组，第一个数组内容为:[黑龙江省,浙江省,江西省,广东省,福建省]，第二个数组为:[哈尔滨,杭州,南昌
 * 广州,福州]，将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨
 * 浙江省=杭州,..}。
 */
public class Test5
    {
        public static void main(String[] args)
            {
                String[] keys = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
                String[] values = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
                Map<String, String> map = new HashMap<>();
                for (int i = 0; i < keys.length; i++)
                    {
                        map.put(keys[i], values[i]);
                    }
                map.forEach((k, v) -> System.out.println(k + "=" + v));
                System.out.println(map);
            }
    }
