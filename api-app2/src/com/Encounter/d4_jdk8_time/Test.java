package com.Encounter.d4_jdk8_time;

/**
 * @author Encounter
 * @date 2024/6/21 15:05
 */

import java.util.Calendar;
import java.util.Date;

/**
 * 传统的时间类（Date、SimpleDateFormat、Calendar）存在如下问题：<br/>
 * 1.设计不合理，使用不方便，很多都被淘汰了<br/>
 * 2.都是可变对象，修改后会丢失最开始的时间信息<br/>
 * 3.线程不安全<br/>
 * 4.不能精确到纳秒，只能精确到毫秒
 */
public class Test
    {
        public static void main(String[] args)
            {
                //1.
                Date d = new Date();
                //System.out.println(d.getYear() + 1900);

                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                System.out.println(year);

                //2.

                //3.

                //4.
                //1s=1000ms  1ms=1000微秒 1微秒=1000ns
            }
    }
