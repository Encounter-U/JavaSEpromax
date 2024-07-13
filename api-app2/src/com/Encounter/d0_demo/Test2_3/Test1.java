package com.Encounter.d0_demo.Test2_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/6/21 15:55
 */

/**
 * 编写一个程序，实现日期、时间的格式化功能
 * ①使用Date类和Calendar类输出当前日期格式为"yyyy-MM-dd HH:mm:ss”
 * ②计算在当前日期的基础上加上10天后的日期，格式为"yyyy-MM-dd HH:mm:ss”
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Date d = new Date();
                long time = d.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(sdf.format(time));

                Calendar c = Calendar.getInstance();
                c.add(Calendar.DAY_OF_YEAR, 10);
                System.out.println(sdf.format(c.getTime()));
            }
    }
