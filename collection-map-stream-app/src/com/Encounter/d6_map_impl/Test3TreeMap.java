package com.Encounter.d6_map_impl;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Encounter
 * @date 2024/6/29 10:16
 */
public class Test3TreeMap
    {
        public static void main(String[] args)
            {
                Map<Student,String> map=new TreeMap<>((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()));
                map.put(new Student("路明非",22,178.0),"龙王");
                map.put(new Student("路明非",24,178.0),"世界树");
                map.put(new Student("楚子航",23,178.0),"A级");
                map.put(new Student("夏弥",22,178.0),"A级");
                System.out.println(map);
            }
    }
