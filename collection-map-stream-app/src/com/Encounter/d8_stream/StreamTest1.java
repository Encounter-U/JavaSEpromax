package com.Encounter.d8_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Encounter
 * @date 2024/6/29 10:51
 */

/**
 * 初步体验Stream流的方便与快捷
 */
public class StreamTest1
    {
        public static void main(String[] args)
            {
                List<String> names = new ArrayList<>();
                Collections.addAll(names, "路明非", "楚子航", "夏弥", "上杉绘梨衣", "路名");
                System.out.println(names);

                //找出姓路且且名字是三个字的，存入到一个新集合
                List<String> list = new ArrayList<>();
                for (String name : names)
                    {
                        if (name.startsWith("路") && name.length() == 3)
                            list.add(name);
                    }
                System.out.println(list);

                //使用Stream流操作
                List<String> list1 = names.stream().filter(s -> s.startsWith("路") && s.length() == 3).collect(Collectors.toList());
                //List<String> list1 = names.stream().filter(s -> s.startsWith("路")).filter(s -> s.length() == 3).collect(Collectors.toList());
                System.out.println(list1);

            }
    }
