package com.Encounter.d3_time;

/**
 * @author Encounter
 * @date 2024/6/21 14:27
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 掌握SimpleFormat的使用
 */
public class Test2SimpleDateFormat
    {
        public static void main(String[] args) throws ParseException
            {
                //1.准备一些时间
                Date d = new Date();
                System.out.println(d);

                long time = d.getTime();
                System.out.println(time);

                //2.格式化日期对象，和时间 毫秒值
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

                String rs = sdf.format(d);
                String rs2 = sdf.format(time);
                System.out.println(rs);
                System.out.println(rs2);

                System.out.println("=====================");

                //掌握SimpleDateFormat解析字符串时间 成为日期对象
                String dateStr="2024-06-21 14:36:00";
                //创建简单日期格式化对象，指定的时间格式必须与被解析的时间格式一样，否则会出bug
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date d2=sdf2.parse(dateStr);
                System.out.println(d2);
            }
    }
