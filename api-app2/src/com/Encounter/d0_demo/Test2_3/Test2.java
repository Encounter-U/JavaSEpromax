package com.Encounter.d0_demo.Test2_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 15:59
 */

/**
 * 公司周日周一要求必须有两个人值班，现在要进行排班，编写一个程序，实现一个星期计算器，计算出某个日期的周日和周一是哪一天。
 * ①要求使用Calendar类和SimpleDateFormat类
 * ②根据用户输入的日期字符串，计算出该日期所在周的周一和周日的日期
 * ③并输出格式为"yyyy-MM-dd"的日期字符串。
 * 提示:java里面星期日是一周的开始
 */
public class Test2
    {
        public static void main(String[] args) throws ParseException
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入日期（格式：xxxx-xx-xx）：");
                String strDate = sc.next();
                //转换格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date time = sdf.parse(strDate);
                //更改日期
                Calendar c = Calendar.getInstance();
                c.set(Calendar.YEAR, time.getYear() + 1900);
                c.set(Calendar.MONTH, time.getMonth());
                c.set(Calendar.DAY_OF_MONTH, time.getDay());
                //寻找周日和周一
                c.set(Calendar.DAY_OF_WEEK, 1);
                String sunday = sdf.format(c.getTime());
                c.set(Calendar.DAY_OF_WEEK, 2);
                String monday = sdf.format(c.getTime());
                //输出
                System.out.println("周日为" + sunday);
                System.out.println("周一为" + monday);
            }
    }
