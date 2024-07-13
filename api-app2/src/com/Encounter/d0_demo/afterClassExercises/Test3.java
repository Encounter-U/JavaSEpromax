package com.Encounter.d0_demo.afterClassExercises;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Encounter
 * @date 2024/6/21 15:39
 */

/**
 * 请编写程序，获取当前系统日期，并将结果打印到控制台，要求展示格式为:xxxx年xx月xx日
 * 运行结果:
 * 2088年2月15日
 */
public class Test3
    {
        public static void main(String[] args)
            {
                Date now=new Date();
                long time = now.getTime();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
                System.out.println(sdf.format(time));
            }
    }
