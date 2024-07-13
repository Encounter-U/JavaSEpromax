package com.Encounter.d1_math;

/**
 * @author Encounter
 * @date 2024/6/21 10:48
 */

/**
 * 了解下System类的常见方法
 * 1.public static void exit(int status):
 *     终止当前运行的Java虚拟机
 *     该参数用作状态代码；按照惯例，非零状态码表示异常终止
 * 2.public static long currentTimeMillis():
 *     获取当前系统时间
 *     返回的long类型的时间毫秒值：指的是从1970-1-1 0:0:0开始走到此刻的总的毫秒值，1s=1000ms
 */
public class SystemTest
    {
        public static void main(String[] args)
            {
                //1.人为终止虚拟机
                /*System.exit(0);
                System.out.println("====================");*/

                //2.
                long time1 = System.currentTimeMillis();
                System.out.println(time1);

                for (int i = 0; i < 10000; i++)
                    {
                        System.out.println();
                    }

                long time2 = System.currentTimeMillis();
                System.out.println(time2);

                System.out.println((time2-time1)/1000.0);
            }
    }
