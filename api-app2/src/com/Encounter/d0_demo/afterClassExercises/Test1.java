package com.Encounter.d0_demo.afterClassExercises;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/6/21 15:32
 */

/**
 * 请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08.
 */
public class Test1
    {
        public static void main(String[] args)
            {
                Date d=new Date();
                long time = d.getTime();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(sdf.format(time));
            }
    }
