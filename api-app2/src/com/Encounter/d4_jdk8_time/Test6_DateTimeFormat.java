package com.Encounter.d4_jdk8_time;

/**
 * @author Encounter
 * @date 2024/6/21 19:03
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 掌握JDK 8新增的DateTimeFormatter格式化器的用法
 */
public class Test6_DateTimeFormat
    {
        public static void main(String[] args)
            {
                //1.创建一个日期时间格式化器对象
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

                //2.对时间进行格式化
                LocalDateTime now = LocalDateTime.now();

                String format = dateTimeFormatter.format(now);//正向格式化
                System.out.println(format);

                //3.格式化时间
                String format1 = now.format(dateTimeFormatter);//反向格式化
                System.out.println(format1);

                //4.解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析
                String dateStr="2024年12月12日 12:12:12";
                LocalDateTime parse = LocalDateTime.parse(dateStr, dateTimeFormatter);
                System.out.println(parse);
            }
    }
