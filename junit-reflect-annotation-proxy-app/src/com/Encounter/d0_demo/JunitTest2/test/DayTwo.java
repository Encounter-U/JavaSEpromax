package com.Encounter.d0_demo.JunitTest2.test;

import java.util.Arrays;

/**
 * @author Encounter
 * @date 2024/07/22 09:48<br/>
 */
public class DayTwo
    {
        public static void main(String[] args)
            {
                /*System.out.println(Math.random());
                System.out.println(Runtime.getRuntime());
                System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024.0);
                System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024.0);*/
                
                /*System.out.println(new Date());
                System.out.println(Calendar.getInstance().getTime().getTime());*/
                
                /*System.out.println(LocalDate.now());
                
                System.out.println(LocalDate.of(2000, 1, 1));*/
                
                /*System.out.println(ZoneId.systemDefault());
                
                System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));*/
                
               /* System.out.println(Instant.now());
                
                Instant now = Instant.now();
                int nano = now.getNano();
                System.out.println(nano);
                System.out.println(now.plusNanos(111));*/
                
                /*LocalDate start = LocalDate.of(2029, 8, 10);
                LocalDate end = LocalDate.of(2029, 12, 15);
                
                // 1、创建Period对象，封装两个日期对象。
                Period period = Period.between(start, end);
                
                // 2、通过period对象获取两个日期对象相差的信息。
                System.out.println(period.getYears());
                System.out.println(period.getMonths());
                System.out.println(period.getDays());*/
                
                /*LocalDateTime start = LocalDateTime.of(2025, 11, 11, 11, 10, 10);
                LocalDateTime end = LocalDateTime.of(2029, 11, 11, 11, 11, 11);
                // 1、得到Duration对象
                Duration duration = Duration.between(start, end);
                
                // 2、获取两个时间对象间隔的信息
                System.out.println(duration.toDays());// 间隔多少天
                System.out.println(duration.toHours());// 间隔多少小时
                System.out.println(duration.toMinutes());// 间隔多少分
                System.out.println(duration.toSeconds());// 间隔多少秒
                System.out.println(duration.toMillis());// 间隔多少毫秒
                System.out.println(duration.toNanos());// 间隔多少纳秒*/
                
                /*double[] prices = {99.8, 128, 100};
                //                  0     1    2
                // 把所有的价格都打八折，然后又存进去。
                Arrays.setAll(prices, value -> prices[value] * 0.8);
                
                System.out.println(Arrays.toString(prices));*/
                
                // 1、准备好一个数组
                int[] arr = {5, 1, 3, 2};
                //           0  1  2  3
                
                // 2、控制选择几轮
                for (int i = 0; i < arr.length - 1; i++) {
                    // i = 0 第一轮    j = 1 2 3
                    // i = 1 第二轮    j = 2 3
                    // i = 2 第三轮    j = 3
                    // 3、控制每轮选择几次。
                    for (int j = i + 1; j < arr.length; j++) {
                        // 判断当前位置是否大于后面位置处的元素值，若大于则交换。
                        if(arr[i] > arr[j]){
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
    }
