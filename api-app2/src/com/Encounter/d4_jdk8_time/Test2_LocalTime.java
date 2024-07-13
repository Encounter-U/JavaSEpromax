package com.Encounter.d4_jdk8_time;

import java.time.LocalTime;

/**
 * @author Encounter
 * @date 2024/6/21 16:35
 */
public class Test2_LocalTime
    {
        public static void main(String[] args)
            {
                //0.获取本地时间对象
                LocalTime lt=LocalTime.now();
                System.out.println(lt);

                //1.获取时间中的信息
                int hour = lt.getHour();
                int minute = lt.getMinute();
                int second = lt.getSecond();
                int nano = lt.getNano();//纳秒

                //2.修改时间：withHours、withMinute、withSecond、withNanos


                //3.加多少：plusHours...


                //4.减多少：minusHours...


                //5.获取指定事件的LocalTime对象
                //public static LocalTime of(int hour,int minute,int second)


                //6.判断2个日期对象，是否相等，在前还是在后：equals isBefore isAfter
            }
    }
