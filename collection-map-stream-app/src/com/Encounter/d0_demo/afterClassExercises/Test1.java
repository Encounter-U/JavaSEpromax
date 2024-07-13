package com.Encounter.d0_demo.afterClassExercises;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/28 20:26
 */

/**
 * 1.请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Map<String,Integer> map=new HashMap<>();
                map.put("路明非",22);
                map.put("楚子航",23);
                map.put("夏弥",25);
                map.put("上杉绘梨衣",18);
                map.put("零",22);
                System.out.println(map.remove("零"));
                System.out.println(map.get("上杉绘梨衣"));

            }
    }
