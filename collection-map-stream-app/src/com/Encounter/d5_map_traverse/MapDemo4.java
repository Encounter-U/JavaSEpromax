package com.Encounter.d5_map_traverse;

/**
 * @author Encounter
 * @date 2024/6/28 17:17
 */

import java.util.*;

/**
 * Map集合案例，统计投票人数
 */
public class MapDemo4
    {
        public static void main(String[] args)
            {
                //1.把80个学生选择的景点数据拿到程序中
                List<String> data = new ArrayList<>();
                String[] selects = {"A", "B", "C", "D"};
                Random r = new Random();
                for (int i = 0; i < 80; i++)
                    {
                        //每次模拟一个学生选择一个景点，存入到集合中去
                        int index = r.nextInt(4);
                        data.add(selects[index]);
                    }
                System.out.println(data);
                Map<String, Integer> map = new HashMap<>();
                for (String s : data)
                    {
                        if (map.containsKey(s))//统计过，值加一
                            map.put(s, map.get(s) + 1);
                        else
                            map.put(s, 1);
                    }
                System.out.println(map);//第一次存，值为1
            }
    }
