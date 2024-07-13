package com.Encounter.d3_time;

/**
 * @author Encounter
 * @date 2024/6/21 14:53
 */

import java.util.Calendar;
import java.util.Date;

/**
 * 掌握Calendar的使用和特点
 */
public class Test4Calendar
    {
        public static void main(String[] args)
            {
                //1.得到系统此刻时间对应的日历对象
                Calendar now = Calendar.getInstance();
                System.out.println(now);

                //2.获取日历中的某个信息
                int year = now.get(Calendar.YEAR);
                System.out.println(year);

                int days = now.get(Calendar.DAY_OF_MONTH);
                System.out.println(days);

                //3.拿到日历中的日期对象
                Date d=now.getTime();
                System.out.println(d);

                //4.拿到时间毫秒值
                long time = now.getTimeInMillis();
                System.out.println(time);

                //5.修改日历中某个信息
                now.set(Calendar.MONTH,9);//从0开始，修改到10月份
                now.set(Calendar.DAY_OF_YEAR,165);//修改到一年中的第125天
                System.out.println(now);

                //6.为某个信息增加或减少多少
                now.add(Calendar.YEAR,10);
                now.add(Calendar.YEAR,-20);
                System.out.println(now);
            }
    }
