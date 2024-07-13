package com.Encounter.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Encounter
 * @date 2024/6/21 19:31
 */
public class Test8_Duration
    {
        public static void main(String[] args)
            {
                LocalDateTime ldt1=LocalDateTime.of(2025,6,28,12,21,12);
                LocalDateTime ldt2=LocalDateTime.of(2026,7,29,15,5,5);
                //1.得到Duration对象
                Duration duration = Duration.between(ldt1, ldt2);

                //2.获取两个时间对象间隔的信息
                System.out.println(duration.toDays());
                System.out.println(duration.toHours());
                System.out.println(duration.toMinutes());
                System.out.println(duration.toSeconds());//s
                System.out.println(duration.toMillis());//ms
                System.out.println(duration.toNanos());//ns
            }
    }
