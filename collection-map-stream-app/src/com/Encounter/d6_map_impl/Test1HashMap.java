package com.Encounter.d6_map_impl;

/**
 * @author Encounter
 * @date 2024/6/28 17:33
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 掌握Map集合下的实现类，HashMap集合的底层原理
 */
public class Test1HashMap
    {
        public static void main(String[] args)
            {
                Map<Student,String> map=new HashMap<>();
                map.put(new Student("路明非",22,178.0),"龙王");
                map.put(new Student("路明非",22,178.0),"世界树");
                map.put(new Student("楚子航",22,178.0),"A级");
                map.put(new Student("夏弥",22,178.0),"A级");
                System.out.println(map);
            }
    }
