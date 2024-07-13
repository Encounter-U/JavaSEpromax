package com.Encounter.d0_demo.Test2_4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/21 21:07
 */
public class Test
    {
//        private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss";
        public static void main(String[] args)
            {
                // 1, 获取用户输入的出发日期和时间
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入当前时区出发日期和时间，格式为 yyyy-MM-dd HH:mm:ss");
                String startStr = scanner.nextLine();
                // 获取用户输入的旅行时间(单位小时)
                System.out.println("请输入旅行时间（小时数）：");
                String travelHours = scanner.nextLine();
                // 获取用户输入的目的地时区
                System.out.println("请输入目的地时区（例如 America/New_York）：");
                String targetZoneId = scanner.nextLine();

                //2,根据目的 出发时间，旅行时长，目的地时区，计算目的地时间，格式化输出 yyyy-MM-dd HH:mm:ss
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                ZonedDateTime startTime = ZonedDateTime.of(LocalDateTime.parse(startStr, dtf), ZoneId.systemDefault());
                ZonedDateTime endTime = startTime.withZoneSameInstant(ZoneId.of(targetZoneId)).plusHours(Long.parseLong(travelHours));
                System.out.println("到达目的地的时间为:"+dtf.format(endTime));

            }


    }
