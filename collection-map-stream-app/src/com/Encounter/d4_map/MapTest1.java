package com.Encounter.d4_map;

/**
 * @author Encounter
 * @date 2024/6/28 13:38
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 掌握Map集合的特点
 */
public class MapTest1
    {
        public static void main(String[] args)
            {
                //Map<String,Integer> map=new HashMap<>();//一行经典代码，按照键无序，不重复，无索引
                Map<String,Integer> map=new LinkedHashMap<>();//有序，不重复，无索引
                map.put("手表",100);
                map.put("手表",220);//后面的数据会覆盖前面的数据
                map.put("手机",220);
                map.put("Java",220);
                map.put(null,null);
                System.out.println(map);

                Map<Integer,String> map1=new TreeMap<>();//可排序，不重复，无索引
                map1.put(200,"手表");
                map1.put(200,"手机");
                map1.put(210,"手机");
                map1.put(202,"Java");
                //map1.put(null,null);
                System.out.println(map1);

            }
    }
