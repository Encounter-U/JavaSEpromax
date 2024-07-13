package com.Encounter.d0_demo.Test2_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 20:26
 */

/**
 * 编写一个程序计算机票到达的目的地的当地时间
 * 1.输入出发日期和时间、目的地时区、旅行时间(小时数)
 * 2.计算并格式化输出到达目的地的当地日期和时间，时间格式为:yyyy-MM-dd HH:mm:ss
 * 代码实现可以使用DateTimeFormatter类、Zoneld类、ZonedDateTime类的相关方法
 */
public class Test3
    {
        public static void main(String[] args) throws ParseException
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("输入出发时间（格式：yyyyMMddHHmmss）：");
                String startTime = sc.next();
                System.out.print("输入目的地时区：");
                String timeZoneStr = sc.next();
                System.out.print("输入旅行时间(h)：");
                int hours = sc.nextInt();
                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
                LocalDateTime time = LocalDateTime.parse(startTime, formatter);//出发时间
                ZonedDateTime zonedDateTime = ZonedDateTime.of(time, ZoneId.systemDefault());
                ZoneId zoneId = ZoneId.of(timeZoneStr);
                ZonedDateTime zonedDateTime1 = zonedDateTime.plusHours(hours);
                System.out.println(zonedDateTime1.withZoneSameInstant(zoneId).format(formatter1));
            }
    }
