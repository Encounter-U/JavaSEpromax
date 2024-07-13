package com.Encounter.d6_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/29 9:58
 */
public class Test2LinkedHashMap
    {
        public static void main(String[] args)
            {
                Map<String,Integer> map=new LinkedHashMap<>();//有序，不重复，无索引
                map.put("手表",100);
                map.put("手表",220);//后面的数据会覆盖前面的数据
                map.put("手机",220);
                map.put("Java",220);
                map.put(null,null);
                System.out.println(map);
            }
    }
