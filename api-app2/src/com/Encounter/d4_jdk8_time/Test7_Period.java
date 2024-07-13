package com.Encounter.d4_jdk8_time;

/**
 * @author Encounter
 * @date 2024/6/21 19:22
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * 掌握Period的作用：计算两个日期相差的年数、月数、天数
 */
public class Test7_Period
    {
        public static void main(String[] args)
            {
                LocalDate ld1=LocalDate.of(2023,9,13);
                LocalDate ld2=LocalDate.of(2029,10,19);
                //1.创建Period对象，封装两个日期对象
                Period period = Period.between(ld1, ld2);

                //2.通过Period对象获取两个日期对象相差的信息
                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();
                System.out.println(years);
                System.out.println(months);
                System.out.println(days);
            }
    }
