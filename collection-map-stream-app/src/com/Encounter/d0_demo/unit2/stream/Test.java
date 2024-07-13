package com.Encounter.d0_demo.unit2.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Encounter
 * @date 2024/6/29 16:21
 */

/**
 * 编写一个测试类，完成一下功能
 * 1.定义集合List，添加以下数据:"王佳乐""张三丰""王思聪""张飞"“刘晓敏""张靓颖""王敏
 * 2.使用Stream流 筛选出所有的“张”姓学员并用Stream保存
 * 3.使用Stream流 筛选出所有的“王”姓学员并用Stream保存
 * 4.将两个流合并为一个流后找出名字是3个字的名字数量并将结果打印在控制台
 */
public class Test
    {
        public static void main(String[] args)
            {
                List<String> names=new ArrayList<>();
                Collections.addAll(names,"王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏");
                Stream<String> z = names.stream().filter(s -> s.startsWith("张"));
                Stream<String> w = names.stream().filter(s -> s.startsWith("王"));
                System.out.println(Stream.concat(z, w).filter(s -> s.length() == 3).count());
            }
    }
