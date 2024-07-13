package com.Encounter.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Encounter
 * @date 2024/6/21 16:35
 */
public class Test3_LocalDateTime
    {
        public static void main(String[] args)
            {
                //0.获取本地时间对象
                LocalDateTime ldt = LocalDateTime.now();
                System.out.println(ldt);

                //1.获取时间中的信息
                int year = ldt.getYear();
                int month = ldt.getMonthValue();//月(1-12)
                int day = ldt.getDayOfMonth();//日
                int dayOfYear = ldt.getDayOfYear();//一年中的第几天
                int dayOfWeek = ldt.getDayOfWeek().getValue();//周几
                int hour = ldt.getHour();
                int minute = ldt.getMinute();
                int second = ldt.getSecond();
                int nano = ldt.getNano();//纳秒

                //2.修改时间：withYear、withMonth、withDayOfMonth、withDayOfYear、withHours、withMinute、withSecond、withNanos


                //3.加多少：plusYears、plusMonths、plusDays、plusWeeks、plusHours...


                //4.减多少：minusYears、minusMonths、minusDays、minusWeeks、minusHours...


                //5.获取指定事件的LocalTime对象
                //public static LocalDateTime of(int year,int month,int dayOfMonth,int hour,int minute,int second,int nanoOfSecond)


                //6.判断2个日期对象，是否相等，在前还是在后：equals isBefore isAfter


                //7.可以把LocalDateTime转换为LocalDate和LocalTime
                //public LocalDate toLocalDate()
                //public LocalTime toLocalTime()
                //public static LocalDateTime of(LocalDate date,LocalTime time)
                LocalDate localDate = ldt.toLocalDate();
                LocalTime localTime = ldt.toLocalTime();
                LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
                System.out.println(localDate);
                System.out.println(localTime);
                System.out.println(localDateTime);
            }
    }
