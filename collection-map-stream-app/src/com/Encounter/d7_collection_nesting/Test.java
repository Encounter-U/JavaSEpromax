package com.Encounter.d7_collection_nesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Encounter
 * @date 2024/6/29 10:27
 */
public class Test
    {
        public static void main(String[] args)
            {
                List<String> heNan=new ArrayList<>();
                heNan.add("郑州市");
                heNan.add("南阳市");
                heNan.add("商丘市");
                heNan.add("开封市");

                Map<String,List<String>> map=new HashMap<>();
                map.put("河南省",heNan);
                System.out.println(map);
            }
    }
