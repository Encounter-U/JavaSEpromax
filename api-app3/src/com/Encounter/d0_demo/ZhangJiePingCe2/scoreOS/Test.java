package com.Encounter.d0_demo.ZhangJiePingCe2.scoreOS;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/6/23 14:41
 */

/**
 * 设计一个成绩管理系统
 * ①该系统使用数组记录多个学生的成绩信息
 * ②编写学生对象包含姓名、语文、数学、英语成绩，和查询总分的方法
 * ③编写测试类实现查询学生排名等功能。要求使用Lambda表达式
 * ⑥)编写CompareByData类，在里面定义比较方法，使用实例方法引用简化lambda表达式.
 */
public class Test
    {
        public static void main(String[] args)
            {
                Student[] students = {
                        new Student("路明非", 60, 70, 80),
                        new Student("楚子航", 120, 120, 120),
                        new Student("凯撒  ", 100, 116, 120),
                        new Student("陈墨瞳", 113, 96, 106),
                        new Student("零    ", 119, 115, 116),
                        new Student("上杉绘梨衣", 120, 120, 0),
                };
                //根据语文成绩排名
                Arrays.sort(students,CompareByData::rankByChineseScore);
                System.out.println("根据语文成绩排名：");
                System.out.println(Arrays.toString(students));
                //根据数学成绩排名
                Arrays.sort(students,CompareByData::rankByMathScore);
                System.out.println("根据数学成绩排名：");
                System.out.println(Arrays.toString(students));
                //根据英语成绩排名
                Arrays.sort(students,CompareByData::rankByEnglishScore);
                System.out.println("根据英语成绩排名：");
                System.out.println(Arrays.toString(students));
                //根据总分排名
                Arrays.sort(students,CompareByData::rankBySumScore);
                System.out.println("根据总分排名：");
                System.out.println(Arrays.toString(students));
            }
    }
