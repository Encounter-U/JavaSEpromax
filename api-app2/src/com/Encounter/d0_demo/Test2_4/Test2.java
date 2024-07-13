package com.Encounter.d0_demo.Test2_4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Encounter
 * @date 2024/6/21 20:10
 */

/**
 * 编写一个程序，该程序应用于需要展示多个时区时间，要求使用LocalDateTime类和Zoneld类实现一个能显示多时区的电子时钟，要求如下:
 * ①获取当前时区日期时间
 * ②将当前日期时间转换成纽约时区的日期时间
 * ③将当前日期时间转换成东京时区的日期时间
 * 4)显示当前日期时间和纽约时区的日期时间之间的时间差(以小时为单位)
 * ⑤)显示当前日期时间和东京时区的日期时间之间的时间差(以小时为单位
 * 要求输出以上操作的结果。
 * 提示:可以使用Duration类来计算时间差。
 */
public class Test2
    {
        public static void main(String[] args)
            {
                //任务1
                LocalDateTime ldt = LocalDateTime.now();
                System.out.println("当前时区日期时间：" + ldt);

                //任务2
                ZoneId zoneId = ZoneId.of("America/New_York");
                ZonedDateTime newYork = ZonedDateTime.now(zoneId);
                System.out.println("纽约时间：" + newYork);

                //任务3
                ZoneId zoneId1 = ZoneId.of("Asia/Tokyo");
                ZonedDateTime tokyo = ZonedDateTime.now(zoneId1);
                System.out.println("东京时间：" + tokyo);

                //任务4
                Duration d1 = Duration.between(ldt, newYork);
                System.out.println("当前日期时间与纽约时区的日期时间之差：" + d1.toHours() + "h");

                //任务5
                Duration d2 = Duration.between(ldt, tokyo);
                System.out.println("当前日期时间与东京时区的日期时间之差：" + d2.toHours() + "h");
            }
    }
