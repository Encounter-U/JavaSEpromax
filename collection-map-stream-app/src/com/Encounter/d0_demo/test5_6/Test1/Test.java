package com.Encounter.d0_demo.test5_6.Test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Encounter
 * @date 2024/6/29 14:17
 */

/**
 * 创建一个类，在main方法中完成如下操作
 * ①创建一个集合，存储多个字符串元素{“"张三丰”，"张无忌”，"张翠山"，"王二麻子"，"张良”，"谢广坤”}
 * 2)使用stream流把集合中所有以"张"开头的元素进行打印
 * ③使用stream流把"张"开头的集合中的元素长度为3的元素进行遍历打印
 */
public class Test
    {
        public static void main(String[] args)
            {
                List<String> names=new ArrayList<>();
                Collections.addAll(names,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");
                names.stream().filter(s->s.startsWith("张")).forEach(System.out::println);
                names.stream().filter(s->s.startsWith("张")&&s.length()==3).forEach(System.out::println);
            }
    }
