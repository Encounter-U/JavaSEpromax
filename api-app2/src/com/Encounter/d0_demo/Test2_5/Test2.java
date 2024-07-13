package com.Encounter.d0_demo.Test2_5;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Encounter
 * @date 2024/6/22 10:41
 */

/**
 * 开发一个在线考试系统，要求对考生的成绩进行排名。
 * ①考生信息存储在一个数组中，每个元素包含考生姓名和成绩两个属性。
 * ②编写一个方法，能够接收一个考生信息数组，并按照成绩从高到低进行排序，然后输出每个考生的排名和姓名。
 * 提示:可以使用Arrays类的sort方法进行排序，使用Comparator接口自定义排序规则，然后遍历排序后的数组，输出每个考生的排名和姓名。
 */
public class Test2
    {
        public static void main(String[] args)
            {
                Examination[] examinations = new Examination[5];
                examinations[0] = new Examination("路明非", 60);
                examinations[1] = new Examination("楚子航", 120);
                examinations[2] = new Examination("凯撒", 110);
                examinations[3] = new Examination("上杉绘梨衣", 80);
                examinations[4] = new Examination("陈墨瞳", 105);
                Arrays.sort(examinations, new Comparator<Examination>()
                    {
                        @Override
                        public int compare(Examination o1, Examination o2)
                            {
                                return o2.getScore() - o1.getScore();
                            }
                    });
                for (int i = 0; i < examinations.length; i++)
                    {
                        System.out.println("排名："+(i+1));
                        System.out.println("姓名："+examinations[i].getName());
                        System.out.println("成绩："+examinations[i].getScore());
                        System.out.println("=======================");
                    }
            }
    }
