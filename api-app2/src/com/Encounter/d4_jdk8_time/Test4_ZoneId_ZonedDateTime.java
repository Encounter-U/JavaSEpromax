package com.Encounter.d4_jdk8_time;

/**
 * @author Encounter
 * @date 2024/6/21 17:12
 */

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * 了解时区和带时区的时间<br/>
 * 1.ZoneId的常见方法：<br/>
 * public static ZoneId systemDefault():获取系统默认时区<br/>
 * public static Set<String> getAvailableZoneIds():获取Java支持的全部时区Id<br/>
 * public static ZoneId of(String zoneId):  把某个时区id封装成ZoneId对象<br/>
 * 2.ZoneDateTime：带时区的时间<br/>
 * public static ZoneDateTime now(ZoneId zone):获取某个时区的ZoneDateTime对象<br/>
 * public static ZoneDataTime now():获取系统默认时区的ZoneDateTime对象
 */
public class Test4_ZoneId_ZonedDateTime
    {
        public static void main(String[] args)
            {
                //1.ZoneId的常见方法：
                //public static ZoneId systemDefault():获取系统默认时区
                ZoneId zoneId = ZoneId.systemDefault();
                System.out.println(zoneId.getId());
                System.out.println(zoneId);

                //public static Set<String> getAvailableZoneIds():获取Java支持的全部时区Id
                Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
                System.out.println(availableZoneIds);

                //public static ZoneId of(String zoneId):  把某个时区id封装成ZoneId对象
                ZoneId zoneId1 = ZoneId.of("America/New_York");
                System.out.println(zoneId1);

                //2.ZoneDateTime：带时区的时间
                // public static ZoneDateTime now(ZoneId zone):获取某个时区的ZoneDateTime对象
                ZonedDateTime now = ZonedDateTime.now(zoneId1);//美国当前时间
                System.out.println(now);

                System.out.println(ZonedDateTime.now(Clock.systemUTC()));//世界标准时间

                // public static ZoneDataTime now():获取系统默认时区的ZoneDateTime对象
                System.out.println(ZonedDateTime.now());

            }
    }
