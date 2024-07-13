package com.Encounter.d0_demo.Test2_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 16:20
 */

/**
 * 公司要根据年份和周数确定生产计划，请编写一个程序，实现一个根据年份和周数自动计算日期的计算器
 * 使用Calendar类和SimpleDateFormat类
 * ②根据用户输入的年份和周数，计算出该周的周一和周日的日期
 * ③并输出格式为"yyyy-MM-dd"的日期字符串。
 * 提示:iava里面星期日是一周的开始
 */
public class Test3
    {
        public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入年份：");
                int year = sc.nextInt();
                System.out.print("请输入周数：");
                int weekNum = sc.nextInt();
                //转换格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //更改日期
                Calendar c = Calendar.getInstance();
                c.set(Calendar.YEAR, year);
                c.set(Calendar.WEEK_OF_YEAR, weekNum);
                //寻找周日和周一
                c.set(Calendar.DAY_OF_WEEK, 1);
                String sunday = sdf.format(c.getTime());
                c.set(Calendar.DAY_OF_WEEK, 2);
                String monday = sdf.format(c.getTime());
                //输出
                System.out.println("周日为：" + sunday);
                System.out.println("周一为：" + monday);
            }
    }
