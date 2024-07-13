package com.Encounter.d0_demo.Test2_4;

import java.time.*;

/**
 * @author Encounter
 * @date 2024/6/21 19:48
 */

/**
 * 编写一个ava程序，使用LocalDate、LocalTime、LocalDateTime、Zoneld、ZonedDateTime和Instant类完成以下操作:
 * ①获取当前日期和时间，并输出当前日期，当前时间，当前日期和时间;
 * ②获取当前时区，并打印输出;
 * ③获取指定时区的指定时间(例如纽约时区)，并打印输出;
 * 4)将当前日期时间转换成指定时区(例如纽约时区)的日期时间，并打印输出
 * ⑤获取当前时间戳，并打印输出;
 * ⑥将当前时间戳转换成指定日期时间和时区(例如上海时区)的日期时间，并打印输出。
 */
public class Test1
    {
        public static void main(String[] args)
            {
                System.out.println("任务1：");
                System.out.println("当前日期：" + LocalDate.now());
                System.out.println("当前时间：" + LocalTime.now());
                System.out.println("当前日期和时间：" + LocalDateTime.now());

                System.out.println("任务2：");
                System.out.println("当前时区：" + ZoneId.systemDefault());

                System.out.println("任务3：");
                ZoneId zoneId = ZoneId.of("America/New_York");
                ZonedDateTime now = ZonedDateTime.now(zoneId);
                System.out.println("纽约时区时间：" + now);

                System.out.println("任务4：");
                ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
                System.out.println("当前日期时间：" + zonedDateTime);
                System.out.println("纽约时区时间：" + zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York")));

                //任务5
                System.out.println("任务5：");
                Instant now1 = Instant.now();
                System.out.println("当前时间戳："+now1);

                //任务6
                System.out.println("任务6：");
                System.out.println("当前时间戳：" + now1);
                System.out.println("上海时区时间：" + now1.atZone(ZoneId.of("Asia/Shanghai")));

            }
    }
