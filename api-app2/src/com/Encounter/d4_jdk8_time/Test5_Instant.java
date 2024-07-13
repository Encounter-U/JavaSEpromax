package com.Encounter.d4_jdk8_time;

/**
 * @author Encounter
 * @date 2024/6/21 18:27
 */

import java.time.Instant;

/**
 * 掌握Instant的使用
 */
public class Test5_Instant
    {
        public static void main(String[] args)
            {
                //1.创建Instant的对象，获取此刻时间信息
                Instant now = Instant.now();//不可变对象

                //2.获取总秒数
                long second = now.getEpochSecond();
                System.out.println(second);

                //3.不够1s的ns数
                int nano = now.getNano();
                System.out.println(nano);

                System.out.println(now);

                System.out.println(now.plusNanos(111));

                //Instant对象的作用：做代码的性能分析，或者记录用户的操作时间点
                Instant now1 = Instant.now();
                //代码执行。。。
                Instant now2 = Instant.now();
            }
    }
